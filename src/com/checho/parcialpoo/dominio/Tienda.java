package com.checho.parcialpoo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private long codigo;
    private String nombre;
    private List<Categorias> categoria;




    public Tienda(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = new ArrayList<Categorias>();
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Categorias> getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria.add(categoria);
    }
}
