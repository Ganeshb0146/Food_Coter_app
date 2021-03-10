package com.example.foodcoster.Network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.HTTP;

public class ApiClass {

    private  static Retrofit retrofit = null;

    public static Retrofit getclient (){

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient client = new OkHttpClient
                .Builder()
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2,TimeUnit.MINUTES)
                .writeTimeout(2,TimeUnit.MINUTES)
                .build();

        if (retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl("http://booksbetteryou.com/web_service/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
            return retrofit;
    }
}
