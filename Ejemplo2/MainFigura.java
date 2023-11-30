package Ejemplo2;

public class MainFigura {

    public static void main(String[] args) {
        
        Figura f[] = new Figura[3];

        f[0] = new Circulo(5);
        f[1] = new Rectangulo(5, 10);
        f[2] = new Triangulo(5, 10);

        for (int i = 0; i < f.length; i++) {
            System.out.println("El area de la figura " + (i + 1) + " es: " + f[i].area());
        }
    }
    
}
