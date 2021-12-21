package Ejercicio01;

public class Ejercicio01_B {

    public static void main(String[] args) {
        Fruta[] vectorFrutas=new Fruta[5];
        Fruta manzana=new Fruta("Manzana", "Roja", 5.2, "Fina", true);
        Fruta banana=new Fruta("Banana", "Amarilla", 4.2, "Gruesa", true);
        Fruta naranja=new Fruta("Naranja", "Naranja", 3.2, "Gruesa", true);
        Fruta carambola=new Fruta("Carambola", "Amarillo", 5.2, "Fina", false);
        Fruta sandia=new Fruta("Sandia", "Verde", 5.2, "Gruesa", true);
        
        vectorFrutas[0]=manzana;
        vectorFrutas[1]=banana;
        vectorFrutas[2]=naranja;
        vectorFrutas[3]=carambola;
        vectorFrutas[4]=sandia;
        
        // Mostrar nombre y calorias de cada fruta del vector
        for (int i = 0; i < vectorFrutas.length; i++) {
            System.out.println("Fruta: "+vectorFrutas[i].getNombre()+", Calorias: "+vectorFrutas[i].getCalorias());            
        }
        System.out.println("\nCambiando datos...");
        vectorFrutas[1].setNombre("Platano");
        vectorFrutas[1].setColor("Verde");
        vectorFrutas[1].setCalorias(8.1);
        vectorFrutas[1].setTipoCascara("Fina");
        vectorFrutas[1].setEsComestible(false);        
        vectorFrutas[0].setNombre("Aguacate");
        vectorFrutas[0].setColor("Negro");
        vectorFrutas[0].setCalorias(2.1);
        vectorFrutas[0].setTipoCascara("Gruesa");
        vectorFrutas[0].setEsComestible(false);
        for (int i = 0; i < vectorFrutas.length; i++) {
            System.out.println(vectorFrutas[i].toString());            
        }
        System.out.println("\n-----nuevo-----");
        for (int i = 0; i < vectorFrutas.length; i++) {
            if (vectorFrutas[i].getColor().equalsIgnoreCase("Verde")) {
                System.out.println(vectorFrutas[i].toString());                   
            }
            
        }
    }    
}