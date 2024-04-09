package Ejercicio9;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        Circulo c1 = new Circulo(116);
        Rectangulo r1 = new Rectangulo(38, 23.14);


        //Invocar métodos
        System.out.println("El Àrea del circulo es de: " + c1.calculateArea());
        System.out.println("El Perímetro del circulo es de: " + c1.calculatePerimeter());

        System.out.println("---------------------");

        System.out.println("El Àrea del rectángulo es de: " + r1.calculateArea());
        System.out.println("El perímetro del rectángulo es de: " + r1.calculatePerimeter());
    }
}