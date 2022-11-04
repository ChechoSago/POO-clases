package com.checho.interfaces2.dominio;

public class DocumentoAudio extends Archivo implements Viruseable{
    private int duracion;

    public DocumentoAudio(String nombre, int duracion) {
        super(nombre);
        this.duracion = duracion;
    }

    @Override
    public boolean tieneVirus() {
        return this.duracion > 60;
    }
}
