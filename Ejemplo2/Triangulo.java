package Ejemplo2;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo() {
        // Constructor vacío
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }
    
}
