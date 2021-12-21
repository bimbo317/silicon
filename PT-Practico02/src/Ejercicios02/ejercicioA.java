package Ejercicios02;

import java.util.Scanner;

public class ejercicioA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dni;
        byte servicio=1;
        double montoApagar = 0;
        String tipoServicio="";
        for (int i = 0; i < 5; i++) {
            System.out.println("****** Cliente "+(i+1)+" ******");
            System.out.println("Ingrese DNI");
            dni = teclado.nextInt();
            do {
                System.out.println("Ingrese tipo de servicio");
                servicio = teclado.nextByte();
            } while (servicio<1 || 3<servicio);
            switch (servicio) {
                case 1:
                    montoApagar = 890 * 0.9;
                    tipoServicio="Internet 30 megas";
                    break;
                case 2:
                    montoApagar = 1050 * 0.95;
                    tipoServicio="Internet 50 megas";
                    break;
                case 3:
                    montoApagar = 1600;
                    tipoServicio="Internet 100 megas";
                    break;
            }
            System.out.println("DNI: "+dni+", con el servicio "+tipoServicio+", deberá pagar $"+montoApagar+"\n");
        }
    }
}
