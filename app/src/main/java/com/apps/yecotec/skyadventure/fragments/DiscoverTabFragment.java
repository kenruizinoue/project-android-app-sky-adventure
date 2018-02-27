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
import com.apps.yecotec.skyadventure.widgets.PlaceCardWidget;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/25/18.
 */

public class DiscoverTabFragment extends Fragment {

    @BindView(R.id.place_card_2) PlaceCardWidget placeCard2;
    @BindView(R.id.place_card_3) PlaceCardWidget placeCard3;
    @BindView(R.id.place_card_4) PlaceCardWidget placeCard4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_discover_tab, container, false);
        ButterKnife.bind(this, rootView);

        placeCard2.setImage(getResources().getDrawable(R.drawable.place_card_asset_2));
        placeCard3.setImage(getResources().getDrawable(R.drawable.place_card_asset_3));
        placeCard4.setImage(getResources().getDrawable(R.drawable.place_card_asset_4));

        placeCard2.setTitle("Top of The Rock");
        placeCard3.setTitle("Chelsea Market");
        placeCard4.setTitle("Lady Liberty");

        placeCard2.setCategory("THINGS TO DO");
        placeCard3.setCategory("EATING OUT");
        placeCard4.setCategory("THINGS TO DO");

        return rootView;
    }

}
