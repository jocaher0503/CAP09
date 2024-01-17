package Ejercicio2;

import Ejercicio2.vehiculos.Bicicleta;
import Ejercicio2.vehiculos.Coche;
import Ejercicio2.vehiculos.Vehiculo;

public class Ejercicio2 {
    public static void menu(){
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
    }

    public static int leerOpcion(){
        return Integer.parseInt(System.console().readLine());
    }

    public static void andar(Vehiculo vehiculo, int kilometros){
        vehiculo.andar(kilometros);
    }

    public static String caballito(Bicicleta bicicleta){
       return bicicleta.hazCaballito(); 
    }

    public static String quemaRuedas(Coche coche){
        return coche.quemaRueda();
    }

    public static int verKilometraje(Vehiculo vehiculo){
        return vehiculo.getKilometrosRecorridos();
    }

    public static int verKilometrajeTotal(){
        return Vehiculo.getKilometrosTotales();
    }

    public static void main(String[] args) {
        boolean salir = false;
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        while(!salir){
            menu();
            int opcion = leerOpcion();
            switch(opcion){
                case 1:{
                    System.out.println("¿Cuántos kilómetros quiere recorrer?");
                    int kilometros = Integer.parseInt(System.console().readLine());
                    andar(bicicleta, kilometros);
                }
                break;
                    
                case 2:
                    System.out.println(caballito(bicicleta));
                break;
                case 3:{
                    System.out.println("¿Cuántos kilómetros quiere recorrer?");
                    int kilometros = Integer.parseInt(System.console().readLine());
                    andar(coche, kilometros);
                }
                break;
                case 4:
                    System.out.println(quemaRuedas(coche));
                break;
                case 5:
                    System.out.println("La bicicleta lleva recorridos");
                    System.out.printf("%d Km",verKilometraje(bicicleta));
                break;
                case 6:
                    System.out.println("El coche lleva recorridos");
                    System.out.printf("%d Km",verKilometraje(coche));
                break;
                case 7:
                    System.out.println("Los vehículos llevan recorridos");
                    System.out.printf("%d Km",verKilometrajeTotal());
                break;
                case 8:
                    salir = true;
                break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }
}
