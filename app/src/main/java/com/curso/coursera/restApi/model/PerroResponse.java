package com.curso.coursera.restApi.model;

import com.curso.coursera.model.Perro;

import java.util.ArrayList;

public class PerroResponse {

    ArrayList<Perro> perros;

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }
}
