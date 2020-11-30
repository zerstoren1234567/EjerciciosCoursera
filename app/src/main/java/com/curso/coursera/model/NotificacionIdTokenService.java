package com.curso.coursera.model;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

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
    }
}
