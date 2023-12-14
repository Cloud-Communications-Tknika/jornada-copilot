package UsoBasico;

import java.util.Random;



public class Error {
    
    public static void main(String[] args) {
        
        Random r = new Random();

        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }

        System.out.println("La lista es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
