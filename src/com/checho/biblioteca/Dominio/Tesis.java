package com.checho.biblioteca.Dominio;

public class Tesis extends Recurso{
    private int nroPaginas;
    private String autorTesis;

    public Tesis(String nombre, boolean prestado, int nroPaginas, String autorTesis) {
        super(nombre, prestado);
        this.nroPaginas = nroPaginas;
        this.autorTesis = autorTesis;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public String getAutorTesis() {
        return autorTesis;
    }

    @Override
    public String toString() {
        return "Tesis{" +
                "nroPaginas=" + nroPaginas +
                ", autorTesis='" + autorTesis + '\'' +
                '}';
    }
}
