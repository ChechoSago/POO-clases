package com.checho.bicicleta.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados = new ArrayList<>();


    public void agregarEmpleado (Empleado empleado){
        empleados.add(empleado);
    }


    public List<String> calcularNomina (){
        List<String> nomina = new ArrayList<>();
        String empleado = "";
      for (Empleado empleadito : empleados ) {
          empleado = empleadito.getNombre() + " gana esto al mes " + empleadito.calcularSalario();
          nomina.add(empleado) ;
      }
       return nomina;
    }

    public List<String> listarDirectos(){
        List<String> directo = new ArrayList<>();
        String empleado = "";
        for (Empleado empleadito: empleados ) {
            if (empleadito instanceof Directo){
            empleado = empleadito.getNombre();
            directo.add(empleado);}
        }
        return directo;
    }

    public List<String> listarFreelancers(){
        List<String> free = new ArrayList<>();
          String empleado = "";
            for (Empleado empleadito: empleados ) {
                if (empleadito instanceof Freelance){
                    empleado = empleadito.getNombre();
                    free.add(empleado);}
            }
            return free;
        }

    public List<String> listarPromotores(){
        List<String> promo = new ArrayList<>();
        String empleado = "";
        for (Empleado empleadito: empleados ) {
            if (empleadito instanceof Promotor){
                empleado = empleadito.getNombre();
                promo.add(empleado);}
        }
        return promo;
    }
    public List<String> calcularSoloComision (){
        List<String> comisiones = new ArrayList<>();
        String empleado = "";
        for (Empleado empleadito : empleados ) {
            if (empleadito instanceof Vendedor)
            empleado = empleadito.getNombre() + " comisiona esto al mes " + ((Vendedor) empleadito).calcularComision();
            comisiones.add(empleado) ;
        }
        return comisiones;
    }



}




