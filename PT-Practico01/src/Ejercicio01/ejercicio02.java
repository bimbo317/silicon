package Ejercicio01;


public class ejercicio02 {

    public static void main(String[] args) {
        int nro1=35;
        int nro2=20;
        System.out.println("Nro1: "+nro1+"\nNro2: "+nro2);
        System.out.println("----- Intercambio nros -----");
        nro1=nro1+nro2;
        nro2=nro1-nro2;
        nro1=nro1-nro2;
        System.out.println("Nro1: "+nro1+"\nNro2: "+nro2);
    }
}