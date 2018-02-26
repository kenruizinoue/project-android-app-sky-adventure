package com.apps.yecotec.skyadventure.widgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;

import com.apps.yecotec.skyadventure.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/26/18.
 */

public class TransportationAlternativesWidget extends ConstraintLayout {
    View rootView;

    public TransportationAlternativesWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    public TransportationAlternativesWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        // Connect rootView with the layout resource
        rootView = inflate(context, R.layout.widget_transportation_alternatives, this);
        ButterKnife.bind(this, rootView);
    }
}

