package Ejercicios01;

import java.util.Scanner;

public class ejercicioE {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String palabra="";
        do {            
            System.out.println("Ingrese una palabra (para salir ingrese la palabra salir)");
            palabra=teclado.next();
        } while (!palabra.equals("salir"));
    }
}