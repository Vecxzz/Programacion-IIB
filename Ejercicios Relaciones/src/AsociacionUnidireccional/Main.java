package AsociacionUnidireccional;

public class Main {
    public static void main(String[] args) {


        //Crear objetos
        Universidad uni1 = new Universidad("Universidad de Buenos Aires");
        Universidad uni2 = new Universidad("Universidad de Mendoza");

        Estudiante e1 = new Estudiante("Martín", uni1);
        Estudiante e2 = new Estudiante("Agostina", uni2);


        //Mostrar datos
        System.out.println(e1.getName() + " pertenece a la universidad: " + e1.getUniversidad().getName());
        System.out.println(e2.getName() + " pertenece a la universidad: " + e2.getUniversidad().getName());


        //Inocar métodos
        e1.cambiarUniversidad(uni2);
        System.out.println(e1.getName() + " ahora pertenece a la universidad: " + e1.getUniversidad().getName());
    }
}