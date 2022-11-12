package com.checho.agencia.dominio;

public class Casa extends Inmueble implements Arrendable{
    @Override
    public void arrendar() {
        setArrendado(true);
    }

    @Override
    public void devolver() {
        setArrendado(false);
    }

    @Override
    public String toString() {
        return "Casa";
    }
}
