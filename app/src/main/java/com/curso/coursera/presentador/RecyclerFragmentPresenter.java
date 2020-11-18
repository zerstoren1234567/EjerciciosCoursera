package com.curso.coursera.presentador;

import android.content.Context;

import com.curso.coursera.actividad3.IRecyclerFragmentView;
import com.curso.coursera.db.ConstructorPerros;
import com.curso.coursera.model.Perro;

import java.util.ArrayList;

public class RecyclerFragmentPresenter implements IRecyclerFragmentPresenter {
    private IRecyclerFragmentView iRecyclerFragmentView;
    private Context context;
    private ConstructorPerros constructorPerros;
    private ArrayList<Perro> perros;

    public RecyclerFragmentPresenter(IRecyclerFragmentView iRecyclerFragmentView, Context context) {
        this.iRecyclerFragmentView = iRecyclerFragmentView;
        this.context = context;
        obtenerContactosBaseDatos();
    }

    @Override
    public void obtenerContactosBaseDatos() {
        constructorPerros = new ConstructorPerros(context);
        perros = constructorPerros.obtenerDatos();
        mostrarContactosRV();
    }

    @Override
    public void mostrarContactosRV() {
        iRecyclerFragmentView.inicializarAdaptador(iRecyclerFragmentView.crearAdaptador(perros));
        iRecyclerFragmentView.generarLinearLayoutVertical();
    }
}
