package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {


    //Atributos
    private String departamento;
    private List<Asignatura> asignaturas;


    //Constructor
    public Profesor(String nombre, int dni) {
        super(dni, nombre);
        this.asignaturas = new ArrayList<>();
    }
    public Profesor(int id, String nombre, String departamento, Asignatura asignatura) {
        super(id, nombre);
        this.departamento = departamento;
        this.asignaturas = new ArrayList<>();
        this.asignaturas.add(asignatura);
    }


    //Getter y Setter
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }


    //Métodos
    public void agregarAsignaturas(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void eliminarAsignatura(Asignatura asignatura) {
        asignaturas.remove(asignatura);
    }
}