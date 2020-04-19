package com.abachapp.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abachapp.corona.Model.Coronadata;
import com.abachapp.corona.data.ApiClient;
import com.abachapp.corona.data.ApiInterface;
import com.abachapp.corona.Model.Response1;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void getdata(View view) {

        ApiInterface apiInterface= ApiClient.getRetrofit().create(ApiInterface.class);
        Call<Coronadata> call=apiInterface.showcases();
        call.enqueue(new Callback<Coronadata>() {
            @Override
            public void onResponse(Call<Coronadata> call, Response<Coronadata> response) {
                Toast.makeText(MainActivity.this,response.body().getResponse1().get(0).getCases().getActive().toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Coronadata> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_LONG).show();
            }
        });
    }
}
