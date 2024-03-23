package Ejercicio1;

public abstract class Vehiculo {

    protected String color;
    protected int wheels;

    public Vehiculo() {
    }

    public Vehiculo(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return super.toString() + " Color: " + color + " Ruedas: " + wheels;
    }
}