package Ejercicio4;
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


        //Encontrar los números que terminan en 4
        int countFour = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 10 == 4) {
                countFour++;
            }
        }
        System.out.println("Los numeros que terminan en 4 son: " + countFour);
    }
}