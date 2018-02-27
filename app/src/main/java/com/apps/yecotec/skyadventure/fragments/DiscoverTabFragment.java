package com.apps.yecotec.skyadventure.fragments;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.apps.yecotec.skyadventure.R;

import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/25/18.
 */

public class DiscoverTabFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_discover_tab, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

}
