package AsociacionBidireccional;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        Persona p1 = new Persona("María");
        Persona p2 = new Persona("Julián");


        Libro l1 = new Libro("El Principito");
        Libro l2 = new Libro("Alicia en el Pais de las Maravillas");
        Libro l3 = new Libro("La Bella Durmiente");


        //Invocar métodos
        p1.agregarLibro(l1);
        p1.agregarLibro(l2);
        p2.agregarLibro(l3);


        //Mostrar información
        System.out.println("Lista de libros de " + p1.getName() + ":");
        for (Libro libro : p1.getBooks()) {
            System.out.println("- " + libro.getTitle());
        }

        System.out.println("El libro " + l1.getTitle() + " es propiedad de:");
        for (Persona persona: l1.getOwners()) {
            System.out.println("- " + persona.getName());
        }
    }
}