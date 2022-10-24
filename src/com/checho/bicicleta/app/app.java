package com.checho.bicicleta.app;

import com.checho.bicicleta.dominio.*;

import java.util.List;

public class app {
    public static void main(String[] args) {
        Empleado directo1 = new Directo("Juan", 4840000);
        Empleado vendedor1 = new Vendedor("Julián", 2050000, 45510000);
        Empleado vendedor2 = new Vendedor("Carolina", 980000, 35989000);
        Empleado freelance1 = new Freelance("Johanna", 71000, 89);
        Empleado directo2 = new Directo("David", 3975000);
        Empleado freelance2 = new Freelance("Gustavo", 425000, 65);
        Empleado promotor1 = new Promotor("Pedro", 1200, 5, 62);
        Nomina sistemaNomina = new Nomina();
        sistemaNomina.agregarEmpleado(directo1);
        sistemaNomina.agregarEmpleado(vendedor1);
        sistemaNomina.agregarEmpleado(vendedor2);
        sistemaNomina.agregarEmpleado(freelance1);
        sistemaNomina.agregarEmpleado(freelance2);
        sistemaNomina.agregarEmpleado(promotor1);
        sistemaNomina.agregarEmpleado(directo2);
        System.out.println(sistemaNomina.calcularNomina());
        System.out.println(sistemaNomina.listarDirectos());
        System.out.println(sistemaNomina.listarFreelancers());
        System.out.println(sistemaNomina.listarPromotores());
        System.out.println(sistemaNomina.calcularSoloComision());


    }

}
