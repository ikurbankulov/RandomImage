package com.example.myapp;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface ApiService {

    @Headers("Authorization: 563492ad6f91700001000001b089a756a5a64be0979861746ebba594")
    @GET("curated?page=3&per_page=10")
    Single<ImageResponse> loadImage();

}
