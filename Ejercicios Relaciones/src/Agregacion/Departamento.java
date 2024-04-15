package Agregacion;
import java.util.ArrayList;
import java.util.List;

public class Departamento {


    //Atributos
    private String name;
    private List<Empleado> employees;


    //Constructor
    public Departamento(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }


    //Getters
    public String getName() {
        return name;
    }

    public List<Empleado> getEmployees() {
        return employees;
    }


    //Métodos
    public void agregarEmpleado(Empleado empleado) {
        employees.add(empleado);
    }
}