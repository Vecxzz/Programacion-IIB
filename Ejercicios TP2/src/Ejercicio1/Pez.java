package Ejercicio1;

public class Pez extends Animal {


    //Atributos
    private String species;
    private boolean sweetWater;


    //Constructor
    public Pez(String name, int age, String type, double price, String species, boolean sweetWater) {
        super(name, age, type, price);
        this.species = species;
        this.sweetWater = sweetWater;
    }
}