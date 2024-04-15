package AsociacionUnidireccional;

public class Estudiante {


    //Atributos
    private String name;
    private Universidad universidad;


    //Constructor
    public Estudiante(String name, Universidad universidad) {
        this.name = name;
        this.universidad = universidad;
    }


    //Getter y Setter
    public String getName() {
        return name;
    }

    public Universidad getUniversidad() {
        return universidad;
    }


    //Métodos
    public void cambiarUniversidad(Universidad nuevaUniversidad) {
        this.universidad = nuevaUniversidad;
    }
}