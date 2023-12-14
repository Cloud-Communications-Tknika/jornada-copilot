package com.myapp.model;

public class Pasajero {
    private int identificacion;
    private String nombreUsuario;
    private double saldo;

    public Pasajero(int identificacion, String nombreUsuario, double saldo) {
        this.identificacion = identificacion;
        this.nombreUsuario = nombreUsuario;
        this.saldo = saldo;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
}
