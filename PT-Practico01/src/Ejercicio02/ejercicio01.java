package Ejercicio02;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
//        Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorías: 
//        1- repositor, 2-cajero y 3-supervisor
        Scanner teclado = new Scanner(System.in);
        double sueldo = 0;
        System.out.println("Ingrese categoria");
        int categoria = teclado.nextInt();

        if (categoria == 1 || categoria == 2 || categoria == 3) {
            if (categoria == 1) {
                sueldo = 15890 * 1.1;
            } else if (categoria == 2) {
                sueldo = 25630.89;
            } else if (categoria == 3) {
                sueldo = 35560.20 * 0.89;
            }
            System.out.println("El sueldo para la categoria " + categoria + " es: $" + sueldo);
        } else {
            System.out.println("Error!!! Categoria incorrecta");
        }

    }
}
