package Ejercicio2;

public class Novela extends Libro {


    //Atributos
    private String gender;


    //Constructor
    public Novela(String title, String author, int yearOfPublication, boolean borrowed, String gender) {
        super(title, author, yearOfPublication, borrowed);
        this.gender = gender;
    }
}