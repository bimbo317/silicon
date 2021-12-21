package Vectores01;

import java.util.Scanner;


public class ejercicioE {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in).useDelimiter("\n");
        String ciudades[]=new String[5];
        double minina[]=new double[5];
        double maxima[]=new double[5];
        int min, max;
        min=max=0;
        //Cargar datos
        System.out.println("********** C A R G A R - D A T O S **********");
        for (int i = 0; i < ciudades.length; i++) {            
            System.out.print("Ingrese Ciudad Nro "+(i+1)+": ");
            ciudades[i]=teclado.next().toUpperCase();
            System.out.print("Ingrese Temperatura Mínima "+ciudades[i]+": ");
            minina[i]=(double) teclado.nextDouble();
            System.out.print("Ingrese Temperatura Máxima "+ciudades[i]+": ");
            maxima[i]=(double) teclado.nextDouble();
            //comparar minimo
            if (minina[i]<minina[min]) {
                min=i;
            }
            //comparar maximo
            if (maxima[max]<maxima[i]) {
                max=i;
            } 
            if (i<4) {
                System.out.println("-------------------------------\n");
            }            
        }
        System.out.println("\n********** R E S U L T A D O S **********");
        System.out.println(ciudades[min]+" tuvo la temperatura minima mas baja "+minina[min]+"ºC");
        System.out.println(ciudades[max]+" tuvo la temperatura Máxima mas alta "+maxima[max]+"ºC");
    }
}