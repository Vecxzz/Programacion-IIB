package Ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Crear ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();


        //Pedir valores
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el número " + (i+1 + ":"));
            numbers.add(new Scanner(System.in).nextInt());
        }


        //Encontrar el número mayor y sus repeticiones
        int max = numbers.get(0);
        int maxPosition = 0;
        int maxCount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number > max) {
                max = number;
                maxPosition = i;
                maxCount = 1;
            } else if (number == max) {
                maxCount++;
            }
        }
        System.out.println("El mayor número ingresado es: " + max + ", está en la posición: " + maxPosition + " y se repite: " + maxCount + " veces");
    }
}