package com.example.myapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImageResponse {
    @SerializedName("photos")
    private List<Image> images;

    public ImageResponse(List<Image> images) {
        this.images = images;
    }

    public List<Image> getImages() {
        return images;
    }

    @Override
    public String toString() {
        return "ImageResponse{" +
                "images=" + images +
                '}';
    }
}
