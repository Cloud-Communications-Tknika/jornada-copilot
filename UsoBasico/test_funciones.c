#include <stdio.h>
#include <stdbool.h>
#include "funciones.h"

// Prototipo de la función


int main()
{
    // Pruebas con números primos
    printf("%d\n", esPrimo(2));  // Debería imprimir 1 (true)
    printf("%d\n", esPrimo(3));  // Debería imprimir 1 (true)
    printf("%d\n", esPrimo(5));  // Debería imprimir 1 (true)
    printf("%d\n", esPrimo(7));  // Debería imprimir 1 (true)
    printf("%d\n", esPrimo(11)); // Debería imprimir 1 (true)

    // Pruebas con números no primos
    printf("%d\n", esPrimo(4));   // Debería imprimir 0 (false)
    printf("%d\n", esPrimo(6));   // Debería imprimir 0 (false)
    printf("%d\n", esPrimo(8));   // Debería imprimir 0 (false)
    printf("%d\n", esPrimo(9));   // Debería imprimir 0 (false)
    printf("%d\n", esPrimo(10));  // Debería imprimir 0 (false)


    // Pruebas con números en la lista
    int lista1[] = {1, 2, 3, 4, 5};
    int numeroDeElementos1 = sizeof(lista1) / sizeof(lista1[0]);
    int numero1 = 3;
    printf("%d\n", contains(lista1, numeroDeElementos1, numero1));  // Debería imprimir 1 (true)

    int lista2[] = {10, 20, 30, 40, 50};
    int numeroDeElementos2 = sizeof(lista2) / sizeof(lista2[0]);
    int numero2 = 40;
    printf("%d\n", contains(lista2, numeroDeElementos2, numero2));  // Debería imprimir 1 (true)

    // Pruebas con números no en la lista
    int lista3[] = {1, 2, 3, 4, 5};
    int numeroDeElementos3 = sizeof(lista3) / sizeof(lista3[0]);
    int numero3 = 6;
    printf("%d\n", contains(lista3, numeroDeElementos3, numero3));  // Debería imprimir 0 (false)

    int lista4[] = {10, 20, 30, 40, 50};
    int numeroDeElementos4 = sizeof(lista4) / sizeof(lista4[0]);
    int numero4 = 60;
    printf("%d\n", contains(lista4, numeroDeElementos4, numero4));  // Debería imprimir 0 (false)

    return 0;
}