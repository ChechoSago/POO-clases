package com.checho.calculadora.app;

import com.checho.calculadora.domino.Calculadora;

public class AppCalculadora {
    public void main(String[] args) {
        Calculadora calculadora1 = new Calculadora("casio");
        System.out.println(calculadora1.sumar(2,3));
    }


}
