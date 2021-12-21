package Ejercicio01;


public class Ejercicio01 {

    public static void main(String[] args) {
        Arbol arbolito=new Arbol("Vitaceae", "fino", 10, "verde", "grandes", "vid", 20, true, "seco");
        Flor rosita=new Flor("rosado", 2, "verde", "Magnoliopsida", "todo el año", "rosa", 5, true, "cálidos");
        Arbusto bush=new Arbusto(30, true, "Myrtus communis", "verdes", true, "Mirto", 5, true, "suaves");
        arbolito.queSoy();
        rosita.queSoy();
        bush.queSoy();
    }
}