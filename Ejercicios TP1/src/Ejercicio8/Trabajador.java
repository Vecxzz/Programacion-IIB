package Ejercicio8;

public class Trabajador extends Empleado {


    //Atributos
    private String area;


    //Constructor
    public Trabajador(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }


    //Métodos
    @Override
    public void work() {
        System.out.println("Empleado/a " + name + " trabajo en el área de: " + area);
    }
}