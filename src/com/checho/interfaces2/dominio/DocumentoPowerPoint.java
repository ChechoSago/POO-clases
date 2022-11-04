package com.checho.interfaces2.dominio;

public class DocumentoPowerPoint extends Documento {
    private int numeroDispositivas;

    public DocumentoPowerPoint(String nombre, int numeroDispositivas) {
        super(nombre);
        this.numeroDispositivas = numeroDispositivas;
    }
}
