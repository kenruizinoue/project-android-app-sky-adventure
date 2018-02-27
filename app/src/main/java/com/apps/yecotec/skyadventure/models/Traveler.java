package com.apps.yecotec.skyadventure.models;

import android.graphics.drawable.Drawable;

/**
 * Created by kenruizinoue on 2/27/18.
 */

public class Traveler {

    public Traveler(int travelerImage, String travelerName, String travelerDescription) {
        this.travelerImage = travelerImage;
        this.travelerName = travelerName;
        this.travelerDescription = travelerDescription;
    }

    public int travelerImage;
    public String travelerName;
    public String travelerDescription;
}
