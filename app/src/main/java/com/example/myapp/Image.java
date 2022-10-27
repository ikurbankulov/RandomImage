package com.example.myapp;

import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("id")
    private int id;

    @SerializedName("url")
    private String url;

    public int getId() {
        return id;
    }

    public String getUrl() {

        return url;
    }

    public Image(int id, String url) {
        this.id = id;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
