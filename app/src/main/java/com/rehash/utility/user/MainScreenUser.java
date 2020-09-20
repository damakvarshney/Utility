package com.rehash.utility.user;

import android.media.Image;

import java.io.Serializable;

public class MainScreenUser implements Serializable {
    String screenName;
    int image;

    public MainScreenUser(String screenName, int image) {
        this.screenName = screenName;
        this.image = image;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public MainScreenUser() {
    }
}
