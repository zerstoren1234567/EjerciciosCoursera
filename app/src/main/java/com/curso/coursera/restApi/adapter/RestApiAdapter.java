package com.curso.coursera.restApi.adapter;

import com.curso.coursera.restApi.ConstantesRestApi;
import com.curso.coursera.restApi.EndPointsApi;
import com.curso.coursera.restApi.deserializador.PerroDeserializador;
import com.curso.coursera.restApi.model.PerroResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiAdapter {

    public EndPointsApi establecerConexionRestApiInstagram(Gson gson){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(EndPointsApi.class);
    }

    public Gson construyendoGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(PerroResponse.class, new PerroDeserializador());

        return gsonBuilder.create();
    }
}
