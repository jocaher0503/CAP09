package Ejercicio12.publicaciones;

public class Libro extends Publicacion implements Prestable{

    private boolean prestado;

    public Libro(String ISBN, 
                 String titulo, 
                 int anio){
        super(ISBN, titulo, anio);
        this.prestado = false;
    }

    @Override
    public void presta() throws AlreadyLentException{
        if(this.prestado)
            throw new AlreadyLentException();
        this.prestado = true;
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)",
                             super.toString(),
                             (this.prestado)?
                                "prestado":
                                "no prestado");
    }
    
}
