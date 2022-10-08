package com.checho.facturacion.dominio;

import java.util.ArrayList;
import java.util.List;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion(){
        this.facturas = new ArrayList<>();
    }
    public void crearFactura(Persona persona , long valor){
        Factura factura = null;
        this.facturas.add(factura);
    }



}
