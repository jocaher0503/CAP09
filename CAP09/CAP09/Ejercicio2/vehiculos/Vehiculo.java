package Ejercicio2.vehiculos;

public class Vehiculo {
    private static int kilometrosTotales;
    private static int vehiculosCreados;
    private int kilometrosRecorridos;

    public void andar(int kilometros){
        this.kilometrosRecorridos+=kilometros;
        kilometrosTotales+=kilometros;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    
}
