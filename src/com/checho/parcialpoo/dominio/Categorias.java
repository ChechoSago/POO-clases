package com.checho.parcialpoo.dominio;

public class Categorias {

    private String nombre;

    public Categorias(String nombre) {
        this.nombre = nombre;
    }
    public Categorias() {
        this.nombre = "Ropa";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
