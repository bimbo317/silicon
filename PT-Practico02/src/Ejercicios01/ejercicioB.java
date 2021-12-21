package Ejercicios01;

import java.util.Scanner;


public class ejercicioB {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador=1;
        System.out.println("Ingrese hasta que nro se desea mostrar por pantalla");
        int limite=teclado.nextInt();
        while(contador<=limite){
            System.out.println(contador);
            contador++;
        }
    }
}