#ifndef funciones_H
#define funciones_H

#include <stdbool.h>
void ordenar(int lista[], int numElementos);

bool esPrimo(int numero);

void intercambiarInt(int *valor1, int *valor2);

/**
 * @brief Verifica si un número está presente en una lista de enteros.
 * 
 * @param lista El arreglo de enteros.
 * @param numeroDeElementos El número de elementos en el arreglo.
 * @param numero El número a buscar en la lista.
 * @return true si el número está presente en la lista, false en caso contrario.
 */
bool contains(int lista[], int numeroDeElementos, int numero);

#endif