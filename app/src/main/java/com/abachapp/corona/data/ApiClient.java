package com.abachapp.corona.data;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;
    private static final String BASE_URL="https://covid-193.p.rapidapi.com/";

    public static Retrofit getRetrofit()
    {
        if(retrofit==null)
        {
            retrofit=new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public void getclient()
    {
       
    }
}
