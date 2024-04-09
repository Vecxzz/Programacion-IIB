package Ejercicio8;

public abstract class Empleado {
    
    
    //Atributos
    protected String name;
    protected int age;
    protected double salary;
    
    
    //Constructor
    public Empleado(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract void work();

}