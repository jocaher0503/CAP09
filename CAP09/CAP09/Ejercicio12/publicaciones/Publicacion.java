package Ejercicio12.publicaciones;

public class Publicacion {
    protected String ISBN;
    protected String titulo;
    protected int anio;

    public Publicacion(String ISBN, 
                       String titulo, 
                       int anio){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getAnio() {
        return anio;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
       return String.format("ISBN: %s, título: %s,"+
                            " año de publicación: %d",
                            this.ISBN, 
                            this.titulo, 
                            this.anio);
    }
}
