package Logica;


public class ejercicio02 {

    public static void main(String[] args) {
        Mueble placard=new Mueble("placard", 1.2, 1.5, "MDF", 4);
        Mueble mesa = new Mueble("Mesa", 1.2, 0.9, "roble", 10);
        Mueble silla = new Mueble("Silla", 0.4, 0.6, "pino", 20);
        
        System.out.println("Nombre: "+placard.getNombre()+", Material: "+placard.getMaterial());
        System.out.println("Nombre: "+mesa.getNombre()+", Material: "+mesa.getMaterial());
        System.out.println("Nombre: "+silla.getNombre()+", Material: "+silla.getMaterial());
        
        placard.setMaterial("Madera");
        mesa.setMaterial("Madera");
        silla.setMaterial("Madera");
        System.out.println("------ Con Materiales Cambiados -------");
        System.out.println("Nombre: "+placard.getNombre()+", Material: "+placard.getMaterial());
        System.out.println("Nombre: "+mesa.getNombre()+", Material: "+mesa.getMaterial());
        System.out.println("Nombre: "+silla.getNombre()+", Material: "+silla.getMaterial());
    }
}