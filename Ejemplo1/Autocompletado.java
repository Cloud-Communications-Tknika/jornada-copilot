package Ejemplo1;

public class Autocompletado {
    public static void main(String[] args) {
        
        int a[] = {1, 5, 9, 2, 5, 8, 7, 6};

        int mayor = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > mayor){
                mayor = a[i];
            }
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }



        

    }
}
