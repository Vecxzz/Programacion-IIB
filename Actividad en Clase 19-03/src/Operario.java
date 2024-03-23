public class Operario extends Empleado {

    //Atributos
    private String position;


    //Constructor Vacio
    public Operario() {
    }


    //Constructor Sobrecargado
    public Operario(String name, String lastName, int id, String position) {
        super(name, lastName, id);
        this.position = position;
    }


    //Getter and Setter
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    //Métodos
    @Override
    public String toString() {
        return super.toString() + " - Operario" + " - Cargo: " + position;
    }

    public void operar() {
        System.out.println(name + " opero las maquinas");
    }
}