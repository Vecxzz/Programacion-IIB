package Composicion;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        Casa c1 = new Casa(5, "Madera");


        //Mostrar información
        System.out.println("Materiales de las puertas:");
        for (Puerta puerta : c1.getDoors()) {
            System.out.println("- " + puerta.getMaterial());
        }
    }
}