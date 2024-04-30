package Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Crear Scanner
        Scanner in = new Scanner(System.in);

        //Inicio
        System.out.println("Bienvenido. A continuación ingrese los datos del triángulo a calcular");

        double base = 0;
        double height = 0;

        try {
            System.out.println("Ingrese la base: ");
            base = in.nextDouble();

            System.out.println("Ingrese la altura: ");
            height = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un valor válido");
            return;
        }

        System.out.println("El área del triángulo es: " + (base * height) / 2);
    }
}