package Ejercicio8;

public class Gerente extends Empleado {


    //Atributos
    private String department;


    //Constructor
    public Gerente(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }


    //Getter y Setter
    public String getDepartamento() {
        return department;
    }

    public void setDepartamento(String department) {
        this.department = department;
    }


    //Métodos
    @Override
    public void work() {
        System.out.println("Gerente/a " + name + " organizo las actividades en el sector de: " + department );
    }
}