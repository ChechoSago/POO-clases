package com.checho.parcialpoo.app;

import com.checho.parcialpoo.dominio.CentroComercial;
import com.checho.parcialpoo.dominio.Tienda;
import com.checho.parcialpoo.dominio.Categorias;

import java.util.List;

public class AppCentroComercial {
    public static void main(String[] args){
        CentroComercial centroComercial1 = new CentroComercial();
        centroComercial1.abrirTienda(1, "Velez");
        centroComercial1.abrirTienda(2, "Moft");
        centroComercial1.abrirTienda(3, "Perritos y comida");

        centroComercial1.buscarTienda(1).setCategoria(new Categorias());
        centroComercial1.buscarTienda(2).setCategoria(new Categorias());
        centroComercial1.buscarTienda(3).setCategoria(new Categorias("Comida"));
        centroComercial1.buscarTienda(3).setCategoria(new Categorias());

        List<Categorias> categorias1 = centroComercial1.buscarTienda(3).getCategoria();
        for(Categorias categoria: categorias1){
            System.out.println(categoria.getNombre());
        }
        List<Tienda> tiendasConMasDeDosCategorias = centroComercial1.getTiendasConMasDeDosCategorias();
        for(Tienda tiendas1: tiendasConMasDeDosCategorias){
            System.out.println(tiendas1.getNombre());}


        centroComercial1.cerrarTienda(1);

        List<Tienda> tiendasQueTengo = centroComercial1.buscarTiendas()
    }
}

