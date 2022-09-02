package com.checho.agenda.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Agenda {
    private List<Contacto> contactos;
    private static final int LIMITE_AGENDA = 50;

    public Agenda() {
        this.contactos = new ArrayList<>();

    }

    public boolean crearContacto(String nombre, String apellido, String telefono) {
        if (this.buscarPorNumero(telefono) == null && this.contactos.size() < LIMITE_AGENDA) {
            Contacto contactoAAgregar = new Contacto(nombre, apellido, telefono);
            this.contactos.add(contactoAAgregar);
        }
        return false;
    }

    public Contacto buscarPorNumero(String numeroABuscar) {
        Contacto contactoBuscado = null;

        for (Contacto contacto : this.contactos) {
            if (contacto.getNumero() == numeroABuscar) {
                contactoBuscado = contacto;
            }
        }
        return contactoBuscado;
    }

    public Contacto buscarPorNombre(String nombreABuscar) {
        Contacto contactoBuscado = null;
        for (Contacto contacto : this.contactos) {
            if (contacto.getNombre() == nombreABuscar) {
                contactoBuscado = contacto;
            }
        }
        return contactoBuscado;
    }

    public Contacto buscarPorApellido(String apellidoABuscar) {
        Contacto contactoBuscado = null;
        for (Contacto contacto : this.contactos) {
            if (contacto.getApellido() == apellidoABuscar) {
                contactoBuscado = contacto;
            }
        }
        return contactoBuscado;
    }

    public void eliminarContacto(String numero) {
        Contacto contactoAEliminar = this.buscarPorNumero(numero);
        if (contactoAEliminar != null) {
            this.contactos.remove(contactoAEliminar);
        }
    }

    public boolean cambiarNumero(String numeroViejo, String numeroNuevo) {
        Contacto contactoACambiar = this.buscarPorNumero(numeroViejo);
        if ( contactoACambiar != null){
            contactoACambiar.setNumero(numeroNuevo);
            return true;
        }
        return false;
    }

    public void ordenarAlfabeticamente() {
        this.contactos.sort(Comparator.comparing(Contacto::getNombre).thenComparing(Contacto::getApellido));
    }
    public void imprimirAgenda() {
        this.contactos.forEach(c -> System.out.println(c.getNombre() + " "
                + c.getApellido() + " -- " + c.getNumero()));
    }


    public List<Contacto> getContactos() {
        return contactos;
    }
}