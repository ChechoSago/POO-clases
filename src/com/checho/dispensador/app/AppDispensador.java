package com.checho.dispensador.app;


import com.checho.dispensador.dominio.Cerveza;
import com.checho.dispensador.dominio.Dispensador;

public class AppDispensador {
    public static void main(String[] args){

      Cerveza cerveza1 = new Cerveza(" poker"," lagger");
      Cerveza cerveza2 = new Cerveza(" 20Mission", " IPA");
      Cerveza cerveza3 = new Cerveza(" Carrangal" , " stout");

      Dispensador dispensador1 = new Dispensador(cerveza1,0, 50);
      dispensador1.llenar();

      Dispensador dispensador3 = new Dispensador(cerveza3, 500,700);


      Dispensador dispensador2 = new Dispensador(cerveza2, 80, 80);
      dispensador2.servir(10);

      dispensador1.cambiartemperatura(-9);
      dispensador2.servir(60);

      dispensador1.vaciar();
      dispensador3.vaciar();
      System.out.println(dispensador3.getCantidadActual());

      System.out.println(cerveza1.getNombreCerveza());

      cerveza1.setTemperaturaRecomendada(-56);

      System.out.println(cerveza1.getTemperaturaRecomendada());
      System.out.println(dispensador1.getCapacidad());


    }

}
