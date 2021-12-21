package Ejercicios02;

import java.util.Scanner;

public class ejercicioB {

    public static void main(String[] args) {
//        Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. Para esto necesita un programa que, 
//        para cada cálculo, permita el ingreso de los dos números por separado al igual que la operación que desea hacer entre ambos. 
//        Al mismo tiempo debe poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
        Scanner teclado = new Scanner(System.in);
        double nro1, nro2, resultado;
        resultado = 0;
        char operacion;
        for (int i = 0; i < 10; i++) {
            System.out.println("********Calculo " + (1 + i) + " ********");
            System.out.print("Ingrese 1er nro: ");
            nro1 = teclado.nextDouble();
            System.out.print("Ingrese 2do nro: ");
            nro2 = teclado.nextDouble();
            do {
                System.out.println("Ingrese operacion: + - * /");
                operacion = (char) teclado.next().charAt(0);
            } while (!(operacion == '+' || operacion == '-' || operacion == '/' || operacion == '*'));

            if (nro2 == 0 && operacion == '/') {
                System.out.println("No se puede dividir por 0");
            } else {
                switch (operacion) {
                    case '+':
                        resultado = nro1 + nro2;
                        break;
                    case '-':
                        resultado = nro1 - nro2;
                        break;
                    case '*':
                        resultado = nro1 * nro2;
                        break;
                    case '/':
                        resultado = nro1 / nro2;
                        break;
                }
                System.out.println("Resultado: " + resultado + "\n");
            }
        }
    }
}
