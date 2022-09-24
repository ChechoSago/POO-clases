package com.checho.parcialpoo.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class CentroComercial {

    private String nombre;
    public static final byte CAPACIDAD = 100;
    private List<Tienda> Tiendas;

    public CentroComercial() {
        this.Tiendas = new ArrayList<>();

    }

    public boolean abrirTienda(long codigo, String nombre) {
        if (buscarTienda(nombre) == null && Tiendas.size() < CAPACIDAD) {
            Tienda tiendaAAbrir = new Tienda(codigo, nombre);
            this.Tiendas.add(tiendaAAbrir);
            return true;
        }
        return false;
    }

    public void cerrarTienda(long codigo) {
        Tienda tiendaACerrar = buscarTienda(codigo);
        if (tiendaACerrar != null) {
            this.Tiendas.remove(tiendaACerrar);
        }
        else {
            System.out.println("La tienda no existe");
        }
    }

    public Tienda buscarTienda(String nombre) {
        Tienda tiendabuscada = null;
        for (Tienda tienda : this.Tiendas) {
            if (tienda.getNombre() == nombre) {
                tiendabuscada = tienda;
                return tiendabuscada;
            }
        }

        return null;
    }

    public Tienda buscarTienda(long codigo) {
        for (Tienda tienda: this.Tiendas){
            if (tienda.getCodigo()== codigo){
                return tienda;
            }
        }
        return null;
    }

    public List<Tienda> buscarTiendas(String categoria) {
        List<Tienda> listaBuscada = new ArrayList<>();
        for(Tienda tienda: this.Tiendas){
            List<Categorias> categorias = tienda.getCategoria();
            for (Categorias categ: categorias){
                if (Objects.equals(categ.getNombre(), categoria)){
                    listaBuscada.add(tienda);
                }
            }
        }

        return listaBuscada;
    }

    public List<Tienda> getTiendasConMasDeDosCategorias() {
        List<Tienda> listaBuscada = new ArrayList<>();
        for(Tienda tienda: this.Tiendas){
            if(tienda.getCategoria().size()>= 2){
                listaBuscada.add(tienda);
            }
        }

        return listaBuscada;
    }

    public void ordenarTiendasPorNombre() {
        this.Tiendas.sort(Comparator.comparing(Tienda::getNombre).thenComparing(Tienda::getCodigo));
    }
}
