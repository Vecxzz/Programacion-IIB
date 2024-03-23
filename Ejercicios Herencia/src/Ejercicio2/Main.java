package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Beto", "Macho", 4, "Caniche");
        Gato gato1 = new Gato("Luna", "Hembra", 3, "Siamés");
        Pajaro pajaro1 = new Pajaro("Blue", "Macho", 5, "Guacamayo");

        //Llamar a los métodos
        perro1.hacerSonido();
        perro1.informacion();
    }
}