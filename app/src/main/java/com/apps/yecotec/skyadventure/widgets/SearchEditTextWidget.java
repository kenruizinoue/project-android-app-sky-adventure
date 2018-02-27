package com.apps.yecotec.skyadventure.widgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;

import com.apps.yecotec.skyadventure.R;

import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/26/18.
 */

public class SearchEditTextWidget extends CardView {
    CardView rootView;

    public SearchEditTextWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    public SearchEditTextWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        // Connect rootView with the layout resource
        rootView = (CardView) inflate(context, R.layout.widget_search_edit_text, this);
        rootView.setCardElevation(8);
        rootView.setRadius(0);

        ButterKnife.bind(this, rootView);
    }
}

