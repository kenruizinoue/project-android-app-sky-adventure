package com.apps.yecotec.skyadventure.widgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;

import com.apps.yecotec.skyadventure.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/27/18.
 */

public class NewsCardWidget extends CardView {
    CardView rootView;

    public NewsCardWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    public NewsCardWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        // Connect rootView with the layout resource
        rootView = (CardView) inflate(context, R.layout.widget_news_card, this);
        ButterKnife.bind(this, rootView);
    }
}
