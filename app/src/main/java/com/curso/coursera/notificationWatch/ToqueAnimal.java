package com.curso.coursera.notificationWatch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.curso.coursera.restApi.EndPointsApi;
import com.curso.coursera.restApi.adapter.RestApiAdapter;
import com.curso.coursera.restApi.model.PerroResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ToqueAnimal extends BroadcastReceiver {

    private static final String ANIMAL_RECEPTOR = "Perro";
    private static final String ANIMAL_EMISOR = "Unicornio";
    private static final String PERRO = "-KKI-JIngAMiEh3zOogs";
    private static final String UNICORNIO = "-KKG6wZdReyp7F0fkODI";
    private static final String ID_RECEPTOR = PERRO;

    @Override
    public void onReceive(Context context, Intent intent) {
        String ACTION_KEY = "TOQUE_ANIMAL";
        String accion = intent.getAction();

        if (ACTION_KEY.equals(accion)){
            toqueAnimal();
            Toast.makeText(context, "Diste un toque a " + ANIMAL_RECEPTOR, Toast.LENGTH_SHORT).show();
        }
    }

    public void toqueAnimal(){
        Log.d("TOQUE_ANIMAL", "true");
        final PerroResponse perroResponse = new PerroResponse(ID_RECEPTOR, "123", ANIMAL_RECEPTOR);
        RestApiAdapter restApiAdapter =  new RestApiAdapter();
        EndPointsApi endponits = restApiAdapter.establecerConexionRestApi();
        Call<PerroResponse> usuarioResponseCall = endponits.toqueAnimal(perroResponse.getId(), ANIMAL_EMISOR);
        usuarioResponseCall.enqueue(new Callback<PerroResponse>() {
            @Override
            public void onResponse(Call<PerroResponse> call, Response<PerroResponse> response) {
                PerroResponse usuarioResponse1 =response.body();
                Log.d("ID_FIREBASE", usuarioResponse1.getId());
                Log.d("TOKEN_FIREBASE", usuarioResponse1.getToken());
                Log.d("ANIMAL_FIREBASE", usuarioResponse1.getAnimal());
            }

            @Override
            public void onFailure(Call<PerroResponse> call, Throwable t) {

            }
        });
    }
}
