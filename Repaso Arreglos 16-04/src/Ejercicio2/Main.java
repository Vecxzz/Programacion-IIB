package Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Crear ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();


        //Pedir valores
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número " + (i+1 + ":"));
            numbers.add(new Scanner(System.in).nextInt());
        }


        //Encontrar el mayor número primo
        int largestPrime = -1;
        int positionLargestPrime = -1;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            boolean isPrime = true;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && number > largestPrime) {
                largestPrime = number;
                positionLargestPrime = i;
            }
        }
        if (positionLargestPrime != -1) {
            System.out.println("El mayor número primo ingresado es: " + largestPrime + " y se encuentra en la posición: " + positionLargestPrime);
        }
    }
}