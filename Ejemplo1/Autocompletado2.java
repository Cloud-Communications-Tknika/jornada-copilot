package Ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Autocompletado2 {
    public static void main(String[] args) {

        String nombre = "Juan";
        String id = "1234";
        List<String> conferencias = new ArrayList<String>();
        conferencias.add("Conferencia 1");
        conferencias.add("Conferencia 2");
        conferencias.add("Conferencia 3");

        Espectador espectador = new Espectador(nombre, id, conferencias);

        System.out.println(espectador.toString());

        

    }
}
