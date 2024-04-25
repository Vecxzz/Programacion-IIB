package Ejercicio2;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        Empleado e1 = new Empleado("David");
        Empleado e2 = new Empleado("Martina");


        //Invocar métodos
        e1.assignSupervisor(e2);
        System.out.println("El supervisor de " + e1.getName() + " es " + e1.getSupervisorName());
    }
}