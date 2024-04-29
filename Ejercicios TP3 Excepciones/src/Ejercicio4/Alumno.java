package Ejercicio4;

public class Alumno {


    //Atributos
    private String name;
    private int age;
    private double grade;


    //Constructor
    public Alumno(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getNota() {
        return grade;
    }

    //Métodos
    public boolean buscarAlumno(String name) {
        return this.name.equalsIgnoreCase(name);
    }
}