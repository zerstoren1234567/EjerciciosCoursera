package com.curso.coursera.restApi.model;

import com.curso.coursera.model.Perro;

import java.util.ArrayList;

public class PerroResponse {

    ArrayList<Perro> perros;

    private String id;
    private String token;

    public PerroResponse() {
    }

    public PerroResponse(String id, String token) {
        this.id = id;
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }
}
