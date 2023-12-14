package UsoBasico;

import java.util.Random;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;

public class UsoBasico {





        public static void main(String[] args) {
            try {
                Socket socket = new Socket("localhost", 11232);
                OutputStream outputStream = socket.getOutputStream();


                // Use the socket object for further operations
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Calculates the Fibonacci number for a given input.
     * 
     * @param n the input number, must be greater than or equal to zero
     * @return the Fibonacci number for the given input
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int menor(int[] lista) {
        int menor = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] < menor) {
                menor = lista[i];
            }
        }
        return menor;
    }
}
