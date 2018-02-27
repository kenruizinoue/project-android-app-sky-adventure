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
import com.apps.yecotec.skyadventure.widgets.HotelPromotionCardWidget;
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

    @BindView(R.id.hotel_card_2) HotelPromotionCardWidget hotelCard2;
    @BindView(R.id.hotel_card_3) HotelPromotionCardWidget hotelCard3;
    @BindView(R.id.hotel_card_4) HotelPromotionCardWidget hotelCard4;

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

        hotelCard2.setImage(getResources().getDrawable(R.drawable.hotel_card_asset_2));
        hotelCard3.setImage(getResources().getDrawable(R.drawable.hotel_card_asset_3));
        hotelCard4.setImage(getResources().getDrawable(R.drawable.hotel_card_asset_4));

        hotelCard2.setPrice("$225.00");
        hotelCard3.setPrice("$650.00");
        hotelCard4.setPrice("$185.00");

        hotelCard2.setHotelName("Stellar Hotel");
        hotelCard3.setHotelName("Azure Pier");
        hotelCard4.setHotelName("The Onyx");

        hotelCard2.setHotelRating(getResources().getDrawable(R.drawable.ic_rating_5));
        hotelCard4.setHotelRating(getResources().getDrawable(R.drawable.ic_rating_5));

        return rootView;
    }

}
