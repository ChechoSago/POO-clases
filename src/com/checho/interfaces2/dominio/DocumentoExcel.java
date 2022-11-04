package com.checho.interfaces2.dominio;

public class DocumentoExcel extends Documento implements Viruseable{
    private int numeroHojas;

    public DocumentoExcel(String nombre, int numeroHojas) {
        super(nombre);
        this.numeroHojas = numeroHojas;
    }

    @Override
    public boolean tieneVirus() {
        return this.numeroHojas > 12;
    }
}
