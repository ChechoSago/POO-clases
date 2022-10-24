package com.checho.bicicleta.dominio;

public class Directo extends Empleado {
    public static final float APORTE_SALUD = (float) 0.05;
    public static final float APORTE_PENSION = (float) 0.065;

    protected long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }
    @Override
    protected long calcularSalario() {
        return salario - calcularAporte();
    }

    public long calcularSalud() {
        return (long) (salario * APORTE_SALUD);
    }

    public long calcularPension() {
        return (long) (salario * APORTE_PENSION);
    }

    public long calcularAporte() {
        return calcularSalud() + calcularPension();
    }

    public String getNombre() {
        return super.getNombre();
    }



}