package Vectores01;

import java.util.Scanner;


public class ejercicioB {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int vectorNros[]=new int[10];
        //int vectorNros[]={1,3,9,10,5,4,0,2};
        int mayor, menor;
        mayor=menor=0;
        //cargar nros en el vector
        System.out.println("********* Cargar Nros *********");
        for (int i = 0; i < vectorNros.length; i++) {
            System.out.println("Ingrese nro");
            vectorNros[i]=(int)teclado.nextInt();
            if(i==0){
                mayor=menor=vectorNros[0];
            } else {
                if(mayor<vectorNros[i]){
                    mayor=vectorNros[i];
                }
                if(vectorNros[i]<menor){
                    menor=vectorNros[i];
                }
            }            
        }
        //mostrar datos
        System.out.println("\n********* Mostrar Nros *********");
        for (int i = 0; i < vectorNros.length; i++) {
            if (i==vectorNros.length-1) {
                System.out.print(vectorNros[i]+"\n");
            } else {
                System.out.print(vectorNros[i]+", ");
            }            
        }
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
    }
}