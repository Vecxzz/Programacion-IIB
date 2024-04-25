package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Grupo {


    //Atributos
    private String curso;
    private char letra;
    private Alumno alumnos[] = new Alumno[5];
    private List<Asignatura> asignaturas = new ArrayList<>();


    //Constructor
    public Grupo(String curso, char letra, Alumno alumno) {
        this.curso = curso;
        this.letra = letra;
        this.alumnos[0] = alumno;
    }


    //Getter y Setter
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }


    //Métodos
    public void agregarAlumno(int posicion, Alumno alumno) {
        if (posicion>-1 && posicion<5) {
            if (alumnos[posicion] == null) {
                alumnos[posicion] = alumno;
            }
        }
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void agregarAsignaturas(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }
}