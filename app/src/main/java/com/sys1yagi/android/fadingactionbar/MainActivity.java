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
                .headerLayout(R.layout.header)
                .contentLayout(R.layout.activity_main);
        setContentView(helper.createView(this));
        helper.initActionBar(this);
        getSupportActionBar().setTitle("Fisheye sky");
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
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
