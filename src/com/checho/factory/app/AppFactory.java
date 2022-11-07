package com.checho.factory.app;

import com.checho.factory.dominio.Ventana;

public class AppFactory {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.mostrarAlerta("Chao checho");
    }
}
