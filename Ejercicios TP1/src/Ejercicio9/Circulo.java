package Ejercicio9;

public class Circulo extends FiguraGeometrica {


    //Atributos
    private double radio;


    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }


    //Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    //Métodos
    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radio;
    }
}