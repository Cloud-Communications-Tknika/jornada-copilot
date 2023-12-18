package Ejemplo1;

import java.util.Objects;

public class Autobus {
        private int numeroPasajeros;
        private String identificacion;
        private String marca;

        public Autobus() {
            // Constructor vacío
        }

        public Autobus(int numeroPasajeros, String identificacion, String marca) {
            this.numeroPasajeros = numeroPasajeros;
            this.identificacion = identificacion;
            this.marca = marca;
        }

        public int getNumeroPasajeros() {
            return numeroPasajeros;
        }

        public void setNumeroPasajeros(int numeroPasajeros) {
            this.numeroPasajeros = numeroPasajeros;
        }

        public String getIdentificacion() {
            return identificacion;
        }

        public void setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Autobus autobus = (Autobus) o;
            return numeroPasajeros == autobus.numeroPasajeros &&
                    Objects.equals(identificacion, autobus.identificacion) &&
                    Objects.equals(marca, autobus.marca);
        }

        
    @Override
    public String toString() {
        return "Autobus{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", identificacion='" + identificacion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

