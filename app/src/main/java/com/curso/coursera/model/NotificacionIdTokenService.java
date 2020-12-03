package com.curso.coursera.model;

import android.util.Log;

import com.curso.coursera.restApi.EndPointsApi;
import com.curso.coursera.restApi.adapter.RestApiAdapter;
import com.curso.coursera.restApi.model.PerroResponse;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NotificacionIdTokenService extends FirebaseInstanceIdService {

    private static final String TAG  = "FIREBASE_TOKEN";
    @Override
    public void onTokenRefresh(){
        Log.d(TAG, "Solicitando Token");
        String token = FirebaseInstanceId.getInstance().getToken();
        //enviarTokenRegistro(token);
    }

    private void enviarTokenRegistro(String token){
        Log.d(TAG, token);
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        EndPointsApi endPointsApi = restApiAdapter.establecerConexionRestApi();
        Call<PerroResponse> perroResponseCall = endPointsApi.registrarTokenId(token);

        perroResponseCall.enqueue(new Callback<PerroResponse>() {
            @Override
            public void onResponse(Call<PerroResponse> call, Response<PerroResponse> response) {
                PerroResponse perroResponse = response.body();
                Log.d("ID_FIREBASE", perroResponse.getId());
                Log.d("TOKEN_FIREBASE", perroResponse.getToken());
            }

            @Override
            public void onFailure(Call<PerroResponse> call, Throwable t) {

            }
        });
    }
}
