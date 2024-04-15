package Ejercicio1;

public class Gato extends Animal {


    //Atributos
    private String race;
    private boolean sterilized;


    //Constructor
    public Gato(String name, int age, String type, double price, String race, boolean sterilized) {
        super(name, age, type, price);
        this.race = race;
        this.sterilized = sterilized;
    }
}