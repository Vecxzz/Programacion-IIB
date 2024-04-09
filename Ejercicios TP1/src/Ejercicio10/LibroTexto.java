package Ejercicio10;

public class LibroTexto extends Libro {


    //Atributos
    private String course;


    //Constructor
    public LibroTexto(String title, String author, double price, String course) {
        super(title, author, price);
        this.course = course;
    }


    //Métodos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Curso al que pertenece: " + course);
    }
}