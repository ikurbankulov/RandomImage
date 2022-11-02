package com.example.myapp;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.List;

public class ImageResponse {
    @SerializedName("JSON")

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
