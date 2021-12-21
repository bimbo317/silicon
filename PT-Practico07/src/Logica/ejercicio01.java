package Logica;

public class ejercicio01 {

    public static void main(String[] args) {
        Auto primero=new Auto("rojo", "WV", "Gol", "VAG-017", (byte)3);
        Auto segundo=new Auto("negro", "Ford", "Focus", "VAG-018", (byte)5);
        Auto tercero=new Auto("gris", "Chevrolet", "Cruze", "VAG-019", (byte)5);
        Auto cuarto=new Auto();
        System.out.println("Marca: "+primero.getMarca()+", Modelo: "+primero.getModelo()+", Patente: "+primero.getPatente());
        System.out.println("Marca: "+segundo.getMarca()+", Modelo: "+segundo.getModelo()+", Patente: "+segundo.getPatente());
        System.out.println("Marca: "+tercero.getMarca()+", Modelo: "+tercero.getModelo()+", Patente: "+tercero.getPatente());
        System.out.println("-----Sin parametros----");
        System.out.println("Marca: "+cuarto.getMarca());
    }
}