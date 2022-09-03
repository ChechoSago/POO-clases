package com.checho.dispensaMecato.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DispensadorSnack {

    private List<Snack> mecatos;
    private int cantidadActual;
    private int capacidadDispensador = 12;

    public DispensadorSnack() {
        this.mecatos = new ArrayList<>();
    }

    public void Agregar(String nombre, double precio, String codigo, int cantidadunidades){
        Snack mecatoNuevo = new Snack(nombre, codigo, precio, cantidadunidades);
        if ((this.mecatos.size() + 1) <= this.capacidadDispensador){
            this.mecatos.add(mecatoNuevo);
        } else {
            System.out.println("No se pueden agregar mijo");
        }
    }


    public boolean sacarCodigo(String codigo){
        Snack mecatoARetirar = obtenerCantidadDeSnack(codigo);
        if((mecatoARetirar!= null)&&(mecatoARetirar.getCantidadunidades()>0)) {
            this.cantidadActual = mecatoARetirar.getCantidadunidades() - 1;
            mecatoARetirar.setCantidadunidades(this.cantidadActual);
        }
        return false;
    }

    public boolean sacarNombre(String nombre){
        Snack mecatoARetirar = obtenerCantidadDeSnack(nombre);
        if((mecatoARetirar!= null)&&(mecatoARetirar.getCantidadunidades()>0)){
            this.cantidadActual = mecatoARetirar.getCantidadunidades()-1;
            mecatoARetirar.setCantidadunidades(this.cantidadActual);
            return true;
        }
        return false;
    }

    public Snack aumentarSnakCodigo(String codigo){
        Snack aumentarCodigo = obtenerCantidadDeSnack(codigo);
        if((aumentarCodigo != null)&&(aumentarCodigo.getCantidadunidades()<6)){
            this.cantidadActual = aumentarCodigo.getCantidadunidades()+ aumentarCodigo.getCantidadunidades();
            if (this.cantidadActual<= 6){
                aumentarCodigo.setCantidadunidades((this.cantidadActual));
            }
        }
        return aumentarCodigo;
    }

    public void aumentarSnackNombre(String nombre){
        Snack aumentarNombre = obtenerCantidadDeSnack(nombre);
        if((aumentarNombre != null)&&(aumentarNombre.getCantidadunidades()<6)){
            this.cantidadActual = aumentarNombre.getCantidadunidades()+ aumentarNombre.getCantidadunidades();
            if (this.cantidadActual<= 6){
                aumentarNombre.setCantidadunidades((this.cantidadActual));
            }
        }
    }

    public Snack quitar(String codigo) {
        Snack eliminar = obtenerCantidadDeSnack(codigo);
        if (eliminar != null) {
            this.mecatos.remove(eliminar);
        }
        return eliminar;
    }

    private Snack obtenerCantidadDeSnack(String codigo) {
       Snack obtenerSnack = this.mecatos.stream()
               .filter(snackCod -> snackCod.getCodigo().equalsIgnoreCase(codigo))
               .findFirst().orElse(null);
        if (obtenerSnack != null) {
            return obtenerSnack;
        } else {
            return null;
        }
    }
    public List<String> obtenerAgotados() {
        List<String> faltantes = new ArrayList<>();
        this.mecatos.forEach(m -> faltantes.add(m.getNombre() + " " + m.getCantidadunidades()));
        return faltantes;
    }


    public List<Snack> obtenerNombreYCantidad(){
        List<Snack> snackDisponibles = this.mecatos.stream()
                .filter(Snack -> Snack.getCantidadunidades()>0)
                .collect(Collectors.toList());
        if (snackDisponibles != null) {
            System.out.println("Snacks disponibles: ");
            snackDisponibles.forEach(snackt -> System.out.println(snackt.getNombre()+" - "+snackt.getPrecio()));
            }
        else {
            System.out.println("No queda ningún snack.");
           }

        return snackDisponibles;
    }

    public List<Snack> obtenerMayorMenor(){
        this.mecatos.sort(Comparator.comparing(Snack::getPrecio).reversed());
        this.listaDeSnacks();
        return null;
    }

    public List<Snack> obtenerMenorMayor(){
        this.mecatos.sort(Comparator.comparing(Snack::getCantidadunidades));
        this.listaDeSnacks();
        return null;
    }

    private void listaDeSnacks () {
        this.mecatos.forEach(snack -> System.out.println(snack.getNombre() + " "
                + snack.getCodigo() + " --> " + snack.getPrecio() + " cantidad: " + snack.getCantidadunidades()));
    }
    public void imprimir(Snack productoeliminado) {
        this.mecatos.forEach(m -> System.out.println(m.getNombre() + " Codigo "+ m.getCodigo() + " Cantidad: " + m.getCantidadunidades()));
    }
}
