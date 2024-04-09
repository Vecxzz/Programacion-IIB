package Ejercicio10;

public class Libro {


    //Atributos
    private String title;
    private String author;
    private double price;


    //Constructor
    public Libro(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    //Getter y Setter
    public String getTitulo() {
        return title;
    }

    public void setTitulo(String titulo) {
        this.title = titulo;
    }

    public String getAutor() {
        return author;
    }

    public void setAutor(String autor) {
        this.author = autor;
    }

    public double getPrecio() {
        return price;
    }

    public void setPrecio(double precio) {
        this.price = precio;
    }


    //Métodos
    public void mostrarDatos() {
        System.out.println("Datos del libro:");
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Precio: $" + price);
    }
}