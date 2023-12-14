package UsoBasico;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.security.sasl.SaslServer;

public class UsoBasico {

    public static void main(String[] args) throws UnknownHostException, IOException {
        
        int a = 10;

        System.out.println("Valor de a: " + a);

        int lista[] = {1,2,3,4,5,7,6,8,9,10};

        for(int i = 0; i < lista.length; i++)
        {
            for(int j = 0; j < lista.length; j++)
            {
                if(lista[i] < lista[j])
                {
                    int aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }


        for (int i = 0; i < lista.length; i++) {
            System.out.println("Valor de lista[" + i + "]: " + lista[i]);
        }

        Socket client = null;

        try {
            client = new Socket("localhost", 12421);
            // usa el socket
        } catch (UnknownHostException e) {
            // maneja la excepción UnknownHostException
        } catch (IOException e) {
            // maneja la excepción IOException
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    // maneja la excepción al cerrar el socket
                }
            }
        }


    }

    

    public static int obtenerMayor(int[] lista) {
        int mayor = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
        }
        return mayor;
    }
    
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;
        
        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        
        return fib;
    }

    
}
