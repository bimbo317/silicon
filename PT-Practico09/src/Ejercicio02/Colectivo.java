package Ejercicio02;

public class Colectivo extends Vehiculo{
    private boolean aptoDiscapacitados;
    private boolean poseeLectorSube;
    private String tipoColectivo;

    public Colectivo() {
    }

    public Colectivo(boolean aptoDiscapacitados, boolean poseeLectorSube, String tipoColectivo) {
        this.aptoDiscapacitados = aptoDiscapacitados;
        this.poseeLectorSube = poseeLectorSube;
        this.tipoColectivo = tipoColectivo;
    }

    public Colectivo(boolean aptoDiscapacitados, boolean poseeLectorSube, String tipoColectivo, String patente, String numChasis, String motor, String color, String marca, String modelo, int cantAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantAsientos);
        this.aptoDiscapacitados = aptoDiscapacitados;
        this.poseeLectorSube = poseeLectorSube;
        this.tipoColectivo = tipoColectivo;
    }

    public boolean isAptoDiscapacitados() {
        return aptoDiscapacitados;
    }

    public void setAptoDiscapacitados(boolean aptoDiscapacitados) {
        this.aptoDiscapacitados = aptoDiscapacitados;
    }

    public boolean isPoseeLectorSube() {
        return poseeLectorSube;
    }

    public void setPoseeLectorSube(boolean poseeLectorSube) {
        this.poseeLectorSube = poseeLectorSube;
    }

    public String getTipoColectivo() {
        return tipoColectivo;
    }

    public void setTipoColectivo(String tipoColectivo) {
        this.tipoColectivo = tipoColectivo;
    }
    
    @Override
    public void queSoy(){
        System.out.println("Hola soy un colectivo y mi cantidad de asientos es de: "+getCantAsientos());
    }    
}
