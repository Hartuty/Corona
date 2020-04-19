package com.abachapp.corona.data;

import com.abachapp.corona.Model.Coronadata;


import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiInterface {

    @Headers({
            "x-rapidapi-host:covid-193.p.rapidapi.com",
            "x-rapidapi-key:3af496f5f0msh03d2f8cfef0bc12p198e33jsn925159ca9e52"
    })
    @GET("statistics")
    Call<Coronadata> showcases();
}
