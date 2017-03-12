package com.timecapsule.app.addmediafragment;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.timecapsule.app.R;

/**
 * Created by catwong on 3/12/17.
 */

public class AddCapsuleLocationFragment extends DialogFragment{

    private View mRoot;
    private ImageView iv_gif_location;

    public AddCapsuleLocationFragment() {
    }

    public static AddCapsuleLocationFragment newInstance(String capsule) {
        AddCapsuleLocationFragment fragment = new AddCapsuleLocationFragment();
        Bundle args = new Bundle();
        args.putString("capsule", capsule);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.fragment_add_location, parent, false);
        setViews();
        return mRoot;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        // request a window without the title
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    private void setViews(){
        iv_gif_location = (ImageView) mRoot.findViewById(R.id.iv_gif_location);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(iv_gif_location);
        Glide.with(this)
                .load(R.drawable.gif_add_location2)
                .crossFade()
                .into(imageViewTarget);
    }
}
