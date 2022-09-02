package com.checho.agenda.app;

import com.checho.agenda.dominio.Agenda;
import com.checho.agenda.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda AgendaChecho = new Agenda();
        AgendaChecho.crearContacto("Sergio","García","3113341315");
        AgendaChecho.crearContacto("Carlos","Puerta","3206623257");

        AgendaChecho.imprimirAgenda();
        AgendaChecho.ordenarAlfabeticamente();
        AgendaChecho.getContactos().forEach(contacto -> System.out.println(contacto.getNombre()));

        Contacto contactoABuscar = AgendaChecho.buscarPorApellido("García");
        contactoABuscar.imprimircontacto(contactoABuscar);
        Contacto contactoABuscar2 = AgendaChecho.buscarPorApellido("Puerta");
        contactoABuscar.imprimircontacto(contactoABuscar2);
        AgendaChecho.eliminarContacto("3113341315");
        AgendaChecho.getContactos().forEach(contacto -> System.out.println(contacto.getNombre()));


    }
}

