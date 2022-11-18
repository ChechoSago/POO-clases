package com.checho.agencia.dominio;

public class Lote extends Inmueble {



    public String toString() {
        return "el inmueble ubicado en: "+getDireccion()+" tiene un precio de venta de: " +
                ""+getValorVenta()+" el valor es: "+getValorArriendo();
    }
}
