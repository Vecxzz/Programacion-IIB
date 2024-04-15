package Ejercicio1;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        TiendaMascotas tm1 = new TiendaMascotas();
        Perro p1 = new Perro("Tobi", 1, "Perro", 22500, "Chihuahua", true);
        Perro p2 = new Perro("Azul", 2, "Perro", 300000, "Pastor Aleman", false);
        Gato g1 = new Gato("Kitty", 2, "Gato", 42800, "Siames", true);
        Ave a1 = new Ave("Blue", 1, "Ave", 2500000, "Guacamayo Azul", false);
        Pez pe1 = new Pez("Nemo", 2, "Pez", 20400, "Pez Payaso", false);


        //Invocar métodos
        tm1.agregarAnimal(p1);
        tm1.agregarAnimal(p2);
        tm1.agregarAnimal(g1);
        tm1.agregarAnimal(a1);
        tm1.agregarAnimal(pe1);

        tm1.listarAnimales();

        System.out.println("------------------------------");

        tm1.venderAnimal("Azul");
        tm1.venderAnimal("Nemo");

        tm1.listarAnimales();

        System.out.println("------------------------------");

        tm1.alimentarAnimal("Tobi");
        tm1.alimentarAnimal("Kitty");
        tm1.alimentarAnimal("Blue");
    }
}