package Ejemplo1;

public class CrearFunciones {
    public static void main(String[] args) {
        
        int a[] = {7, 14, 9, 18, 11, 6, 13, 12, 1, 5, 4, 3, 2, 8, 10};

        System.out.println("La suma de los elementos del arreglo es: " + suma(a));
        System.out.println("El promedio de los elementos del arreglo es: " + promedio(a));
        System.out.println("El mayor de los elementos del arreglo es: " + mayor(a));
        System.out.println("El menor de los elementos del arreglo es: " + menor(a));
        System.out.println("El arreglo invertido es: ");
        invertir(a);
        System.out.println("El arreglo ordenado es: ");
        ordenar(a);
    }

    public static int suma(int[] arreglo){
        int suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        return suma;
    }

    public static double promedio(int[] arreglo){
        return suma(arreglo) / arreglo.length;
    }

    public static int mayor(int[] arreglo){
        int mayor = arreglo[0];
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i] > mayor){
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    public static int menor(int[] arreglo){
        int menor = arreglo[0];
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        return menor;
    }

    public static void invertir(int[] arreglo){
        for(int i = arreglo.length - 1; i >= 0; i--){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void ordenar(int[] arreglo){
        int aux;
        for(int i = 0; i < arreglo.length - 1; i++){
            for(int j = 0; j < arreglo.length - 1; j++){
                if(arreglo[j] > arreglo[j + 1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
    
    



