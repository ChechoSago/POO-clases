package com.checho.interfaces2.dominio;

public class Imagen extends Archivo implements Viruseable{

    private int pixeles;

    public Imagen(String nombre, int pixeles) {
        super(nombre);
        this.pixeles = pixeles;
    }

    @Override
    public boolean tieneVirus() {
        return this.pixeles < 100;
    }
}
