package com.sys1yagi.android.fadingactionbar.fragments;

import com.manuelpeinado.fadingactionbar.extras.actionbarcompat.FadingActionBarHelper;
import com.sys1yagi.android.fadingactionbar.R;
import com.sys1yagi.android.fadingactionbar.tools.ActionBarController;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HeaderOverlayFragment extends Fragment {

    public static HeaderOverlayFragment newInstance() {
        HeaderOverlayFragment fragment = new HeaderOverlayFragment();
        return fragment;
    }

    public HeaderOverlayFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        FadingActionBarHelper fadingActionBarHelper = new FadingActionBarHelper()
                .actionBarBackground(android.R.color.holo_blue_light)
                .headerLayout(R.layout.header_main)
                .headerOverlayLayout(R.layout.header_overlay)
                .contentLayout(R.layout.activity_main);
        fadingActionBarHelper.initActionBar(getActivity());
        View view = fadingActionBarHelper.createView(inflater);
        view.findViewById(R.id.fav_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
            }
        });
        view.findViewById(R.id.comment_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
            }
        });
        view.findViewById(R.id.map_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ActionBarController
                .setActionBarTitle(getActivity(), getString(R.string.fragment_header_overlay));
    }

}
