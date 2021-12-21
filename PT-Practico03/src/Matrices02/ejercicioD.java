package Matrices02;

import java.util.Scanner;

public class ejercicioD {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double matriz[][] = new double[4][4];
        cargarMatriz(matriz, teclado);
        mostrarNotas(matriz);
    }

    static void cargarMatriz(double matrizRecib[][], Scanner tecl) {
        System.out.println("---------------- CARGAR DATOS ----------------\"");
        double promedio = 0;
        //double nota;
        for (int i = 0; i < matrizRecib.length; i++) {
            System.out.println("******** Alumno " + (i + 1) + " ********");
            for (int j = 0; j < matrizRecib[i].length - 1; j++) {
                System.out.print("Ingrese Nota " + (j + 1)+": ");
                matrizRecib[i][j] = (double) tecl.nextDouble();
                promedio = promedio + matrizRecib[i][j];
            }
            matrizRecib[i][3] = (double) (Math.round(promedio / 3) * 100) / 100;
            promedio = 0;
        }
    }

    static void mostrarMatriz(double matrizRecibida[][]) {
        System.out.println("\n---------------- M A T R I Z ----------------");
        for (int i = 0; i < matrizRecibida.length; i++) {
            for (int j = 0; j < matrizRecibida[i].length; j++) {
                System.out.print("[" + matrizRecibida[i][j] + "] ");
            }
            System.out.println("\n");
        }
    }

    static void mostrarNotas(double matrizRecibida[][]) {
        System.out.println("\n---------------- Notas Cargadas ----------------");
        for (int f = 0; f < matrizRecibida.length; f++) {
            System.out.println("******** Alumno " + (f + 1) + " ********");
            for (int c = 0; c < matrizRecibida[f].length-1; c++) {
                System.out.println("Nota Nro "+(c+1)+": "+matrizRecibida[f][c]);
            }
            System.out.println("Promedio: "+matrizRecibida[f][3]+"\n");
            
        }
    }
}
