package com.sys1yagi.android.fadingactionbar;

import com.sys1yagi.android.fadingactionbar.fragments.NoParallaxFragment;
import com.sys1yagi.android.fadingactionbar.tools.ActionBarController;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class OtherPatternActivity extends ActionBarActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, OtherPatternActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_pattern);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, NoParallaxFragment.newInstance())
                    .commit();
        }
    }
}
