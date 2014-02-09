package com.sys1yagi.android.fadingactionbar;

import com.sys1yagi.android.fadingactionbar.fragments.PatternListFragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class OtherPatternActivity extends ActionBarActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, OtherPatternActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, PatternListFragment.newInstance())
                    .commit();
        }
    }
}
