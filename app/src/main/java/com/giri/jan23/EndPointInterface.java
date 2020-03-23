package com.giri.jan23;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPointInterface {

    @GET("rest/v2/all")
    Call<ArrayList<Country>> getCountries();

}
