package com.curso.coursera.presentador;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.curso.coursera.actividad3.IRecyclerFragmentView;
import com.curso.coursera.db.ConstructorPerros;
import com.curso.coursera.model.Perro;
import com.curso.coursera.restApi.EndPointsApi;
import com.curso.coursera.restApi.adapter.RestApiAdapter;
import com.curso.coursera.restApi.model.PerroResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecyclerFragmentPresenter implements IRecyclerFragmentPresenter {
    private IRecyclerFragmentView iRecyclerFragmentView;
    private Context context;
    private ConstructorPerros constructorPerros;
    private ArrayList<Perro> perros;

    public RecyclerFragmentPresenter(IRecyclerFragmentView iRecyclerFragmentView, Context context) {
        this.iRecyclerFragmentView = iRecyclerFragmentView;
        this.context = context;
        //obtenerContactosBaseDatos();
        obtenerMediosRecientes();
    }

    @Override
    public void obtenerContactosBaseDatos() {
        constructorPerros = new ConstructorPerros(context);
        perros = constructorPerros.obtenerDatos();
        mostrarContactosRV();
    }

    @Override
    public void obtenerMediosRecientes() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        EndPointsApi endPointsApi = restApiAdapter.establecerConexionRestApiInstagram();
        Call<PerroResponse> call = endPointsApi.getRecentMedia();
        call.enqueue(new Callback<PerroResponse>() {
            @Override
            public void onResponse(Call<PerroResponse> call, Response<PerroResponse> response) {
                PerroResponse perroResponse = response.body();
                perros = perroResponse.getPerros();
                mostrarContactosRV();
            }

            @Override
            public void onFailure(Call<PerroResponse> call, Throwable t) {
                Toast.makeText(context, "Falló al intentar conectar, reintentar.", Toast.LENGTH_LONG).show();
                Log.e("FALLÓ LA CONEXIÓN", t.toString());
            }
        });
    }

    @Override
    public void mostrarContactosRV() {
        iRecyclerFragmentView.inicializarAdaptador(iRecyclerFragmentView.crearAdaptador(perros));
        //iRecyclerFragmentView.generarLinearLayoutVertical();
        iRecyclerFragmentView.generarGridLayout();
    }
}
