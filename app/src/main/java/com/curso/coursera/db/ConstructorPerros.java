package com.curso.coursera.db;

import android.content.Context;


import com.curso.coursera.R;
import com.curso.coursera.model.Perro;

import java.util.ArrayList;

public class ConstructorPerros {
    private Context context;

    public ConstructorPerros(Context context) {
        this.context = context;
    }

    public ArrayList<Perro> obtenerDatos(){
        ArrayList<Perro> perros = new ArrayList<Perro>();
        perros.add(new Perro(R.drawable.perro1, "Chandoso", "0"));
        perros.add(new Perro(R.drawable.perro2, "Pulgoso", "0"));
        perros.add(new Perro(R.drawable.perro3, "Sarnoso", "0"));
        perros.add(new Perro(R.drawable.perro1, "Mugroso", "0"));
        perros.add(new Perro(R.drawable.perro2, "Garrapatozo", "0"));
        return perros;
    }
}
