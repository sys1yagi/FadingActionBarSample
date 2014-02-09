package com.sys1yagi.android.fadingactionbar.tools;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class FragmentTransitionController {

    public static void replace(Activity activity, Fragment toFragment) {
        if (activity instanceof FragmentContainer) {
            int containerId = ((FragmentContainer) activity).getContainerLayoutId();
            ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .addToBackStack(null)
                    .replace(containerId, toFragment)
                    .commit();
        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void replace(Activity activity, android.app.Fragment toFragment) {
        if (activity instanceof FragmentContainer) {
            int containerId = ((FragmentContainer) activity).getContainerLayoutId();
            activity.getFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .addToBackStack(null)
                    .replace(containerId, toFragment)
                    .commit();
        }
    }
}
