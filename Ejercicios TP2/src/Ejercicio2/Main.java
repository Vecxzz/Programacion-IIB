package Ejercicio2;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        Biblioteca b1 = new Biblioteca();
        Novela n1 = new Novela("Alicia en el Pais de las Maravillas", "Lewis Carroll", 1865, true, "Fantasia");
        Universitario u1 = new Universitario("JAVA desde cero", "Daniel A.", 2000, false, "Programación");
        Infantil i1 = new Infantil("Zona Recreo", "Martina N.", 2018, false, "Pintar");


        //Invocar métodos
        b1.agregarLibro(n1);
        b1.agregarLibro(u1);
        b1.agregarLibro(i1);
        b1.listarLibros();

        System.out.println("---------------------");

        b1.prestarLibro("JAVA desde cero");
        b1.listarLibros();

        System.out.println("---------------------");

        b1.devolverLibro("Alicia en el Pais de las Maravillas");
        b1.listarLibros();
    }
}