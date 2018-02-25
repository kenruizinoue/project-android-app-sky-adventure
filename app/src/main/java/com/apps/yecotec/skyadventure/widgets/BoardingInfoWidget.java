package com.apps.yecotec.skyadventure.widgets;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;

import com.apps.yecotec.skyadventure.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/25/18.
 */

public class BoardingInfoWidget extends ConstraintLayout {

    View rootView;
    @BindView(R.id.widget_holder) CardView widgetHolder;

    public BoardingInfoWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    public BoardingInfoWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        // Connect rootView with the layout resource
        rootView = inflate(context, R.layout.widget_boarding_info, this);
        ButterKnife.bind(this, rootView);
    }
}
