package com.example.foodcoster.Network;

import com.example.foodcoster.model.PremiumMemberModel;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface  {

    @POST("get_primium_user.php")
    @FormUrlEncoded
    Call<PremiumMemberModel> getPremiummember ();
}
