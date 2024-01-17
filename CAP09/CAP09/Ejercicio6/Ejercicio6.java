package Ejercicio6;

import Ejercicio6.tiempo.Tiempo;

public class Ejercicio6 {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 30, 40);
        Tiempo t3 = new Tiempo(0, 35, 20);
        System.out.printf("%s + %s = %s%n", t1.toString(), t2.toString(), t1.suma(t2));
        System.out.printf("%s - %s = %s%n", t2.toString(), t3.toString(), t2.resta(t3));
    }
}
