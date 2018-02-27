package com.apps.yecotec.skyadventure.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.yecotec.skyadventure.R;
import com.apps.yecotec.skyadventure.adapters.TravelerAdapter;
import com.apps.yecotec.skyadventure.helpers.VerticalSpaceItemDecorationHelper;
import com.apps.yecotec.skyadventure.models.Traveler;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/25/18.
 */

public class TravelersTabFragment extends Fragment {

    TravelerAdapter travelerAdapter;
    @BindView(R.id.rv_travelers) RecyclerView recyclerViewTravelers;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_travelers_tab, container, false);
        ButterKnife.bind(this, rootView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerViewTravelers.setLayoutManager(layoutManager);

        //to designate that the contents of the RecyclerView won't change an item's size
        recyclerViewTravelers.setHasFixedSize(true);

        VerticalSpaceItemDecorationHelper verticalSpaceItemDecorationHelper =
                new VerticalSpaceItemDecorationHelper(20);
        recyclerViewTravelers.addItemDecoration(verticalSpaceItemDecorationHelper);

        travelerAdapter = new TravelerAdapter(getContext(), createMockList());

        recyclerViewTravelers.setAdapter(travelerAdapter);

        return rootView;
    }

    private List<Traveler> createMockList() {
        List<Traveler> travelers = new ArrayList<>();
        travelers.add(new Traveler(1, "James Harrington","Director of Software and Engineering at WorkHard Inc."));
        travelers.add(new Traveler(2, "Lacey-Mae Howe","I love to ride a bike every now and then. Enjoy coffee, whisky and red wine."));
        travelers.add(new Traveler(3, "Amy Ford","I’m a happy person with mediocre dance moves. Originally from San Diego."));
        travelers.add(new Traveler(4, "Susie Wright","Fashion Blogger at WhatIf."));
        travelers.add(new Traveler(1, "Blane Clements","Director of Software and Engineering at WorkHard Inc."));
        travelers.add(new Traveler(2, "Derrick Solis","I love to ride a bike every now and then. Enjoy coffee, whisky and red wine."));
        travelers.add(new Traveler(3, "Nora Bravo","I’m a happy person with mediocre dance moves. Originally from San Diego."));
        travelers.add(new Traveler(4, "Susie Wright","Fashion Blogger at WhatIf."));
        return travelers;
    }
}
