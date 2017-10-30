package com.example.android.tourguide;

/**
 * Created by prajakkhruasuwan on 10/22/17.
 */

public class Card {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mTitle;
    private String mDescription;
    private double mRating;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Card(String title, double rating, String description) {
        mTitle = title;
        mRating = rating;
        mDescription = description;
    }

    public Card(String title, double rating, String description, int imageResourceId) {
        mTitle = title;
        mRating = rating;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public double getmRating() {
        return mRating;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return this.mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
