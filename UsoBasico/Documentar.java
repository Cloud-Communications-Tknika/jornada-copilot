package UsoBasico;

public class Documentar {
    public static void main(String[] args) {

        char caracteres[] = new char[52];
        char numeros[] = {'1','2','3','4','5','6','7','8','9','0'};
        char especiales[] = {'!','@','#','$','%','^','&','*','(', ')'};

        rellenarCaracteres(caracteres);

        int opcion;

        while((opcion = menu())!= 4)
        {
            switch(opcion)
            {
                case 1:
                    imprimirConComas(especiales);
                    imprimirConComas(numeros);
                    imprimirConComas(caracteres);
                    break;
                case 2:
                    crearContraseñaDebil(caracteres, numeros);
                    break;
                case 3:
                    crearContraseñaFuerte(caracteres, numeros, especiales);
                    break;
            }
       
        }
    }

    public static void rellenarCaracteres(char caracteres[])
    {
        int i = 0;
        for(char c = 'a'; c <= 'z'; c++){
            caracteres[i] = c;
            i++;
        }
        for(char c = 'A'; c <= 'Z'; c++){
            caracteres[i] = c;
            i++;
        }
    }

    public static void imprimir(char[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        }
        System.out.print("\n");
    }

    public static void imprimirConComas(char[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + ", ");
        }
        System.out.print(".\n");
    }

    public static void crearContraseñaDebil(char caracteres[], char numeros[])
    {
        int indice = 0;
        int numNumeros = 0;
        int numCaracteres = 0;
        int valorAleatorio;
        char contraseña[] = new char[8];

        while(indice < 8)
        {
            valorAleatorio = (int) (Math.random() * 2);
            if((valorAleatorio == 0) && (numCaracteres < 5))
            {
                valorAleatorio = (int) (Math.random() * 52);
                contraseña[indice] = caracteres[valorAleatorio];
                numCaracteres++;
                indice++;
            }
            if((valorAleatorio == 1) && (numNumeros < 3))
            {
                valorAleatorio = (int) (Math.random() * 10);
                contraseña[indice] = numeros[valorAleatorio];
                numNumeros++;
                indice++;
            }
        
        }
        imprimir(contraseña);
    }


    public static void crearContraseñaFuerte(char caracteres[], char numeros[], char especiales[])
    {
        int indice = 1;
        int numNumeros = 0;
        int numCaracteres = 0;
        int numEspeciales = 1;
        int valorAleatorio;
        char caracterAIntroducir;
        char contraseña[] = new char[14];
        valorAleatorio = (int) (Math.random() * 10);
        contraseña[0] = especiales[valorAleatorio];
        while(indice < 14)
        {
            valorAleatorio = (int) (Math.random() * 3);

            if((valorAleatorio == 0) && (numCaracteres < 6))
            {

                valorAleatorio = (int) (Math.random() * 52);
                caracterAIntroducir = caracteres[valorAleatorio];

                while(containsChar(contraseña, caracterAIntroducir))
                {
                    valorAleatorio = (int) (Math.random() * 52);
                    caracterAIntroducir = caracteres[valorAleatorio];
                }
                contraseña[indice] = caracterAIntroducir;
                numCaracteres++;
                indice++;
            }
            if((valorAleatorio == 1) && (numNumeros < 5))
            {
                valorAleatorio = (int) (Math.random() * 10);
                caracterAIntroducir = numeros[valorAleatorio];

                while(containsChar(contraseña, caracterAIntroducir))
                {
                    valorAleatorio = (int) (Math.random() * 10);
                    caracterAIntroducir = numeros[valorAleatorio];
                }
                contraseña[indice] = caracterAIntroducir;
                numNumeros++;
                indice++;
            }
            if((valorAleatorio == 2) && (numEspeciales < 3))
            {
                valorAleatorio = (int) (Math.random() * 10);
                caracterAIntroducir = especiales[valorAleatorio];

                while(containsChar(contraseña, caracterAIntroducir))
                {
                    valorAleatorio = (int) (Math.random() * 10);
                    caracterAIntroducir = especiales[valorAleatorio];
                }
                contraseña[indice] = caracterAIntroducir;
                numEspeciales++;
                indice++;
            }
        }
        imprimir(contraseña);
    }

    public static boolean containsChar(char cadena[], char valor)
    {
        for(int i = 0; i < cadena.length; i++)
        {
            if(cadena[i] == valor)
            {
                return true;
            }
        }
        return false;
    
    }

    

    public static int menu()
    {
        System.out.println("1. Imprimir cadenas");
        System.out.println("2. Generar Contrasena debil");
        System.out.println("3. Generar Contrasena fuerte");
        System.out.println("4. Salir");
        return Integer.parseInt(System.console().readLine());
    
    }
}
