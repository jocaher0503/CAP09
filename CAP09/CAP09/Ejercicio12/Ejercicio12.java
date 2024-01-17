package Ejercicio12;

import Ejercicio12.publicaciones.AlreadyLentException;
import Ejercicio12.publicaciones.Libro;
import Ejercicio12.publicaciones.Revista;

public class Ejercicio12 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
        Libro libro2 = new Libro("112233", "Los Otros", 2016);
        Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);
        Revista revista1 = new Revista("444555", "Año Cero", 2019, 344);
        Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        try {
            libro2.presta();
        } catch (AlreadyLentException e) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
        if (libro2.estaPrestado()) {
        System.out.println("El libro está prestado");
        }
        try {
            libro2.presta();
        } catch (AlreadyLentException e) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
        libro2.devuelve();
        if (libro2.estaPrestado()) {
        System.out.println("El libro está prestado");
        }
        try {
            libro3.presta();
        } catch (AlreadyLentException e) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
