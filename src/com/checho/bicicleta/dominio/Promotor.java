package com.checho.bicicleta.dominio;

public class Promotor extends Empleado {
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public static final float VALORPORCOMPRA = (float) 15000;
    public static final float PAGOPORVOLANTE = (float) 300;


    @Override
    protected long calcularSalario() {
        return (long) (volantesRepartidos*300 + VALORPORCOMPRA*comprasVolante);
    }

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    public String getNombre() {
        return super.getNombre();
    }

}