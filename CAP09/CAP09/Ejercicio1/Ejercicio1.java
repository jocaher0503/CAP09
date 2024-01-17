package Ejercicio1;

import Ejercicio1.Caballos.Caballo;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            Caballo caballo = new Caballo("Rocinante", "Árabe", "Negro", 5);
            caballo.caminar(100);
            caballo.correr(1000);
            caballo.parar(10);
            caballo.relinchar(5);
            caballo.defecar(1);
            caballo.miccionar(1);
            System.out.println(caballo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }   
}
