package com.apps.yecotec.skyadventure.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.yecotec.skyadventure.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/26/18.
 */

public class PlaceCardWidget extends CardView {
    CardView rootView;

    @BindView(R.id.card_image) ImageView cardImage;
    @BindView(R.id.card_title) TextView cardTitle;
    @BindView(R.id.card_category) TextView cardCategory;

    public PlaceCardWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    public PlaceCardWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        // Connect rootView with the layout resource
        rootView = (CardView) inflate(context, R.layout.widget_place_card, this);

        ButterKnife.bind(this, rootView);
    }

    public void setImage(Drawable newDrawable) {
        cardImage.setImageDrawable(newDrawable);
    }

    public void setTitle(String newTitle) {
        cardTitle.setText(newTitle);
    }

    public void setCategory(String newCategory) {
        cardCategory.setText(newCategory);
    }
}
