package com.myapp.dominio;

public class Profesor {
    private String nombre;
    private int ano_nacimiento;
    private String departamento;
    
    public Profesor(String nombre, int ano_nacimiento, String departamento) {
        this.nombre = nombre;
        this.ano_nacimiento = ano_nacimiento;
        this.departamento = departamento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getAnoNacimiento() {
        return ano_nacimiento;
    }
    
    public void setAnoNacimiento(int ano_nacimiento) {
        this.ano_nacimiento = ano_nacimiento;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", ano_nacimiento=" + ano_nacimiento + ", departamento=" + departamento + "]";
    }
}
