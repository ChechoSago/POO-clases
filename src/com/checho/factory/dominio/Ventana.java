package com.checho.factory.dominio;

import com.checho.factory.dominio.exepcion.AlertaNoImplementadaExeption;

import javax.sound.midi.Soundbank;
import java.awt.*;

public class Ventana {

    public void mostrarAlerta(String mensaje){
        IAlerta alerta = null;
        String  os     = System.getProperty("os.name");

        switch (os){
            case "Windows 11":
                alerta = new AlertaWindows();
                break;
            case "Java":
                alerta = new AlertaJava();
                break;
            default:
                throw new AlertaNoImplementadaExeption("no es posible mostrar alerta para " + os);
        }
        alerta.mostrar(mensaje);
    }
}
