package Vectores01;

import java.util.Scanner;

public class ejercicioC {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vectorNros[] = new int[15];
        int cantidadTres = 0;
        //cargar nros en el vector
        System.out.println("********* Cargar Nros *********");
        for (int i = 0; i < vectorNros.length; i++) {
            System.out.println("Ingrese nro");
            vectorNros[i] = (int) teclado.nextInt();
            if (vectorNros[i] == 3) {
                cantidadTres++;
            }
        }
        //mostrar datos
        System.out.println("\n********* Mostrar Nros *********");
        for (int i = 0; i < vectorNros.length; i++) {
            if (i == vectorNros.length - 1) {
                System.out.print(vectorNros[i] + "\n");
            } else {
                System.out.print(vectorNros[i] + ", ");
            }
        }
        System.out.println("Cantidad de veces que fue ingresado el nro 3: " + cantidadTres);
    }
}
