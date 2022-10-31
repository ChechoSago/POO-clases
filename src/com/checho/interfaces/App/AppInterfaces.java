package com.checho.interfaces.App;

import com.checho.interfaces.Dominio.CelularBasico;
import com.checho.interfaces.Dominio.CelularIntermedio;
import com.checho.interfaces.Dominio.CelularSemiavanzado;
import com.checho.interfaces.Dominio.CelularSemiavanzado;
import com.checho.interfaces.Dominio.Persona;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class AppInterfaces {
    public static void main(String[] args) {
        Persona alejando = new Persona("Alejando", "ASDF", "has12", 9999,"hola1");
        Persona sofia = new Persona("Sofia", "ZXCV", "has13", 0000,"hola2");
        Persona daniel = new Persona("Daniel", "QWER", "has14", 8888,"hola3");

        CelularBasico nokia = new CelularBasico("Nokia 1100", daniel);
        CelularSemiavanzado xiaomi = new CelularSemiavanzado("Xiaomi", alejando);
        CelularIntermedio huawei = new CelularIntermedio("huawei P44", sofia);

        tratarDeDesbloquear(asList(nokia, xiaomi, huawei), sofia);
    }

    public static void tratarDeDesbloquear(List<Desbloqueable> celulares, Persona persona) {
        celulares.forEach(celuco -> {
            String marca = ((Celular) celuco).getMarca();
            boolean puedeDesbloquear = celuco.desbloquear(persona);

            System.out.println(persona.getNombre() + " pudo desbloquear el " + marca + "? " + puedeDesbloquear);
        });
    }
}
