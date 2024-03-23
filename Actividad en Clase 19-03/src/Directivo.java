public class Directivo extends Empleado {

    //Atrubutos
    private String department;


    //Constructor Vacio
    public Directivo() {
    }


    //Constructor Sobrecargado
    public Directivo(String name, String lastName, int id, String department) {
        super(name, lastName, id);
        this.department = department;
    }


    //Getter and Setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    //Métodos
    @Override
    public String toString() {
        return super.toString() + " - Directivo" + " - Departamento: " + department;
    }

    public void supervisar() {
        System.out.println(name + " superviso las actividades realizadas");
    }
}