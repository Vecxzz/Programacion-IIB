public class Tecnico extends Operario {

    //Atributos
    private String specialization;


    //Constructor Vacio
    public Tecnico() {
    }


    //Constructor Sobrecargado
    public Tecnico(String name, String lastName, int id, String position, String specialization) {
        super(name, lastName, id, position);
        this.specialization = specialization;
    }


    //Getter and Setter
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    //Métodos
    @Override
    public String toString() {
        return super.toString() + " - Técnico" + " - Especialización: " + specialization;
    }

    public void programar() {
        System.out.println(name + " esta realizando tareas de mantenimiento");
    }
}