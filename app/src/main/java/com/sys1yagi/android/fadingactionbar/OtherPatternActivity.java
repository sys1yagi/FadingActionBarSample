package com.sys1yagi.android.fadingactionbar;

import com.sys1yagi.android.fadingactionbar.fragments.PatternListFragment;
import com.sys1yagi.android.fadingactionbar.tools.FragmentContainer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class OtherPatternActivity extends ActionBarActivity implements FragmentContainer {

    public static Intent createIntent(Context context) {
        return new Intent(context, OtherPatternActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content, PatternListFragment.newInstance())
                    .commit();
        }
    }

    @Override
    public int getContainerLayoutId() {
        return R.id.content;
    }
}
