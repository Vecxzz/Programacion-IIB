package Ejercicio2;

public class Pajaro extends Animal {

    private String species;

    public Pajaro() {
    }

    public Pajaro(String name, String gender, int age, String species) {
        super(name, gender, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro canta");
    }

    @Override
    public void informacion() {
        System.out.println("Especie: " + species);
    }
}