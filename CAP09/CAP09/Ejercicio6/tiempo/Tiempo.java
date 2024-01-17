package Ejercicio6.tiempo;

public class Tiempo{
    //Atributos
    private int tiempo;

    //Constructores
    public Tiempo(int horas, int minutos, int segundos){
        this.tiempo = segundos + minutos*60 + horas*3600;
    }

    private static int[] obtenerHorasMinutosSegundos(int tiempo){
        int[] ret = new int[3];
        ret[0] = Math.abs((int)(tiempo / 3600));
        ret[1] = Math.abs((int)((tiempo % 3600) / 60));
        ret[2] = Math.abs((int)((tiempo % 3600) % 60));
        return ret;
    }
    @Override
    public String toString() {
        int[] tiempos = obtenerHorasMinutosSegundos(this.tiempo);
       
       
       return String.format("%s%dh %dm %ds%s",
             tiempo<0?"-(":"",
             tiempos[0],
             tiempos[1],
             tiempos[2],
             tiempo<0?")":"");
    }

    public Tiempo suma(Tiempo t){
        int _suma = this.tiempo + t.tiempo;
        int factor = (_suma>0)?1:-1;
        int[] tiempos = obtenerHorasMinutosSegundos(_suma);
        return new Tiempo(factor*tiempos[0], factor*tiempos[1], factor*tiempos[2]);
    }

    public Tiempo resta(Tiempo t){
        int _resta = this.tiempo - t.tiempo;
        int factor = (_resta>0)?1:-1;
        int[] tiempos = obtenerHorasMinutosSegundos(_resta);
        return new Tiempo(factor*tiempos[0], factor*tiempos[1], factor*tiempos[2]);
    }
}