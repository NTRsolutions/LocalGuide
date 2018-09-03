package com.example.system.localguide;

/**
 * This represents a list.
 * It contains default title and subtitle of a place.
 */

public class List {
    // Tittle of the Venue
    private String mTittleItem;

    // Text of the Venue
    private int mTextItem;

    // Drawable resource ID
    private int mImageResourceId;


    /*
     * Create a new Venue object.
     *
     * @param vTittle is the name of the Venue
     * @param vText is the corresponding text of the Venue
     * @param image is drawable reference ID that corresponds to the venue
     * */
    public List(String vTittle, int vText, int imageResourceId) {
        mTittleItem = vTittle;
        mTextItem = vText;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the tittle of the Venue
     */
    public String getVenueTittle() {
        return mTittleItem;
    }


    /**
     * Get the text of the Venue
     */
    public int getVenueText() {
        return mTextItem;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
