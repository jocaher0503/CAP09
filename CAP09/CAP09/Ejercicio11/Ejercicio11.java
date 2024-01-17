package Ejercicio11;

import Ejercicio11.tarjetasregalo.NotEnoughFundException;
import Ejercicio11.tarjetasregalo.TarjetaRegalo;

public class Ejercicio11 {
   public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);
        System.out.println(t1);
        System.out.println(t2);
        try {
            t1.gasta(45.90);
            
        } catch (NotEnoughFundException e) {
            System.out.println("No tiene suficiente saldo para gastar "+e.amount+"$");
        }
        try {
            t2.gasta(5);
            
        } catch (NotEnoughFundException e) {
            System.out.println("No tiene suficiente saldo para gastar "+e.amount+"$");
        }
        try {
            t2.gasta(200);
            
        } catch (NotEnoughFundException e) {
            System.out.println("No tiene suficiente saldo para gastar "+e.amount+"$");
        }
        try {
            t1.gasta(3.55);
            
        } catch (NotEnoughFundException e) {
            System.out.println("No tiene suficiente saldo para gastar "+e.amount+"$");
        }
            
        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
   } 
}
