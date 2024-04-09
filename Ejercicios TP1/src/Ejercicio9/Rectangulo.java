package Ejercicio9;

public class Rectangulo extends FiguraGeometrica {


    //Atributos
    private double base;
    private double height;


    //Constructor
    public Rectangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }


    //Getter y Setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //Métodos
    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public double calculatePerimeter() {
        return (base * 2) + (height * 2);
    }
}