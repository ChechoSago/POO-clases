package com.checho.biblioteca.Dominio;

public class Revista extends Recurso implements Prestable{
    private int nroPaginas;

    public Revista(String nombre, boolean prestado, int nroPaginas) {
        super(nombre, prestado);
        this.nroPaginas = nroPaginas;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    @Override
    public void prestar(){
        super.setPrestado(true);
    }

    @Override
    public void devolver() {
        super.setPrestado(false);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nroPaginas=" + nroPaginas +
                ", Revista='" + getNombre() + '\'' +
                '}';
    }
}