package Ejercicio01;

public class Flor extends Planta{
    private String colorPetalos;
    private int cantPromedioPetalos;
    private String colorPestilo;
    private String variedadFlor;
    private String estacionQueFlorece;

    public Flor() {
    }
    

    public Flor(String colorPetalos, int cantPromedioPetalos, String colorPestilo, String variedadFlor, String estacionQueFlorece) {
        this.colorPetalos = colorPetalos;
        this.cantPromedioPetalos = cantPromedioPetalos;
        this.colorPestilo = colorPestilo;
        this.variedadFlor = variedadFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public Flor(String colorPetalos, int cantPromedioPetalos, String colorPestilo, String variedadFlor, String estacionQueFlorece, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPromedioPetalos = cantPromedioPetalos;
        this.colorPestilo = colorPestilo;
        this.variedadFlor = variedadFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPromedioPetalos() {
        return cantPromedioPetalos;
    }

    public void setCantPromedioPetalos(int cantPromedioPetalos) {
        this.cantPromedioPetalos = cantPromedioPetalos;
    }

    public String getColorPestilo() {
        return colorPestilo;
    }

    public void setColorPestilo(String colorPestilo) {
        this.colorPestilo = colorPestilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }
    
    @Override
    public void queSoy(){
        System.out.println("Hola, soy una flor");
    }
    
    
}
