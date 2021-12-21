package Ejercicio02;

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
//        Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se trata de una mercería mayorista, 
//        solicita la cantidad de paquetes en cada venta y dependiendo de esta realiza los siguientes controles:
        int cantidad=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos");
        cantidad=teclado.nextInt();
        if (cantidad<5) {
            System.out.println("No se permiten compras inferiores a 5 productos");
        } else if(5<=cantidad&& cantidad<=15){
            System.out.println("Costo de envío: $200");
        } else if(15<cantidad){
            System.out.println("Envío Gratis!!!");
        }
    }
}
