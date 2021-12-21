package Ejercicio02;

public class Vehiculo {
    private String patente;
    private String numChasis;
    private String motor;
    private String color;
    private String marca;
    private String modelo;
    private int cantAsientos;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String numChasis, String motor, String color, String marca, String modelo, int cantAsientos) {
        this.patente = patente;
        this.numChasis = numChasis;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cantAsientos = cantAsientos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
    
    public void queSoy(){        
    }
}
