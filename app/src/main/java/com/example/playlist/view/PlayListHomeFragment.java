package com.example.playlist.view;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.playlist.PlayListApplication;
import com.example.playlist.R;
import com.example.playlist.model.network.PlaylistService;
import com.example.playlist.presenter.Response;
import com.example.playlist.presenter.TracksItem;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * This is base fragment user to show the actual content in recycler view.
 *
 * This class take care to call to server in background thread by using Rx-java and once we
 * got the response that we are loading in main thread
 *
 * This consists below view
 * 1. Swipe to refresh
 * 2. Recycler view
 * 3. Progress bar view
 */

public class PlayListHomeFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private PlaylistAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;
    private List<TracksItem> mSampleItemList;
    private PlaylistService mPlaylistService;
    private ProgressBar mProgress;
    private ConnectivityManager mManager;
    private int SHOW_PROGRESS = 1001;
    private SwipeRefreshLayout mSwipeRefreshLayout;

    /**
     * In order to show progress bar when launching screen
     */
    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == SHOW_PROGRESS) {
                progressBarVisibility(View.VISIBLE);
            }
        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSampleItemList = new ArrayList<>();
        mPlaylistService = ((PlayListApplication) getActivity().getApplication()).getRetrofit();
        mManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        mManager.registerDefaultNetworkCallback(networkCallback);

        makeNetworkCallForResponse();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.recyclerview);
        mProgress = view.findViewById(R.id.progress);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                mLayoutManager.getOrientation());
        mRecyclerView.addItemDecoration(dividerItemDecoration);

        //size lookup may be required
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new PlaylistAdapter(getContext(), mSampleItemList);
        mRecyclerView.setAdapter(mAdapter);
        if (!((PlaylistMainActivity)getActivity()).isNetworkConnected()) {
            progressBarVisibility(View.GONE);
        }

        //swipe to refresh
        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        mSwipeRefreshLayout.setOnRefreshListener(mSwipeRefreshListener);
    }

    /**
     * Progress bar visibility functionality
     *
     * @param visibility
     */
    public void progressBarVisibility(int visibility) {
        if (mProgress != null)
            mProgress.setVisibility(visibility);
    }

    /**
     * Network connectivity listener. This will take care to show the snack bar based on connection
     */
    private final ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() {
        @Override
        public void onAvailable(Network network) {
            super.onAvailable(network);

            // we've got a connection, remove callbacks (if we have posted any)
            mHandler.removeCallbacks(endCall);
            if (mSampleItemList == null || mSampleItemList.isEmpty()) {
                mHandler.sendEmptyMessage(SHOW_PROGRESS);
                makeNetworkCallForResponse();
            }
        }

        @Override
        public void onLost(Network network) {
            super.onLost(network);

            // Schedule an event to take place in a second
            mHandler.postDelayed(endCall, 1000);
        }
    };

    private final Runnable endCall = new Runnable() {
        @Override
        public void run() {
            // if execution has reached here - feel free to cancel the call
            // because no connection was established in a second
            ( (PlaylistMainActivity) getActivity()).showSnackBar(true, false);
        }
    };

    private void makeNetworkCallForResponse() {
        if (((PlaylistMainActivity)getActivity()).isNetworkConnected()) {
            Observable<Response> observable = mPlaylistService.getPlaylist("https://api.soundcloud.com/playlists/79670980"
                    , "i71BoBoxTxlbVYvnt7O2reL86DynpqT3"
                    , "Mh6G90LOOuz1Vd04gBsNQMmHFwocWUzk")
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread());
            observable.subscribe(new Observer<Response>() {
                @Override
                public void onSubscribe(Disposable d) {
                }

                @Override
                public void onNext(Response playList) {
                    mSampleItemList.addAll(playList.getTracks());
                    mAdapter.notifyDataSetChanged();
                    progressBarVisibility(View.GONE);
                }

                @Override
                public void onError(Throwable e) {
                    // in case any kind error we are showing snack bar
                    ((PlaylistMainActivity)getActivity()).showSnackBar(false, true);
                    progressBarVisibility(View.GONE);
                }

                @Override
                public void onComplete() {
                }
            });

            if (mSwipeRefreshLayout != null && mSwipeRefreshLayout.isRefreshing())
                mSwipeRefreshLayout.setRefreshing(false);
        }
    }

    /**
     * call back when swipe to refresh - not implemented completely :)
     */
    SwipeRefreshLayout.OnRefreshListener mSwipeRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            if (((PlaylistMainActivity)getActivity()).isNetworkConnected()) {
                if (mSwipeRefreshLayout != null && mSwipeRefreshLayout.isRefreshing())
                    mSwipeRefreshLayout.setRefreshing(false);
            } else {
                mSwipeRefreshLayout.setEnabled(false);
            }
        }
    };

    @Override
    public void onDestroy() {
        super.onDestroy();
        mManager.unregisterNetworkCallback(networkCallback);
        mHandler.removeCallbacks(endCall);
        mHandler.removeMessages(SHOW_PROGRESS);
    }
}
