package UsoBasico;

public class DocumentarTest {
    
    public static void main(String[] args) {
        // Prueba 1: cadena contiene el valor
        char[] cadena1 = {'a', 'b', 'c'};
        char valor1 = 'b';
        boolean resultado1 = Documentar.containsChar(cadena1, valor1);
        System.out.println("Prueba 1: " + resultado1); // Debería imprimir true

        // Prueba 2: cadena no contiene el valor
        char[] cadena2 = {'x', 'y', 'z'};
        char valor2 = 'a';
        boolean resultado2 = Documentar.containsChar(cadena2, valor2);
        System.out.println("Prueba 2: " + resultado2); // Debería imprimir false

        // Prueba 3: cadena vacía
        char[] cadena3 = {};
        char valor3 = 'a';
        boolean resultado3 = Documentar.containsChar(cadena3, valor3);
        System.out.println("Prueba 3: " + resultado3); // Debería imprimir false
    }
}

