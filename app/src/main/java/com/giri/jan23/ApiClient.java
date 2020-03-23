package com.giri.jan23;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit=null;

    public static Retrofit getApiClient(){
        retrofit = new Retrofit
                .Builder()
                .baseUrl("https://restcountries.eu/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
