package com.checho.ejercicioparcial.dominio;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concesionario {
    public static final int CAPACIDAD_TOTAL = 15;
    private String nombre;
    List<Moto> motos;


    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.motos = new ArrayList<>();
    }

    public boolean ingresar(Moto moto){
        if(this.motos.size()<15 && buscar(moto.getSerial()) == null ){
            this.motos.add(moto);
            return true;
        }

        return false;
    }

    public Moto buscar(long serial){
        for(Moto motoABuscar: this.motos){
            if(serial == motoABuscar.getSerial()) {
                return motoABuscar;
            }
        }
        return null;
    }
    public List<Moto> buscar(String marca){
        List<Moto> listaBuscada = new ArrayList<>();
        for(Moto motoABuscar: this.motos){
            if(Objects.equals(marca, motoABuscar.getMarca())) {
                listaBuscada.add(motoABuscar);
            }
        }
        return listaBuscada;
    }
    public List<Moto> buscar(boolean soloNuevas){
        List<Moto> motosBuscadas = new ArrayList<>();
        for(Moto motoABuscar: this.motos){
            if(soloNuevas == motoABuscar.isEsNueva()){
                 motosBuscadas.add(motoABuscar);
                }
        }
        return null;
    }
    public List<Moto> buscarQueTenganMasDe(int cilindraje){
        List<Moto> motosMayorCilindraje = new ArrayList<>();
        for(Moto motoABuscar: this.motos){
            if(cilindraje < motoABuscar.getCilindraje()){
                motosMayorCilindraje.add(motoABuscar);
            }
        }

        return null;
    }
    public void vender(@NotNull Moto moto){
        if(buscar(moto.getSerial())!= null){
            motos.remove(moto);
        }


    }
    public int getCapacidadActual(){
        return this.CAPACIDAD_TOTAL - this.motos.size();
    }

}
