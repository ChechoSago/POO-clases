package com.checho.oftalmologo.dominio;

import java.util.ArrayList;
import java.util.List;


public class Oftanmolgo {
    private String nombre;

    private List<Paciente> pacienteApto = new ArrayList<>();

    public Paciente revisarPaciente(String nombre, int edad) {
        Paciente pacienterevisado = null;
        if(nombre.toLowerCase().contains("a") && ( edad < 40 )){
            pacienterevisado = new PacienteApto(nombre, edad, true);
            System.out.println(pacienterevisado.getNombre() + " necesita cirugia");}
        else
            pacienterevisado = new PacienteNopApto(nombre, edad, false);
            pacienteApto.add(pacienterevisado);
            return pacienterevisado;
        }

    public void operarPaciente(){
        this.pacienteApto.stream().filter(paci -> paci instanceof PacienteApto)
               .forEach(paciente -> ((PacienteApto) paciente).operar());

    }
    public List<Paciente> getPacientesAOperar(){
        return pacienteApto;

    }





}
