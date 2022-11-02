package com.example.myapp;

import com.google.gson.annotations.SerializedName;

public class Image {
    @SerializedName("id")
    private String id;

    @SerializedName("download_url")
    private String download_url;

    public Image(String id, String download_url) {
        this.id = id;
        this.download_url = download_url;
    }

    public String getId() {
        return id;
    }

    public String getDownload_url() {
        return download_url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", download_url='" + download_url + '\'' +
                '}';
    }
}
