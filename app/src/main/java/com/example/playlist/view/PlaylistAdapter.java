package com.example.playlist.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.playlist.presenter.TracksItem;
import com.squareup.picasso.Picasso;

import com.example.playlist.R;

import java.util.List;

/**
 * Adapter class is taking care to draw the view and bind the data to view with the
 * help of holder class
 *
 * We user Picasso library to load the track image and caching, error handling etc.
 */
public class PlaylistAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    Context mContext;
    List<TracksItem> mSampleList;

    PlaylistAdapter(Context context, List<TracksItem> sampleList) {
        mContext = context;
        mSampleList = sampleList;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.each_item, null);
        return new BaseViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int pos) {

        baseViewHolder.getTitle().setText(mSampleList.get(pos).getTitle());

        // to get the some proper duration, deviding by 10000 :)
        int duration = mSampleList.get(pos).getDuration()/10000;
        String str = mContext.getString(R.string.duration)+" "+duration+" "+mContext.getString(R.string.minute);

        baseViewHolder.getSummary().setText(str);
        Picasso.with(mContext)
                .load(mSampleList.get(pos).getUser().getAvatarUrl())
                .into(baseViewHolder.getAvatarView());
    }

    @Override
    public int getItemCount() {
        return mSampleList.size();
    }
}
