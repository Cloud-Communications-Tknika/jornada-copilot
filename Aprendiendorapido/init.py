def main():

    # Declarar una variable de tipo int (entero)
    mi_entero = 10

    # Declarar una variable de tipo float (número de punto flotante)
    mi_flotante = 7.5

    # Declarar una variable de tipo str (cadena de texto)
    mi_cadena = "Hola, mundo"

    # Declarar una variable de tipo bool (booleano)
    mi_booleano = True

    # Declarar una variable de tipo list (lista)
    mi_lista = [1, 2, 3, 4, 5]

    nombre = input("Por favor, introduce tu nombre: ")
    apellido = input("Por favor, introduce tu apellido: ")
    completo = nombre + " " + apellido

    print(completo)

    numero = 5

    if numero > 5:
        print("El número es mayor que 5")
    elif numero < 5:
        print("El número es menor que 5")
    else:
        print("El número es 5")

    for i in range(5):
        print(i)

if __name__ == "__main__":
    main()