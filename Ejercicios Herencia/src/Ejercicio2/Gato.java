package Ejercicio2;

public class Gato extends Animal {

    private String race;

    public Gato() {
    }

    public Gato(String name, String gender, int age, String race) {
        super(name, gender, age);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }

    @Override
    public void informacion() {
        System.out.println("Raza: " + race);
    }
}