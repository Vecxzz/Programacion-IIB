package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        //Crear Scanner
        Scanner in = new Scanner(System.in);

        //Crear lista
        ListaTareas lt1 = new ListaTareas();

        //Pedir datos
        while (true) {
            try {
                System.out.println("Bienvenido al sistema ¿Qué acción desea realizar?");
                System.out.println("1. Agregar nueva tarea");
                System.out.println("2. Mostrar todas las tareas");
                System.out.println("3. Eliminar una tarea");
                System.out.println("4. Salir");

                int option = in.nextInt();
                System.out.println("-----------------------------");

                switch (option) {
                    case 1:
                        System.out.println("Ingrese la descripción de la tarea:");
                        in.nextLine();
                        String descripcion = in.nextLine();

                        System.out.println("Ingrese la prioridad de la tarea");
                        int prioridad = in.nextInt();
                        if (prioridad == 0) {
                            throw new ArithmeticException("La prioridad de la tarea no puede ser 0");
                        }

                        Tarea tarea = new Tarea(descripcion, prioridad);
                        lt1.agregarTarea(tarea);
                        System.out.println("Tarea agregada");
                        System.out.println("-----------------------------");
                        break;

                    case 2:
                        System.out.println("Lista de tareas:");
                        for (Tarea t : lt1) {
                            System.out.println("Descripción: " + t.getDescription() + ", Prioridad: " + t.getPriority());
                        }
                        System.out.println("-----------------------------");
                        break;

                    case 3:
                        in.nextLine();
                        System.out.println("Ingrese la descripción de la tarea que desea eliminar");
                        String descripcionEliminar = in.nextLine();
                        lt1.eliminarTarea(descripcionEliminar);
                        System.out.println("Tarea eliminada");
                        System.out.println("-----------------------------");
                        break;

                    case 4:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("La opción ingresada no es válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido");
                in.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Ha ocurrido un error " + e.getMessage());
            }
        }
    }
}