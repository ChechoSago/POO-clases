package com.checho.agencia.dominio;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;

    private List<Inmueble> inmueblesNuevos = new ArrayList<>();

    public void agregraInmueble(Inmueble i){
        inmueblesNuevos.add(i);

    }

    public boolean arrendar(Inmueble i){
        if(i instanceof Arrendable && !i.isArrendado()){
            return (arrendar(i));
        }
        return false;
    }

    public boolean devolver(Inmueble i){
        if (i instanceof Arrendable){
            return (devolver(i));
        }
        return true;

    }

    public boolean vender(Inmueble i){
        if(i.isArrendado() == false){
            this.inmueblesNuevos.remove(i);
            return true;
        }
        else return false;
    }

    public List<Inmueble> getArrendablesDisponibles(){
        List<Inmueble> listaDeInmueblesDisponibles = new ArrayList<>();
        for(Inmueble disponible: inmueblesNuevos){
            if(disponible instanceof  Arrendable){
                if(disponible.isArrendado() == false){
                    listaDeInmueblesDisponibles.add(disponible);
                }
            }
        }
        return  listaDeInmueblesDisponibles;
    }
    public List<Inmueble> getArrendados(){
        List<Inmueble> listaDeInmueblesDisponibles = new ArrayList<>();
        for(Inmueble disponible: inmueblesNuevos){
            if(disponible instanceof  Arrendable){
                if(disponible.isArrendado() == true){
                    listaDeInmueblesDisponibles.add(disponible);
                }
            }
        }
        return  listaDeInmueblesDisponibles;

    }
}


