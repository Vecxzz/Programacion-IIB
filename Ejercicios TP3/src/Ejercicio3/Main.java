package Ejercicio3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //Crear lista
        List<String> diasSemana = new ArrayList<>();
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");

        //Inserta en la posición 4 el elemento "Juernes"
        diasSemana.add(4, "Juernes");
        System.out.println("Se inserto Juernes en la posición 4");

        System.out.println("----------------------------");

        //Muestra el contenido de las posiciones 3 y 4 de la lista
        System.out.println("Posición 3: " + diasSemana.get(3));
        System.out.println("Posición 4: " + diasSemana.get(4));

        System.out.println("----------------------------");

        //Muestra el primer elemento y el último de la lista
        System.out.println("Primer elemento de la lista: " + diasSemana.get(0));
        System.out.println("Último elemento de la lista: " + diasSemana.get(diasSemana.size() - 1));

        System.out.println("----------------------------");

        //Elimina el elemento que contenga "Juernes" de la lista y comprueba que haya sido eliminado
        diasSemana.remove("Juernes");
        System.out.println("Elemento Juernes ha sido eliminado");
        System.out.println("¿Existe un elemento llamado Juernes? " + diasSemana.contains("Juernes"));

        System.out.println("----------------------------");

        //Crea un iterador y muestras uno a uno los valores de la lista
        System.out.println("Elementos de la lista:");
        Iterator<String> iterador = diasSemana.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("----------------------------");

        //Busca si existe en la lista un elemento que se denomine "Lunes"
        System.out.println("¿Existe un elemento llamado Lunes? " + diasSemana.contains("Lunes"));

        System.out.println("----------------------------");

        //Borra todos los elementos de la lista
        System.out.println("Eliminar todos los elementos de la lista");
        diasSemana.clear();
        System.out.println("Tamaño de la lista: " + diasSemana.size());
    }
}