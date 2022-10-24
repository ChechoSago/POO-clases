package com.checho.bicicleta.dominio;

public class Freelance extends Empleado{
    private long valorHora;
    private long horasTrabajadas;


    public Freelance(String nombre, long valorHora, long horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected long calcularSalario() {
        return valorHora*horasTrabajadas;
    }

    public String getNombre() {
        return super.getNombre();
    }
}
