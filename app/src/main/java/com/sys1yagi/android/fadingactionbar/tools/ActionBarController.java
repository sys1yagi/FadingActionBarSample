package com.sys1yagi.android.fadingactionbar.tools;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
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

    public static void setActionBarDrawable(Activity activity, Drawable drawable) {
        if (activity == null) {
            return;
        }
        if (activity instanceof ActionBarActivity) {
            ((ActionBarActivity) activity).getSupportActionBar().setBackgroundDrawable(drawable);

        } else {
            setActionBarDrawableV11(activity, drawable);
        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private static void setActionBarDrawableV11(Activity activity, Drawable drawable) {
        activity.getActionBar().setBackgroundDrawable(drawable);
    }
}
