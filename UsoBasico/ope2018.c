#include <stdio.h>
#include "funciones.h"

void recoger20elementosDistintos(int lista[]);
void mostrarLista(int lista[], int elementos);

int main()
{

    int lista[20], primos[20],compuestos[20];
    int numeroDePrimos = 0, numeroDeCompusetos = 0;

    recoger20elementosDistintos(lista);

    for(int i = 0; i < 20; i++)
    {
        if(esPrimo(lista[i]))
        {
            primos[numeroDePrimos] = lista[i];
            numeroDePrimos++;
        }
        else{
            compuestos[numeroDeCompusetos] = lista[i];
            numeroDeCompusetos++;
        }
    }

    ordenar(primos, numeroDePrimos);
    ordenar(compuestos, numeroDeCompusetos);

    printf(" \n primos:  %i \n elementos: \n", numeroDePrimos);
    mostrarLista(primos, numeroDePrimos);
    printf(" \n Compuestos:  %i \n elementos: \n", numeroDeCompusetos);
    mostrarLista(compuestos, numeroDeCompusetos);

    return 0;
}

void recoger20elementosDistintos(int lista[])
{
    int dato;
    int elementosRecogidos = 0;

    scanf("%i", &dato);
    

    while(elementosRecogidos<20)
    {
        if((dato>0)&&(!contains(lista,elementosRecogidos,dato)))
        {
            lista[elementosRecogidos] = dato;
            elementosRecogidos++;
            printf("Elemento añadido \n");
        }
        else{
            printf("Elemento no añadido \n");
        }
        if(elementosRecogidos<20)
        {
            scanf("%i", &dato);
        }

    }


}

void mostrarLista(int lista[], int elementos)
{
    for (int i=0; i < elementos; i++)
    {
        printf("\n %i", lista[i]);
    }
}