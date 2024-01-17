package Ejercicio11.utilidades;

public class NumeroAleatorio {
    public static String obtenNumero(int digitos){
        String ret ="";
        for(int i=1; i<=digitos;i++)
            ret += (int)(Math.random()*10);
        return ret;
    }
}
