package com.checho.dispensaMecato.app;

import com.checho.dispensaMecato.dominio.DispensadorSnack;
import com.checho.dispensaMecato.dominio.Snack;



public class AppDispensadorMecato {
    public static void main(String[] args) {
        DispensadorSnack dispensado = new DispensadorSnack();

        dispensado.Agregar("Papitas fritas", 2000, "1", 6);
        dispensado.Agregar("Sparkies", 1850, "2", 6);
        dispensado.Agregar("Chocolatina", 2500, "3", 6);
        dispensado.Agregar("Platanitos fritas", 1800, "4", 6);
        dispensado.Agregar("Trocitos", 1000, "5", 6);
        dispensado.Agregar("Rosquitas", 1000, "6", 6);
        dispensado.Agregar("Chitos", 5000, "7", 6);
        dispensado.Agregar("Boliquesos", 1500, "8", 6);
        dispensado.Agregar("Nugets de Milo", 1581, "9", 6);
        dispensado.Agregar("Crispetas", 2000, "10", 6);
        dispensado.Agregar("Gaseosa", 2000, "11", 6);
        dispensado.Agregar("Galletas", 500, "12", 6);

        dispensado.sacarCodigo("1");
        dispensado.sacarCodigo("1");
        dispensado.sacarCodigo("1");
        dispensado.sacarCodigo("1");
        dispensado.sacarCodigo("1");
        dispensado.sacarCodigo("1");
        dispensado.sacarCodigo("2");
        dispensado.sacarCodigo("3");
        dispensado.sacarNombre("Chitos");
        Snack productoeliminado = dispensado.quitar("3");
        Snack productoeliminado1 = dispensado.quitar("12");
        dispensado.imprimir(productoeliminado);
        System.out.println("-------------------");
        dispensado.imprimir(productoeliminado1);
        System.out.println("-------------------");
        Snack productoagregado = dispensado.aumentarSnakCodigo("3");
        dispensado.imprimir(productoagregado);
        System.out.println("-------------------");
        dispensado.obtenerNombreYCantidad();
        System.out.println("-------------------");
        dispensado.obtenerMayorMenor();
        System.out.println("-------------------");
        dispensado.obtenerMenorMayor();
        System.out.println("-------------------");

        System.out.println(dispensado.obtenerAgotadosFor());









    }
}
