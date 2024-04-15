package Ejercicio2;

public class Universitario extends Libro {


    //Atributos
    private String course;


    //Constructor
    public Universitario(String title, String author, int yearOfPublication, boolean borrowed, String course) {
        super(title, author, yearOfPublication, borrowed);
        this.course = course;
    }
}