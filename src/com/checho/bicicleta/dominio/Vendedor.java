package com.checho.bicicleta.dominio;

public class Vendedor extends Directo {
    private long ventasDelMes;
    public static final float TOPE_MINIMO = (float) 0.045;
    public static final float TOPE_MAXIMO = (float) 0.035;
    public static final float SALARIO_POBRE = (float) 1000000;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    protected long calcularSalario() {
        return super.calcularSalario()+calcularComision();
    }

    public long calcularComision() {
        if (salario < SALARIO_POBRE) {
            return (long) (ventasDelMes * TOPE_MINIMO);
        } else {
            return (long) (ventasDelMes * TOPE_MAXIMO);
        }
    }

    public String getNombre() {
        return super.getNombre();
    }
}