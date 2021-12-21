package Ejercicio02;

public class Camion extends Vehiculo{
    private boolean tieneAcoplado;
    private int cantidadEjes;

    public Camion() {
    }

    public Camion(boolean tieneAcoplado, int cantidadEjes) {
        this.tieneAcoplado = tieneAcoplado;
        this.cantidadEjes = cantidadEjes;
    }

    public Camion(boolean tieneAcoplado, int cantidadEjes, String patente, String numChasis, String motor, String color, String marca, String modelo, int cantAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantAsientos);
        this.tieneAcoplado = tieneAcoplado;
        this.cantidadEjes = cantidadEjes;
    }
    
    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }
    
    
    @Override
    public void queSoy(){
        System.out.println("Hola soy un camión y mi cantidad de Ejes es de: "+getCantidadEjes());
    }  
}
