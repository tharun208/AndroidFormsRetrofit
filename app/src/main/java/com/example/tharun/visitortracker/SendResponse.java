package com.example.tharun.visitortracker;

/**
 * Created by tharun on 10/11/17.
 */
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SendResponse {

    @POST("https://docs.google.com/forms/d/e/1FAIpQLScj_H2P0QgDeMjvEkg8Jg1lSr_krcderr4ewbop54J7MN1IQw/formResponse")
    @FormUrlEncoded
    Call<Void> sendResponse(
            @Field("entry.377136501") String name,
            @Field("entry.662578003") String email,
            @Field("entry.504645768") String mobile,
            @Field("entry.1173614294") String age
    );
    
}
