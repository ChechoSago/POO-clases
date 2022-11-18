package com.checho.biblioteca.Dominio;

public abstract class Recurso {
    private String nombre;
    private boolean prestado;

    public Recurso(String nombre, boolean prestado) {
        this.nombre = nombre;
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
