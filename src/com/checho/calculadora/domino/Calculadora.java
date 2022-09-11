package com.checho.calculadora.domino;

public class Calculadora {
    private String marca;

    public Calculadora(String marca) {
        this.marca = marca;
    }

    public int sumar(int n1, int n2){
        int sum = (n1 +n2);
        return sum;
    }
}
