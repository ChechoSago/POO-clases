package com.checho.biblioteca.Dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca {
    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void addRecurso(Recurso... r){
        this.recursos.addAll(Arrays.asList(r));
    }

    public boolean prestarRecurso(Recurso p){
        if(p instanceof Prestable && p.isPrestado() == false){
            ((Prestable) p).prestar();
            System.out.println(p.getNombre()+" prestado exitosamente");
            return true;
        }else{
            System.out.println(p.getNombre()+" no se puede prestar");
            return false;
        }
    }

    public boolean devolverRecurso(Recurso p){
        if(p instanceof Prestable && p.isPrestado() == true){
            ((Prestable) p).devolver();
            System.out.println(p.getNombre()+" devuelto exitosamente");
            return false;
        }else{
            System.out.println(p.getNombre()+" no se puede devolver");
            return true;
        }
    }


    public void listarPrestados(){
        this.recursos.forEach(recurso -> {
            if(recurso instanceof Prestable && recurso.isPrestado()== true){
                System.out.println(recurso+" PRESTADO");
            }
        });
    }

}