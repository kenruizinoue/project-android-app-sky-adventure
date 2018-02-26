package com.apps.yecotec.skyadventure.widgets;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.apps.yecotec.skyadventure.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/26/18.
 */

public class PlannedTransportationReminderWidget extends ConstraintLayout {
    View rootView;
    @BindView(R.id.plan_resume) TextView planResume;

    public PlannedTransportationReminderWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    public PlannedTransportationReminderWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        // Connect rootView with the layout resource
        rootView = inflate(context, R.layout.widget_planned_transportation_reminder, this);
        ButterKnife.bind(this, rootView);

        setPlanResumeTextColor();
    }

    private void setPlanResumeTextColor() {
        String text1 = "Ryan from Corey Car Services is confirmed for pickup at";
        String text2 = " 15.15.";
        planResume.setText(Html.fromHtml(text1 + "<font color='#8BC34A'>" + text2 + "</font>"));
    }
}
