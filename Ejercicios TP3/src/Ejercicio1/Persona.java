package Ejercicio1;

public class Persona {


    //Atributos
    private String nombre;
    private int dni;


    //Constructor
    public Persona(int idn, String nombre) {
        this.nombre = nombre;
        this.dni = dni;
    }


    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}