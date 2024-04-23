public class Producto {


    //Atributos
    private String nombre;
    private double precio;
    private int cantidadStock;


    //Constructor
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }


    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }


    @Override
    public String toString() {
        return "Producto: " + "Nombre: " + nombre + ", Precio: " + precio + ", Cantidad Stock: " + cantidadStock;
    }
}