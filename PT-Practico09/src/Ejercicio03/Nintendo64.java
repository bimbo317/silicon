package Ejercicio03;

public class Nintendo64 extends Consola{
    private String norma;
    private boolean leeCartuchosPirata;

    @Override
    public void cargarJuego() {
        System.out.println("“Cargando juego. Por favor espere");
    }
}
