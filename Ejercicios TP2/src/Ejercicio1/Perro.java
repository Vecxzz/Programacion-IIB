package Ejercicio1;

public class Perro extends Animal {


    //Atributos
    private String race;
    private boolean vaccinated;


    //Constructor
    public Perro(String name, int age, String type, double price, String race, boolean vaccinated) {
        super(name, age, type, price);
        this.race = race;
        this.vaccinated = vaccinated;
    }
}