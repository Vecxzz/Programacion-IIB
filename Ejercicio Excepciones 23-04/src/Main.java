import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crear Scanner
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Ingrese el primer número: ");
                double n1 = in.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double n2 = in.nextDouble();

                System.out.println("----------------------------");

                System.out.println("Seleccione la operación que desea");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Reiniciar");
                int opcion = in.nextInt();

                System.out.println("----------------------------");

                switch (opcion) {
                    case 1:
                        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                        break;
                    case 4:
                        if (n2 == 0) {
                            throw new ArithmeticException("No es posible dividir por 0");
                        }
                        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                        break;
                    case 5:
                        System.out.println("Reiniciando...");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                in.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Ha ocurrido un error " + e.getMessage());
            }
        }

    }
}