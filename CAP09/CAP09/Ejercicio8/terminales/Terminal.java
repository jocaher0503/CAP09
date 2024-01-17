package Ejercicio8.terminales;

public class Terminal {
    private int tiempoConversacion;
    private String numTelef;
    public Terminal(String telef){
        this.numTelef = telef;
        this.tiempoConversacion = 0;
    }

    public int getTiempoConversacion() {
        return tiempoConversacion;
    }

    public String getNumTelef() {
        return numTelef;
    }

    public void llama(Terminal t, int segundos){
        this.tiempoConversacion+=segundos;
        t.tiempoConversacion+=segundos;
    }

    @Override
    public String toString() {
        return String.format("Nº %s - %ss de conversación", 
                            this.numTelef, 
                            this.tiempoConversacion);
    }
}
