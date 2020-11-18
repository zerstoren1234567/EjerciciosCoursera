package com.curso.coursera.actividad3;

import com.curso.coursera.adaptador.PerroAdaptador;
import com.curso.coursera.model.Perro;

import java.util.ArrayList;

public interface IRecyclerFragmentView {
    public void generarLinearLayoutVertical();
    public PerroAdaptador crearAdaptador(ArrayList<Perro> perros);
    public void inicializarAdaptador(PerroAdaptador perroAdaptador);
}
