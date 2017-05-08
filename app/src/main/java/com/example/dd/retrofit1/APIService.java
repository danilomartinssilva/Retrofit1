package com.example.dd.retrofit1;

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dd on 03.05.2017.
 */

public interface APIService {
    @GET("json_bangla")

    Call<List<User>> getUserData();


}
