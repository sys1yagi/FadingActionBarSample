package com.sys1yagi.android.fadingactionbar.fragments;

import com.sys1yagi.android.fadingactionbar.R;
import com.sys1yagi.android.fadingactionbar.tools.ActionBarController;
import com.sys1yagi.android.fadingactionbar.tools.FragmentTransitionController;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PatternListFragment extends Fragment {

    public static PatternListFragment newInstance() {
        PatternListFragment fragment = new PatternListFragment();
        return fragment;
    }

    enum ListItem {
        NO_PARALLAX("No Parallax", NoParallaxFragment.newInstance()),
        HEADER_OVERLAY("Header Overlay", HeaderOverlayFragment.newInstance());

        private String mTitle;

        private Fragment mFragment;

        ListItem(String title, Fragment fragment) {
            mTitle = title;
            mFragment = fragment;
        }
    }

    public PatternListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pattern_list, null);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1);

        for (ListItem listItem : ListItem.values()) {
            adapter.add(listItem.mTitle);
        }
        ListView listView = (ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentTransitionController.replace(getActivity(), ListItem.values()[i].mFragment);
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ActionBarController
                .setActionBarTitle(getActivity(), getString(R.string.action_others));
        ActionBarController.setActionBarDrawable(getActivity(), new ColorDrawable(0xff000000));
    }
}
