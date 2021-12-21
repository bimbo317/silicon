package Ejercicio02;

public class Auto extends Vehiculo{
    private String materialasientos;
    private int cantidad_caballos;

    public Auto() {
    }

    public Auto(String materialasientos, int cantidad_caballos) {
        this.materialasientos = materialasientos;
        this.cantidad_caballos = cantidad_caballos;
    }

    public Auto(String materialasientos, int cantidad_caballos, String patente, String numChasis, String motor, String color, String marca, String modelo, int cantAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantAsientos);
        this.materialasientos = materialasientos;
        this.cantidad_caballos = cantidad_caballos;
    }

    public String getMaterialasientos() {
        return materialasientos;
    }

    public void setMaterialasientos(String materialasientos) {
        this.materialasientos = materialasientos;
    }

    public int getCantidad_caballos() {
        return cantidad_caballos;
    }

    public void setCantidad_caballos(int cantidad_caballos) {
        this.cantidad_caballos = cantidad_caballos;
    }
    
    @Override
    public void queSoy(){
        System.out.println("Hola soy un auto y mi marca es: "+getMarca());
    }
}
