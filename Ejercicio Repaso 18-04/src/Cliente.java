import java.util.ArrayList;
import java.util.List;

public class Cliente {


    //Atributos
    private String nombre;
    private String apellido;
    private List<Producto> carrito;


    //Constructor
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrito = new ArrayList<>();
    }


    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }


    //Métodos
    public void agregarProducto(Producto producto) {
        carrito.add(producto);
    }

    public double calcularTotalCompra() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }
}