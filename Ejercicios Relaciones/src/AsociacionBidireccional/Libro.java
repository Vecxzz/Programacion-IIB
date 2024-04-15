package AsociacionBidireccional;

import java.util.ArrayList;
import java.util.List;

public class Libro {


    //Atributos
    private String title;
    private List<Persona> owners;


    //Constructor
    public Libro(String title) {
        this.title = title;
        this.owners = new ArrayList<>();
    }


    //Getters
    public String getTitle() {
        return title;
    }

    public List<Persona> getOwners() {
        return owners;
    }


    //Métodos
    public void agregarDuenio(Persona persona) {
        owners.add(persona);
    }

    @Override
    public String toString() {
        return title;
    }
}