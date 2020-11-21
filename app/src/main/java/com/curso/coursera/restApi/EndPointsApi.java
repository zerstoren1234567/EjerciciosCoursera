package com.curso.coursera.restApi;

import com.curso.coursera.restApi.model.PerroResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<PerroResponse> getRecentMedia();
}
