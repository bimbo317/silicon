package Vectores01;

import java.util.Scanner;

public class ejercicioD {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vectorSueldos[] = new int[12];
        int suma = 0;
        double promedio=0;
        //cargar nros en el vector
        System.out.println("********* Cargar de Sueldos *********");
        for (int i = 0; i < vectorSueldos.length; i++) {
            System.out.println("Ingrese sueldo");
            vectorSueldos[i] = (int) teclado.nextInt();
            suma=suma+vectorSueldos[i];
        }
        //mostrar resultados
        promedio=suma/12;
        System.out.println("Suma: "+suma);
        System.out.println("El promedio de los sueldos es: "+promedio);
    }
}
