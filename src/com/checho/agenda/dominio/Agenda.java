package com.checho.agenda.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private static final int LIMITED_AGENDA = 50;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public boolean crearContacto(String nombre, String apellido, long telefono) {
        return true;
    }


}
