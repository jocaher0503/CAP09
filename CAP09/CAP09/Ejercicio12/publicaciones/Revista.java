package Ejercicio12.publicaciones;

public class Revista extends Publicacion {
    private int numero;
    public Revista(String ISBN, 
                 String titulo, 
                 int anio,
                 int numero){
        super(ISBN, titulo, anio);
        this.numero = numero;
    }
    
}
