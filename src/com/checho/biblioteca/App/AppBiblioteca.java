package com.biblioteca.App;

import com.biblioteca.Dominio.Biblioteca;
import com.biblioteca.Dominio.Libro;
import com.biblioteca.Dominio.Revista;
import com.biblioteca.Dominio.Tesis;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro viajeAlCentroDeLaTierra = new Libro("Viaje al Centro de la tierra", false, 360, 1864, "Julio Verne");
        Libro elArteDeLaGuerra = new Libro("El arte de la guerra", true, 292, 1772, "Sun Tzu");

        Revista semana = new Revista("Semana", false, 20);
        Revista colombiano = new Revista("colombiano", true, 30);

        Tesis neurociencia = new Tesis("Neurociencia aplicada", false, 75, "Jorge Gomez");
        Tesis computacionCuantica = new Tesis("Computacion Cuantica", false, 45, "Jose Martinez");

        biblioteca.addRecurso(viajeAlCentroDeLaTierra, elArteDeLaGuerra, semana, colombiano, neurociencia, computacionCuantica);
        biblioteca.prestarRecurso(elArteDeLaGuerra);
        System.out.println("RECURSOS PRESTADOS: ");
        biblioteca.listarPrestados();
        System.out.println("////////////////////////");
        System.out.println("Historial del dia:");
        biblioteca.prestarRecurso(semana);
        biblioteca.prestarRecurso(viajeAlCentroDeLaTierra);
        biblioteca.devolverRecurso(elArteDeLaGuerra);
        biblioteca.devolverRecurso(colombiano);

        System.out.println("////////////////////////");
        System.out.println("RECURSOS PRESTADOS ACTUALIZADOS: ");
        biblioteca.listarPrestados();

        System.out.println("FIN DEL PROGRAMA");
    }
}
