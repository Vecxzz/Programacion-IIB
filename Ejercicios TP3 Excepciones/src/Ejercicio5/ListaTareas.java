package Ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListaTareas implements Iterable<Tarea> {


    //Atributos
    private List<Tarea> tareas;


    //Constructor
    public ListaTareas() {
        tareas = new ArrayList<>();
    }


    //Métodos
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        ordenarPorPrioridad();
    }

    public void eliminarTarea(String descripcion) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getDescription().equals(descripcion)) {
                tareas.remove(i);
            }
        }
    }

    public int obtenerTotalTareas() {
        return tareas.size();
    }

    public void ordenarPorPrioridad() {
        tareas.sort(Comparator.comparingInt(Tarea::getPriority).reversed());
    }

    @Override
    public Iterator<Tarea> iterator() {
        return tareas.iterator();
    }
}