package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {


    //Atributos
    private String nombre;
    private int aula;
    private String hora;
    private Profesor profesor;
    private List<Grupo> grupos = new ArrayList<>();


    //Constructor
    public Asignatura(String nombre, int aula, String hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.hora = hora;
    }


    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getAula() {
        return aula;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }


    //Métodos
    public void agregarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    public void eliminarGrupo(Grupo grupo) {
        for (Grupo g : grupos) {
            if (g == grupo) {
                grupos.remove(g);
            } else {
                System.out.println("El grupo no ha sido encontrado");
            }
        }
    }
}