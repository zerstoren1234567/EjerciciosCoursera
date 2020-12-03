package com.curso.coursera.restApi;

import com.curso.coursera.restApi.model.PerroResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EndPointsApi {

    /*@GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<PerroResponse> getRecentMedia();*/

    @FormUrlEncoded
    @POST(ConstantesRestApi.KEY_POST_ID_TOKEN)
    Call<PerroResponse> registrarTokenId(@Field("token") String token);

}
