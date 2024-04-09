package Ejercicio10;

public class Novela extends Libro {


    //Atributos
    private String type;


    //Constructor
    public Novela(String title, String autor, double price, String type) {
        super(title, autor, price);
        this.type = type;
    }


    //Métodos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de novela: " + type);
    }
}