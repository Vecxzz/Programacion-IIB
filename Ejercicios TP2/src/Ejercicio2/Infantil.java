package Ejercicio2;

public class Infantil extends Libro {


    //Atributos
    private String category;


    //Constructor
    public Infantil(String title, String author, int yearOfPublication, boolean borrowed, String category) {
        super(title, author, yearOfPublication, borrowed);
        this.category = category;
    }
}