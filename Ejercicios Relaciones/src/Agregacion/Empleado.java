package Agregacion;

public class Empleado {


    //Atributos
    private String name;
    private String position;


    //Constructor
    public Empleado(String name, String position) {
        this.name = name;
        this.position = position;
    }


    //Getters
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}