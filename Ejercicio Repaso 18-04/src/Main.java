public class Main {
    public static void main(String[] args) {


        //Crear objetos (Productos)
        Producto p1 = new Producto("Agua Saborizada", 1800, 20);
        Producto p2 = new Producto("Agua Mineral", 1000, 40);
        Producto p3 = new Producto("Agua Tonica", 1900, 25);
        Producto p4 = new Producto("Bebida Energizante", 2800, 50);
        Producto p5 = new Producto("Gaseosa", 2500, 10);


        //Crear objetos (Clientes)
        Cliente c1 = new Cliente("Ramiro", "Gimenez");
        c1.agregarProducto(p1);
        c1.agregarProducto(p4);


        //Crear objetos (Supermercado)
        Supermercado s1 = new Supermercado();


        //Agregar productos
        s1.agregarProducto(p1);
        s1.agregarProducto(p2);
        s1.agregarProducto(p3);
        s1.agregarProducto(p4);
        s1.agregarProducto(p5);


        //Mostrar inventario
        s1.mostrarInventario();

        System.out.println("-------------------------------");

        //Calcular total
        double total = c1.calcularTotalCompra();
        System.out.println("Total de la compra de: " + c1.getNombre() + " $" + total);


        //Realizar compra
        s1.realizarCompra(c1);
    }
}