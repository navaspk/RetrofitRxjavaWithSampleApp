package com.example.playlist.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.playlist.R;

/**
 * Base holder for each view, it contains track title, duration and track image
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    private TextView mTitle;
    private TextView mSummary;
    private ImageView mProfile;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mTitle = itemView.findViewById(R.id.heading);
        mSummary = itemView.findViewById(R.id.summary);
        mProfile = itemView.findViewById(R.id.profile_img);
    }

    public TextView getTitle() {
        return mTitle;
    }

    public ImageView getAvatarView() {
        return mProfile;
    }

    public TextView getSummary() {
        return mSummary;
    }
}
