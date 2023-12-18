def main():
    
    print("Hola Mundo")

    # Declarar una variable de tipo int
    mi_numero = 10

    # Declarar una variable de tipo float
    mi_flotante = 10.5

    # Declarar una variable de tipo string
    mi_string = "Hola Mundo"

    # Declarar una variable de tipo boolean
    mi_booleano = True

    # Declarar una variable de tipo list
    mi_lista = [1, 2, 3, 4, 5]

    # Declarar una variable de tipo dict
    mi_diccionario = {"clave": "valor"}

    nombre = "Mundo"
    saludo = "Hola " + nombre
    print(saludo)  # Imprime: Hola Mundo

    nombre = input("Por favor, introduce tu nombre: ")
    apellido = input("Por favor, introduce tu apellido: ")
    print("Hola " + nombre + " " + apellido)

    numero = 10
    if not numero == 10:
        print("El número no es 10")
    else:
        print("El número es 10")

    for i in range(5):
        print(i)

    i = 0
    while i < 5:
        print(i)
        i += 1
    
    cadena = "Hola Mundo"
    longitud = len(cadena)
    lon = cadena.__len__()
    print(longitud)  # Imprime: 10

if __name__ == "__main__":
    main()