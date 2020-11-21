package com.curso.coursera.model;

public class Perro {
    private int id;
    private String urlFoto;
    private String nombre;
    private String rank = "0";

    public Perro(String urlFoto, String nombre, String rank) {
        this.nombre = nombre;
        this.rank = rank;
        this.urlFoto = urlFoto;
    }

    public Perro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
