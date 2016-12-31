package com.seals.shubham.retrofit_test;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by shubham on 1/1/2017.
 */

public interface ApiInterface {
    @FormUrlEncoded
    @POST("/RetrofitPractice/InsertData.php")
    public void insertUser(
            @Field("Username") String Username,
            @Field("Password") String Password,
            Callback<Response> callback);
}
