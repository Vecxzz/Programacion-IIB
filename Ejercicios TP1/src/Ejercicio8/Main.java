package Ejercicio8;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        Gerente g1 = new Gerente("David", 37, 300000, "Recursos Humanos");
        Trabajador t1 = new Trabajador("Ana", 29, 180000, "Desarrollo");


        //Invocar los Métodos
        g1.work();
        t1.work();
    }
}