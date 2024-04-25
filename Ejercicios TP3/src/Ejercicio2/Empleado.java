package Ejercicio2;

public class Empleado {


    //Atributos
    private String name;
    private Empleado supervisor;


    //Constructor
    public Empleado(String name) {
        this.name = name;
    }


    //Getters
    public String getName() {
        return name;
    }


    //Metodos
    public void assignSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisorName() {
        if (supervisor == null) {
            return "Sin supervisor";
        } else {
            return supervisor.name;
        }
    }
}