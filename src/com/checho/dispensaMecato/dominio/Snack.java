package com.checho.dispensaMecato.dominio;

public class Snack {
    private String nombre;
    private String codigo;
    private double precio;
    private int cantidadunidades;

    public Snack(String nombre, String codigo, double precio, int cantidadunidades) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadunidades = cantidadunidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadunidades() {
        return cantidadunidades;
    }

    public void setCantidadunidades(int cantidadunidades) {
        this.cantidadunidades = cantidadunidades;
    }
}