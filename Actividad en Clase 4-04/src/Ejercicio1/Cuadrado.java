package Ejercicio1;

public class Cuadrado implements Firgura, Rotable, Dibujable {

    //Atributos
    private float lado;


    //Constructor
    public Cuadrado(float lado) {
        this.lado = lado;
    }


    //Getter and Setter
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    //Métodos
    @Override
    public void dibujar() {
        System.out.println("Se dibujó un Cuadrado");
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public void rotar() {
        System.out.println("Se rotó un Cuadrado");
    }
}