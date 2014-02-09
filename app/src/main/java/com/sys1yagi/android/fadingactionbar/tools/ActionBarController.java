package com.sys1yagi.android.fadingactionbar.tools;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;

public class ActionBarController {

    public static void setActionBarTitle(Activity activity, String title) {
        if (activity == null) {
            return;
        }
        if (activity instanceof ActionBarActivity) {
            ((ActionBarActivity) activity).getSupportActionBar().setTitle(title);
        } else {
            setActionBarTitleV11(activity, title);
        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private static void setActionBarTitleV11(Activity activity, String title) {
        activity.getActionBar().setTitle(title);
    }
}
