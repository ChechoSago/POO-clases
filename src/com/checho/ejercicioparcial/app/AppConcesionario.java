package com.checho.ejercicioparcial.app;

import com.checho.ejercicioparcial.dominio.Concesionario;
import com.checho.ejercicioparcial.dominio.Moto;

public class AppConcesionario {

    public static void main(String[] args) {

        Concesionario concesionarioChecho = new Concesionario("chechoMotos");
        concesionarioChecho.ingresar(new Moto(123, "kawa",1000000, 500, true));
        concesionarioChecho.ingresar(new Moto(124, "dt",500000, 125, false));

        Moto moto1 = concesionarioChecho.buscar(123);
        System.out.println(moto1.getMarca());
        System.out.println(moto1.getSerial());
    }

}
