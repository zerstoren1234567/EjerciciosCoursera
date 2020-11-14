package com.curso.coursera;

public class Perro {
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
}
