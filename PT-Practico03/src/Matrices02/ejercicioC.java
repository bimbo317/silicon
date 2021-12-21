package Matrices02;

import java.util.Scanner;

public class ejercicioC {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String matriz[][] = new String[3][3];
        cargarMatriz(matriz, teclado);
        mostrarMatriz(matriz);
        System.out.println("Ingrese raza a buscar");
        String razaBuscar=teclado.next();
        buscarRaza(matriz, razaBuscar);
    }

    static void buscarRaza(String matrizRecib[][], String raza) {
        boolean encontrado=false;
        for (int i = 0; i < matrizRecib.length; i++) {
            for (int j = 0; j < matrizRecib[i].length; j++) {
                if (matrizRecib[i][j].equals(raza)) {
                    System.out.println("Posicion raza: fila "+i+", columna "+j);
                    encontrado=true;
                }
            }
        }
        if (encontrado==false) {
            System.out.println("Raza no encontrada en la matriz");
        }
    }
    static void cargarMatriz(String matrizRecib[][], Scanner tecl) {
        for (int i = 0; i < matrizRecib.length; i++) {
            for (int j = 0; j < matrizRecib[i].length; j++) {
                System.out.print("Ingrese Raza: ");
                matrizRecib[i][j]=tecl.next();
            }
        }
    }

    static void mostrarMatriz(String matrizRecibida[][]) {
        System.out.println("\n---------------- M A T R I Z ----------------");
        for (int i = 0; i < matrizRecibida.length; i++) {
            for (int j = 0; j < matrizRecibida[i].length; j++) {
                System.out.print("[" + matrizRecibida[i][j] + "] ");
            }
            System.out.println("\n");
        }
    }
}
