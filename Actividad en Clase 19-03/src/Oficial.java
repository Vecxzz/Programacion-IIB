public class Oficial extends Operario {

    //Atributos
    private int yearsExperience;


    //Constructor Vacio
    public Oficial() {
    }


    //Constructor Sobrecargado
    public Oficial(String name, String lastName, int id, String position, int yearsExperience) {
        super(name, lastName, id, position);
        this.yearsExperience = yearsExperience;
    }


    //Getter and Setter
    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }


    //Métodos
    @Override
    public String toString() {
        return super.toString() + " - Oficial" + " - Años de Experiencia: " + yearsExperience;
    }

    public void dirigir() {
        System.out.println(name + " dirigio las actividades realizadas");
    }


}