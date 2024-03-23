package Ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Objetos de las clases hijas
        Coche coch1 = new Coche("Verde", 4, 220, 1.560);
        Bicicleta bici1 = new Bicicleta("Rojo", 2, "Deportiva");
        Camioneta camio1 = new Camioneta("Blanco", 4, 1.117);
        Motocicleta moto1 = new Motocicleta("Negro", 2, 60, 5.5);

        //Crear Lista Vehiculos
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(coch1);
        vehiculos.add(bici1);
        vehiculos.add(camio1);
        vehiculos.add(moto1);

        //Invocar a la función
        //catalogar(vehiculos);
        //catalogar(vehiculos, 2);
        catalogar(vehiculos, 4);
    }

    //Creando función catalogar()
    public static void catalogar(List<Vehiculo> vehiculos, int wheels) {
        int count = 0;

        for (Vehiculo vehi:vehiculos) {
            if (wheels < 0 || vehi.getWheels() == wheels) {
                count++;
                System.out.println("Clase: " + vehi.getClass().getSimpleName() + ". " + vehi);
            }
        }

        if (wheels >= 0) {
            System.out.println("Se han encontrado " + count + " vehículos con " + wheels + " ruedas");
        }
    }
}