package com.apps.yecotec.skyadventure.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.yecotec.skyadventure.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/27/18.
 */

public class HotelPromotionCardWidget extends CardView {

    CardView rootView;

    @BindView(R.id.card_image) ImageView cardImage;
    @BindView(R.id.hotel_price_label) TextView priceLabel;
    @BindView(R.id.hotel_name) TextView hotelName;
    @BindView(R.id.hotel_rating) ImageView hotelRating;

    public HotelPromotionCardWidget(@NonNull Context context) {
        super(context);
        init(context);
    }

    public HotelPromotionCardWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        // Connect rootView with the layout resource
        rootView = (CardView) inflate(context, R.layout.widget_hotel_promotion_card, this);
        ButterKnife.bind(this, rootView);
    }

    public void setImage(Drawable newDrawable) {
        cardImage.setImageDrawable(newDrawable);
    }

    public void setPrice(String newPrice) {
        priceLabel.setText(newPrice);
    }

    public void setHotelName(String newHotelName) {
        hotelName.setText(newHotelName);
    }

    public void setHotelRating(Drawable newHotelRating) {
        hotelRating.setImageDrawable(newHotelRating);
    }

}
