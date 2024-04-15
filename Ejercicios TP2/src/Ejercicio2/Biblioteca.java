package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {


    //Atributos
    private List<Libro> libros;


    //Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }


    //Métodos
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        System.out.println("Lista de Libros:");
        for (Libro libro : libros) {
            if (!libro.isBorrowed()) {
                System.out.println(libro);
            }
        }
    }

    public void prestarLibro(String titulo) {
      for (Libro libro : libros) {
          if (libro instanceof Prestable && libro.toString().contains(titulo)) {
              Prestable prestable = (Prestable) libro;
              if (!libro.isBorrowed()) {
                  prestable.prestar();
                  System.out.println("Se ha prestado el libro: " + libro);
                  return;
              } else {
                  System.out.println("El libro: " + libro + " ya está prestado");
                  return;
              }
          }
      }
        System.out.println("No se encontró el libro con el título: " + titulo);
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro instanceof Prestable && libro.toString().contains(titulo)) {
                Prestable prestable = (Prestable) libro;
                if (!libro.isBorrowed()) {
                    prestable.devolver();
                    System.out.println("El libro: " + libro + " ha sido devuelto");
                    return;
                } else {
                    System.out.println("El libro: " + libro + " no está prestado");
                    return;
                }
            }
        }
        System.out.println("No se encontró el libro con el título: " + titulo);
    }
}