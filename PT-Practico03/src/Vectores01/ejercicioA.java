/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores01;

import java.util.Scanner;

/**
 *
 * @author bimbo
 */
public class ejercicioA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);        
        System.out.println("Cuantas personas se cargaran?");        
        int cantidadPersonas=(int)teclado.nextInt();
        String personas[]=new String[cantidadPersonas];
        //cargar datos
        //String personas2[]={"Alejandra", "Leonardo", "Rosa", "Guillermo", "Gabriel", "Daniel", "Luisa", "Ludmila"};
        System.out.println("********* Cargar Personas *********");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese nombre");
            String perso=teclado.next();
            personas[i]=perso;
        }
        
        //mostrar datos
        System.out.println("\n********* Mostrar Personas *********");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
}
