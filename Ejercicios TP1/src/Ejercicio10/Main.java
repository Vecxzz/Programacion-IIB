package Ejercicio10;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        LibroTexto lt1 = new LibroTexto("Aprendiendo Java", "Martin C. Howard", 8500.120, "Laboratorio de Computación");
        LibroTextoUniversidad ltu1 = new LibroTextoUniversidad("Historia Argentina", "Alejandra Giménez", 4300, "Historia II", "Universidad Nacional de Buenos Aires");
        Novela n1 = new Novela("El Bosque Maldito", "Agustina Fernández", 8250.80, "Terror");


        //Invocar los Métodos
        lt1.mostrarDatos();
        System.out.println("---------------------");
        ltu1.mostrarDatos();
        System.out.println("---------------------");
        n1.mostrarDatos();
    }
}