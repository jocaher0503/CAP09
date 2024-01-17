package Ejercicio1.Caballos;

public class Caballo {

    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Caballo() throws Exception{
        throw new Exception("Debe añadir información del caballo");
    }

    public Caballo(String nombre, String raza, String color, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void caminar(int metros){
        System.out.printf("Estoy caminando durante %d metros%n", metros);
    }

    public void correr(int metros){
        System.out.printf("Estoy corriendo durante %d metros %n", metros);
    }

    public void parar(int tiempo){
        System.out.printf("Estoy parado durante %d segundos %n", tiempo);
    }

    public void relinchar(int tiempo){
        System.out.printf("Estoy relinchando %d segundos%n", tiempo);
    }

    public void defecar(int kilos){
        System.out.printf("Estoy defecando un cantidad de %d kilos%n", kilos);
    }

    public void miccionar(int litros){
        System.out.printf("Estoy miccionando un cantidad de %d litros%n", litros);
    }

    @Override
    public String toString() {
        return "Hola me llamo "+this.nombre+" soy de la raza "+this.raza+" de color "+this.color+" y tengo "+this.edad+" años";
    }

    
}
