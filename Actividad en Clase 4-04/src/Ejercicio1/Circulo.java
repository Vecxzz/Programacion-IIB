package Ejercicio1;

public class Circulo implements Firgura, Dibujable {

    //Atributos
    private double radio;


    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }


    //Getter and Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    //Métodos
    @Override
    public void dibujar() {
        System.out.println("Se dibujó un Círculo");
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}