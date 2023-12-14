package Ejemplo1;

import java.util.List;
import java.util.ArrayList;


public class Espectador {
    private String nombre;
    private String identificador;
    private List<String> conferenciasAsistidas;

    // Constructor vacío
    public Espectador() {
        conferenciasAsistidas = new ArrayList<String>();
    }
    // Constructor
    public Espectador(String nombre, String identificador, List<String> conferenciasAsistidas) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.conferenciasAsistidas = conferenciasAsistidas;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public List<String> getConferenciasAsistidas() {
        return conferenciasAsistidas;
    }

    public void setConferenciasAsistidas(List<String> conferenciasAsistidas) {
        this.conferenciasAsistidas = conferenciasAsistidas;
    }
   
    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + nombre + '\'' +
                ", identificador='" + identificador + '\'' +
                ", conferenciasAsistidas=" + conferenciasAsistidas +
                '}';
    }
}
