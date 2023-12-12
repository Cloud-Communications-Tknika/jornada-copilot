#include "funciones.h"

void ordenar(int lista[], int numElementos)
{
    for(int indice1 = 0; indice1 < numElementos; indice1++)
    {
        for(int indice2 = indice1; indice2 < numElementos; indice2++)
        {
            if(lista[indice1]>lista[indice2])
            {
                intercambiarInt(&lista[indice1], &lista[indice2]);
            }
        }
    }
}

bool esPrimo(int numero)
{

    int indice=2;
    bool resultado = true;

    if(numero==1)
    {
        return false;
    }
    while((resultado)&&(indice<=numero/2))
    {
        if(numero%indice==0)
        { 
            resultado = false;
        }

        indice++;
    }

    return resultado;

}

void intercambiarInt(int *valor1, int *valor2)
{
    int aux = *valor1;
    *valor1 = *valor2;
    *valor2 = aux;
}

bool contains(int lista[], int numeroDeElementos, int numero)
{
    bool contiene = false;
    int indice = 0;

    while((!contiene)&&(indice<numeroDeElementos))
    {
        if (lista[indice]==numero)
        {
            contiene = true;
        }

        indice++;
    }

    return contiene;
}