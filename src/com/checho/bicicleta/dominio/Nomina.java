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
        List<String> nomina = new ArrayList<>();
        String empleado = "";
        for (Empleado empleadito: empleados ) {
            empleado = empleadito.getNombre();
            nomina.add(empleado);
        }
        return nomina;
    }

    public void listarFreelancers(){



    }



}
