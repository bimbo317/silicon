package Ejercicio02;

public class Moto extends Vehiculo{
    private int cilindrada;
    private String material_manubrio;

    public Moto() {
    }

    public Moto(int cilindrada, String material_manubrio) {
        this.cilindrada = cilindrada;
        this.material_manubrio = material_manubrio;
    }

    public Moto(int cilindrada, String material_manubrio, String patente, String numChasis, String motor, String color, String marca, String modelo, int cantAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantAsientos);
        this.cilindrada = cilindrada;
        this.material_manubrio = material_manubrio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMaterial_manubrio() {
        return material_manubrio;
    }

    public void setMaterial_manubrio(String material_manubrio) {
        this.material_manubrio = material_manubrio;
    }
    
    @Override
    public void queSoy(){
        System.out.println("Hola soy una moto y mi cilindrada es de: "+getCilindrada());
    }
}
