package Ejercicio1;

public class Camioneta extends Vehiculo {

    private double burden;

    public Camioneta() {
    }

    public Camioneta(String color, int wheels, double burden) {
        super(color, wheels);
        this.burden = burden;
    }

    public double getBurden() {
        return burden;
    }

    public void setBurden(double burden) {
        this.burden = burden;
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + "." + " Ruedas: " + getWheels() + "." + " Carga: " + burden + ".";
    }

}