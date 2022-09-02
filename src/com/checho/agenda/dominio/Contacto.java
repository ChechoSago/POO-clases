package com.checho.agenda.dominio;

public class Contacto {

    private String nombre;
    private String apellido;
    private String numero;

    public Contacto(String nombre, String apellido, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;

    }

    public void imprimircontacto(Contacto C1) {
        System.out.println(C1.getNombre() + " " + C1.getApellido() + " -- " + C1.getNumero());
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}