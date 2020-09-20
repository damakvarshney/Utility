package com.rehash.utility.user;

import java.io.Serializable;

public class RegisterScreenUser implements Serializable {

    int image;
    String Title;
    String Desc;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public RegisterScreenUser(int image, String title, String desc) {
        this.image = image;
        Title = title;
        Desc = desc;
    }

    public RegisterScreenUser() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
