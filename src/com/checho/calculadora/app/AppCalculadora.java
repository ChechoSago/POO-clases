package com.checho.calculadora.app;

import com.checho.calculadora.domino.Calculadora;

public class AppCalculadora {
    public static void main(String[] args) {

        System.out.println(Calculadora.sumar(2.3f,8));
        System.out.println(Calculadora.sumar(2,3,8));
        System.out.println(Calculadora.restar(2.3f,3));
        System.out.println(Calculadora.restar(2,3,8));
        System.out.println(Calculadora.multi(2,3));
        System.out.println(Calculadora.multi(3,2));
        System.out.println(Calculadora.divi(8,0));
        System.out.println(Calculadora.divi(2,3,2));

    }
}
