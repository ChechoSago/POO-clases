package com.checho.dispensador.dominio;

public class Cerveza {
    private String nombreCerveza;
    private String marca;
    private double temperaturaRecomendada;


    public Cerveza(String nombreCerveza, String marca) {
        this.nombreCerveza = nombreCerveza;
        this.marca = marca;
    }

    public String getNombreCerveza() {
        return nombreCerveza;
    }

    public String getMarca() {
        return marca;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
}

