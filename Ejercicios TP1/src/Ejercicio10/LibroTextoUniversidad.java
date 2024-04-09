package Ejercicio10;

public class LibroTextoUniversidad extends LibroTexto {


    //Atributos
    private String university;


    //Constructor
    public LibroTextoUniversidad(String title, String author, double price, String course, String university) {
        super(title, author, price, course);
        this.university = university;
    }


    //Métodos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Universidad que lo publico: " + university);
    }
}