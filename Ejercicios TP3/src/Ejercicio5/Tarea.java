package Ejercicio5;

public class Tarea {


    //Atributos
    private String description;
    private int priority;


    //Constructor
    public Tarea(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }


    //Getters
    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}