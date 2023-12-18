package com.myapp.dominio;

public abstract class Alumnos {
    private String nombre;
    private String apellido;
    private int ano_nacimiento;

    public Alumnos(String nombre, String apellido, int ano_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ano_nacimiento = ano_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAno_nacimiento() {
        return ano_nacimiento;
    }

    public void setAno_nacimiento(int ano_nacimiento) {
        this.ano_nacimiento = ano_nacimiento;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ano_nacimiento=" + ano_nacimiento +
                '}';
    }
    
}
