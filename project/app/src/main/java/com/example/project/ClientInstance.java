package com.example.project;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class ClientInstance {
    public static Retrofit retrofit;
    public static String doamain = "http://10.0.2.2/";
    public static String baseUrl = doamain + "audiomp3_android/";

    public static Retrofit getRetrofit()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public interface API
    {
        @GET("data.php")
        Call<List<audio>> getdata();
    }
}
