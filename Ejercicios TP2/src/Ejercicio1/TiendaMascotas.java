package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TiendaMascotas {


    //Atributos
    private List<Animal> animals;


    public TiendaMascotas() {
        animals = new ArrayList<>();
    }

    //Métodos
    public void agregarAnimal(Animal animal) {
        animals.add(animal);
    }

    public void venderAnimal(String nombre) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).toString().contains(nombre)) {
                animals.remove(i);
                System.out.println("Se ha vendido el animal: " + nombre);
                return;
            }
        }
        System.out.println("No se encontró el animal con el nombre: " + nombre);
    }

    public void alimentarAnimal(String nombre) {
        for (Animal animal : animals) {
            if (animal.toString().contains(nombre)) {
                animal.alimentar(nombre);
                return;
            }
        }
        System.out.println("No se encontró el animal con el nombre: " + nombre);
    }

    public void listarAnimales() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}