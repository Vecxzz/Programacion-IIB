package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        //Crear objetos
        Cuadrado cu1 = new Cuadrado(12);
        Circulo ci1 = new Circulo(12);

        //Métodos Cuadrado
        cu1.dibujar();
        System.out.println("El Àrea del cuadrado es: " + cu1.area());
        cu1.rotar();

        System.out.println("---------------------------");

        //Métodos Circulo
        ci1.dibujar();
        System.out.println("El Àrea del circulo es: " + ci1.area());
    }
}