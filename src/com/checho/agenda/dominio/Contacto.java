package com.checho.agenda.dominio;

public class Contacto {

    private String nombre;
    private String apellido;
    private long numero;

    public Contacto(String nombre, String apellido, long numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}