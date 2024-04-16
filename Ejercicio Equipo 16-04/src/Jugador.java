public class Jugador {


    //Atributos
    private String nombre;
    private String posicion;
    private int numCamiseta;


    //Constructor
    public Jugador(String nombre, String posicion, int numCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
    }


    //Métodos
    @Override
    public String toString() {
        return "Jugador: " + "Nombre: " + nombre + ", Posicion: " + posicion + ", Número de Camiseta: " + numCamiseta;
    }
}