package com.example.cduse.customviewpagersample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleContentFragment extends Fragment {

    private int mCurrentPosition;
    public static Fragment newInstance(int position) {
        Bundle args = new Bundle();

        args.putInt("position", position);
        SampleContentFragment fragment = new SampleContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);
        initToolbar(view);

        return view;
    }

    private void initToolbar(View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        toolbar.setTitle(getTitle());
    }



    public String getTitle() {
        mCurrentPosition = getArguments().getInt("position");
        return "Page " + mCurrentPosition;
    }

    public int getPosition() {
        return getArguments().getInt("position");
    }
}