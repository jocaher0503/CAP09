package Ejercicio14.domino;

public class FichaDomino {
    private int izq;
    private int dch;
    public FichaDomino(int izq, int dch){
        this.izq = izq;
        this.dch = dch;
    }

    public FichaDomino voltea(){
        int aux = izq;
        izq = dch;
        dch = aux;
        return this;
    }

    public boolean encaja(FichaDomino f){
        return f.izq==this.dch || f.dch==this.dch ||
               f.izq==this.izq || f.dch==this.izq;
    }

    @Override
    public String toString() {
        return String.format("[%s|%s]", 
                             this.izq!=0?this.izq:" ", 
                             this.dch!=0?this.dch:" ");
    }
}
