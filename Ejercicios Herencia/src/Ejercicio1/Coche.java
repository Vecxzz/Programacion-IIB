package Ejercicio1;

public class Coche extends Vehiculo {

    private double speed;
    private double displacement;

    public Coche() {
    }

    public Coche(String color, int wheels, double speed, double displacement) {
        super(color, wheels);
        this.speed = speed;
        this.displacement = displacement;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + " Ruedas: " + getWheels() + "." + " Velocidad: " + speed + "." + " Cilindrada: " + displacement + ".";
    }
}