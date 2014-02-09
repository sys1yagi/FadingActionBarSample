package com.sys1yagi.android.fadingactionbar;

import com.manuelpeinado.fadingactionbar.extras.actionbarcompat.FadingActionBarHelper;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FadingActionBarHelper helper = new FadingActionBarHelper()
                .actionBarBackground(android.R.color.holo_blue_light)
                .headerLayout(R.layout.header_main)
                .contentLayout(R.layout.activity_main);
        helper.initActionBar(this);
        setContentView(helper.createView(this));

        getSupportActionBar().setTitle(R.string.activity_main_title);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(OtherPatternActivity.createIntent(this));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
