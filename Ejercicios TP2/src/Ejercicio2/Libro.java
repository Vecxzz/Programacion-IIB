package Ejercicio2;

public class Libro implements Prestable {


    //Atributos
    private String title;
    private String author;
    private int yearOfPublication;
    private boolean borrowed;


    //Constructor
    public Libro(String title, String author, int yearOfPublication, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.borrowed = false;
    }


    //Métodos
    @Override
    public void prestar() {
        borrowed = true;
    }

    @Override
    public void devolver() {
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public String toString() {
        return "Título: " + title + ", Autor: " + author + ", Año de Publicación: " + yearOfPublication + ", Prestado: " + borrowed;
    }
}