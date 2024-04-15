package AsociacionBidireccional;
import java.util.ArrayList;
import java.util.List;

public class Persona {


    //Atributos
    private String name;
    private List<Libro> books;


    //Constructor
    public Persona(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }


    //Getters
    public String getName() {
        return name;
    }

    public List<Libro> getBooks() {
        return books;
    }

    public void agregarLibro(Libro libro) {
        books.add(libro);
        libro.agregarDuenio(this);
    }

    @Override
    public String toString() {
        return name;
    }
}