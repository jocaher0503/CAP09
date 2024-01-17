package Ejercicio9.moviles;

import Ejercicio8.terminales.Terminal;

public class Movil extends Terminal{
    private String tarifa;
    private int tiempoLlamando;
    public Movil(String telef, String tarifa){
        super(telef);
        this.tarifa = tarifa;
    }

    @Override
    public void llama(Terminal t, int segundos) {
        this.tiempoLlamando+=segundos;
        super.llama(t, segundos);
    }
    public float costeLlamadas(){
        float costePorMinuto = (this.tarifa.equals("rata")?
                                      0.06f:
                                      this.tarifa.equals("mono")?
                                           0.12f:
                                           0.30f);
        return ((float)((float)this.tiempoLlamando/60))*costePorMinuto;
    }

    @Override
    public String toString() {
        return String.format("%s - tarificados %.2f euros",
                            super.toString(), this.costeLlamadas());

    }
    
}
