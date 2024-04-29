package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Crear Scanner
        Scanner in = new Scanner(System.in);

        //Crear lista
        List<Alumno> students = new ArrayList<>();

        //Pedir datos
        while (true) {
            try {
                System.out.println("Bienvenido al sistema ¿Qué acción desea realizar?");
                System.out.println("1. Agregar alumno");
                System.out.println("2. Mostrar lista de alumnos");
                System.out.println("3. Calcular promedio de notas");
                System.out.println("4. Buscar alumno");
                System.out.println("5. Salir");

                int opcion = in.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del alumno");
                        String name = in.next();

                        System.out.println("Ingrese la edad del alumno");
                        int age = in.nextInt();
                        if (age == 0) {
                            throw new ArithmeticException("La edad del alumno no puede ser 0");
                        }

                        System.out.println("Ingrese la nota del alumno");
                        double grade = in.nextDouble();

                        Alumno student = new Alumno(name, age, grade);
                        students.add(student);
                        System.out.println("Alumno agregado");
                        break;

                    case 2:
                        System.out.println("Lista de alumnos:");
                        for (Alumno s : students) {
                            System.out.println("Nombre: " + s.getName() + ", Edad: " + s.getAge() + ", Nota: " + s.getNota());
                        }
                        break;

                    case 3:
                        double sum = 0;
                        double average = 0;
                        double highestGrade = 0;
                        Alumno studentWithHighestGrade = null;
                        System.out.println("Promedio de notas");
                        for (Alumno s : students) {
                            sum += s.getNota();
                        }
                        average = sum / students.size();
                        System.out.println("El promedio de notas de los alumnos es de: " + average);

                        for (Alumno s : students) {
                            if (s.getNota() > highestGrade) {
                                highestGrade = s.getNota();
                                studentWithHighestGrade = s;
                            }
                        }
                        System.out.println("El alumno con mayor nota es: " + studentWithHighestGrade.getName() + " con una nota de: " + highestGrade);
                        break;

                    case 4:
                        System.out.println("Buscar alumno");
                        System.out.println("Ingrese el nombre del alumno a buscar");
                        String nameToSearch = in.next();
                        for (Alumno s : students) {
                            if (s.buscarAlumno(nameToSearch)) {
                                System.out.println("Alumno encontrado");
                                System.out.println("Nombre: " + s.getName() + ", Edad: " + s.getAge() + ", Nota: " + s.getNota());
                            }
                        }
                        break;

                    case 5:
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