package com.checho.biblioteca.Dominio;

public class Libro extends Recurso implements Prestable{
    private int nroPaginas;
    private int fechaPublicacion;
    private String autorLibro;


    public Libro(String nombre, boolean prestado, int nroPaginas,int fechaPublicacion, String autorLibro) {
        super(nombre, prestado);
        this.nroPaginas = nroPaginas;
        this.fechaPublicacion = fechaPublicacion;
        this.autorLibro = autorLibro;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public String getAutorLibro() {
        return autorLibro;
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
                ", autorLibro='" + autorLibro + '\'' +
                '}';
    }
}
