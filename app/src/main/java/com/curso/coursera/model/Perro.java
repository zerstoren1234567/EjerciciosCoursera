package com.curso.coursera.model;

public class Perro {
    private int id;
    private int foto;
    private String nombre;
    private String rank;

    public Perro(int foto, String nombre, String rank) {
        this.nombre = nombre;
        this.rank = rank;
        this.foto = foto;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
