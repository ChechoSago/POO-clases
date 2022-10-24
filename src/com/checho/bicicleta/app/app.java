package com.checho.bicicleta.app;

import com.checho.bicicleta.dominio.*;

import java.util.List;

public class app {
    public static void main(String[] args) {
        Empleado directo1 = new Directo("Sergio", 1000000);
        Empleado directo2 = new Directo("Andrés", 1000000);
        Empleado vendedor1 = new Vendedor("Cristian", 999999, 45000000);
        Empleado freelance1 = new Freelance("Alejo", 4500, 5);
        Nomina sistemaNomina = new Nomina();
        Nomina lista = new Nomina();
        sistemaNomina.agregarEmpleado(directo1);
        sistemaNomina.agregarEmpleado(vendedor1);
        sistemaNomina.agregarEmpleado(freelance1);
        System.out.println(sistemaNomina.calcularNomina());
        lista.agregarEmpleado(directo2);
        System.out.println(lista.listarDirectos());

    }

}
