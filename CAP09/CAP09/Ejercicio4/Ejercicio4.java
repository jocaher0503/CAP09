package Ejercicio4;

import Ejercicio4.matematicas.fracciones.Fraccion;

public class Ejercicio4 {
    public static void main(String[] args) {
        Fraccion f = new Fraccion(-7, 8);
        System.out.printf("%sx%d = %s%n", f.toString(), 5, f.multiplica(5).toString());
        f = new Fraccion(-7, 8);
        System.out.printf("%s^-1 = %s%n", f.toString(), f.invierte().toString());
        f = new Fraccion(-7, 8);
        Fraccion f2 = new Fraccion(3, 5);
        System.out.printf("%sx%s = %s%n", f.toString(),f2.toString(), f.multiplica(f2).toString());
        f = new Fraccion(-7, 8);
        System.out.printf("%sx%s = %s%n", f.toString(),f2.toString(), f.divide(f2).toString());
        f = new Fraccion(-910, 350);
        System.out.printf("%s = %s%n", f.toString(), f.simplifica().toString());
    }
    
    
}
