#include <stdio.h>
#include <stdbool.h>

bool is_prime(int n);
void exchange(int *a, int *b);
void print_array(int a[], int n);
void sort(int a[], int n);
void add20differentNumers(int listToFill[]);
bool contains(int a[], int index, int x);


int main() {

    int numerList[20], primeList[20], nonPrimeList[20], primeListSize = 0, nonPrimeListSize = 0;
    add20differentNumers(numerList);

    for (int i = 0; i < 20; i++)
    {
        if (is_prime(numerList[i]))
        {
            primeList[primeListSize] = numerList[i];
            primeListSize++;
        }
        else
        {
            nonPrimeList[nonPrimeListSize] = numerList[i];
            nonPrimeListSize++;
        }
    }

    sort(primeList, primeListSize);
    sort(nonPrimeList, nonPrimeListSize);

    printf("Prime numbers: %d\n", primeListSize);
    print_array(primeList, primeListSize);
    printf("Non-prime numbers: %d\n", nonPrimeListSize);
    print_array(nonPrimeList, nonPrimeListSize);
}

bool is_prime(int n)
{
    if (n < 2) return false;
    for (int i = 2; i < n; i++)
        if (n % i == 0) return false;
    return true;
}

void exchange(int *a, int *b)
{
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

/**
 * @brief Imprime los elementos de un arreglo.
 * 
 * Esta función recibe un arreglo de enteros y su tamaño, y los imprime en la consola.
 * 
 * @param a El arreglo de enteros.
 * @param n El tamaño del arreglo.
 */
void print_array(int a[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("\n");
}

void sort(int a[], int n)
{
    for (int i = 0; i < n; i++)
        for (int j = i; j < n; j++)
            if (a[i] > a[j]) exchange(&a[i], &a[j]);
}

void add20differentNumers(int listToFill[])
{
    int i = 0, input;
    printf("20 different numbers: ");
    scanf("%d", &input);
    while (i < 20)
    {
        if (!contains(listToFill, i, input))
        {
            listToFill[i] = input;
            i++;
        }
        else
        {
            printf("Number already exists, try again: ");  
        }

        scanf("%d", &input);
    }
}

/**
 * Check if an array contains a specific element.
 *
 * @param a The array to search in.
 * @param index The number of elements in the array.
 * @param x The element to search for.
 * @return true if the element is found, false otherwise.
 */
bool contains(int a[], int index, int x)
{
    for (int i = 0; i < index; i++)
        if (a[i] == x) return true;
    return false;
}




