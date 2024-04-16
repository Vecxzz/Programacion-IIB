package Ejercicio3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //Crear ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();


        //Encontrar los primeros 10 números primos entre 100 y 300
        for (int i = 100; i <= 300; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numbers.add(i);
                if (numbers.size() == 10) {
                    break;
                }
            }
        }
        System.out.println("Los 10 números primos comprendidos entre 100 y 300 son:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}