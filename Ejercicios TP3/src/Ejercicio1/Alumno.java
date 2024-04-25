package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {


    //Atributos
    private List<Grupo> grupos = new ArrayList<>();


    //Constructor
    public Alumno(String nombre, int dni) {
        super(dni, nombre);
    }


    //Getters
    public List<Grupo> getGrupos() {
        return grupos;
    }


    //Métodos
    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }
}