package Ejercicio1;

public class Animal {


    //Atributos
    protected String name;
    protected int age;
    protected String type;
    protected double price;


    //Constructor
    public Animal(String name, int age, String type, double price) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.price = price;
    }


    //Métodos
    public void alimentar(String name) {
        System.out.println(name + " ha sido alimentado");
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Edad: " + age + ", Tipo: " + type + ", Precio: " + price;
    }
}