package Ejemplo2;

public class Circulo extends Figura{

    private double radio;

    public Circulo() {
        // Constructor vacío
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
}
