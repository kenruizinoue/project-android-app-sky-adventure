package com.apps.yecotec.skyadventure.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.apps.yecotec.skyadventure.R;
import com.eightbitlab.supportrenderscriptblur.SupportRenderScriptBlur;

import butterknife.BindView;
import butterknife.ButterKnife;
import eightbitlab.com.blurview.BlurView;

/**
 * Created by kenruizinoue on 2/25/18.
 */

public class ReminderCardWidget extends ConstraintLayout {

    Context mContext;
    View rootView;
    @BindView(R.id.root_view) ViewGroup root;
    @BindView(R.id.blur_view) BlurView blurView;

    public ReminderCardWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ReminderCardWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        mContext = context;
        // Connect rootView with the layout resource
        rootView = inflate(context, R.layout.widget_reminder_card, this);
        ButterKnife.bind(this, rootView);
        setupBlurView();
    }

    private void setupBlurView() {
        final float radius = 10f; // With this scale (10) the image is more less 50% blurred

        Activity activity = (Activity) mContext;

        //set background, if your root layout doesn't have one
        final Drawable windowBackground = activity.getWindow().getDecorView().getBackground();

        final BlurView.ControllerSettings bottomViewSettings = blurView.setupWith(root)
                .windowBackground(windowBackground)
                .blurAlgorithm(new SupportRenderScriptBlur(mContext))
                .blurRadius(radius); // Set blur scale
    }

}
