package com.rehash.utility.user;

import java.io.Serializable;

public class LoginScreenUser implements Serializable {

    int image;
    String Title;
    String Desc;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public LoginScreenUser(int image, String title, String desc) {
        this.image = image;
        Title = title;
        Desc = desc;
    }

    public LoginScreenUser() {
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
