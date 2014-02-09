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

public class NoParallaxFragment extends Fragment {

    public static NoParallaxFragment newInstance() {
        NoParallaxFragment fragment = new NoParallaxFragment();
        return fragment;
    }

    private FadingActionBarHelper mFadingHelper;

    public NoParallaxFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = mFadingHelper.createView(inflater);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ActionBarController
                .setActionBarTitle(getActivity(), getString(R.string.fragment_no_parallax));
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mFadingHelper = new FadingActionBarHelper()
                .parallax(false)
                .actionBarBackground(android.R.color.holo_blue_light)
                .headerLayout(R.layout.header_main)
                .contentLayout(R.layout.activity_main);
        mFadingHelper.initActionBar(activity);
    }

}
