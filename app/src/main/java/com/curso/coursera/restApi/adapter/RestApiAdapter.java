package com.curso.coursera.restApi.adapter;

import com.curso.coursera.restApi.ConstantesRestApi;
import com.curso.coursera.restApi.EndPointsApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiAdapter {

    public EndPointsApi establecerConexionRestApiInstagram(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(EndPointsApi.class);
    }
}
