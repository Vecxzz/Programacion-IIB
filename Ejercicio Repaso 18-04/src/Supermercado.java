import java.util.ArrayList;
import java.util.List;

public class Supermercado {


    //Atributos
    private List<Producto> inventario;


    //Constructor
    public Supermercado() {
        this.inventario = new ArrayList<>();
    }


    //Métodos
    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public Producto buscarProducto(String nombre){
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarCompra(Cliente cliente) {
        for (Producto producto : cliente.getCarrito()) {
            if (inventario.contains(producto)) {
                inventario.remove(producto);
            }
        }
        cliente.getCarrito().clear();
    }

    public void mostrarInventario() {
        System.out.println("Inventario de Productos:");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
}