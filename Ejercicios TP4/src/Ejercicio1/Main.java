package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        //Crear Scanner
        Scanner in = new Scanner(System.in);

        //Crear objeto Random
        Random random = new Random();


        //Inicio
        int exit = 0;
        int attempts = 0;

        while (exit == 0) {
            System.out.println("Bienvenido. A continuación el programa generará un número entre 1 y 100. Para ganar deberas adivinar el número en la menor canitdad de intentos");
            System.out.println("¿Listo?");

            int winningNumber = random.nextInt(100) + 1;
            System.out.println("El número ha sido generado");

            while (true) {
                try {
                    System.out.println("Adivina el número: ");
                    int userNumber = in.nextInt();

                    if (userNumber == winningNumber) {
                        System.out.println("Felicidades has adivinado el número");
                        System.out.println("Cantidad de intentos: " + attempts);
                        System.out.println("Número ganador: " + winningNumber);
                        break;
                    }
                    else if (winningNumber > userNumber) {
                        System.out.println("El número es mayor");
                        attempts += 1;
                    }
                    else {
                        System.out.println("El número es menor");
                        attempts += 1;
                    }
                } catch (InputMismatchException e) {
                    attempts += 1;
                    System.out.println("Por favor, ingresa un número válido");
                    in.next();
                }
            }

            attempts = 0;
            System.out.println("Presiona 1 para volver a jugar, 2 para salir");
            int userOption = in.nextInt();
            if (userOption == 2) {
                exit = 1;
            }
        }
    }
}