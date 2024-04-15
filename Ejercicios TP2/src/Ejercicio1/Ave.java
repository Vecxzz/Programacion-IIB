package Ejercicio1;

public class Ave extends Animal {


    //Atributos
    private String species;
    private boolean talk;


    //Constructor
    public Ave(String name, int age, String type, double price, String species, boolean talk) {
        super(name, age, type, price);
        this.species = species;
        this.talk = talk;
    }
}