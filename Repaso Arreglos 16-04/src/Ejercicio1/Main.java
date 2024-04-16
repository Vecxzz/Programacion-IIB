package Ejercicio1;
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


        //Encontrar el número mayor
        int largest = numbers.get(0);
        int positionLargest = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
                positionLargest = i;
            }
        }
        System.out.println("El mayor número ingreado es: " + largest + " y se encuentra en la posición: " + positionLargest);
    }
}