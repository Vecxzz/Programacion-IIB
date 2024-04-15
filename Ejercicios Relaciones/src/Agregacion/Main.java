package Agregacion;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        Empleado e1 = new Empleado("Alvaro", "Programador");
        Empleado e2 = new Empleado("David", "Diseñador");
        Empleado e3 = new Empleado("Agustín", "Diseñador");

        Departamento d1 = new Departamento("Desarrollo de Software");
        Departamento d2 = new Departamento("Diseño Gráfico");


        //Invocar métodos
        d1.agregarEmpleado(e1);
        d2.agregarEmpleado(e2);
        d2.agregarEmpleado(e2);


        //Mostrar información
        System.out.println("Empleados del departamento " + d1.getName() + ":");
        for (Empleado empleado : d1.getEmployees()) {
            System.out.println("- Nombre: " + empleado.getName() + ", Cargo: " + empleado.getPosition());
        }

        System.out.println("Empleados del departamento " + d2.getName() + ":");
        for (Empleado empleado : d2.getEmployees()) {
            System.out.println("- Nombre: " + empleado.getName() + ", Cargo: " + empleado.getPosition());
        }
    }
}