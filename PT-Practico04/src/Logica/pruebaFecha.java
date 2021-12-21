package Logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class pruebaFecha {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LocalDate prueba;
        long prueba2;

//        System.out.println("Ingrese fecha");
//        prueba=LocalDate.parse(teclado.next(), DateTimeFormatter.ofPattern("d/M/yyyy"));
//        System.out.println("prueba: "+prueba.format(DateTimeFormatter.ofPattern("d/M/yyyy")));
        System.out.println("Ingrese nro");
        prueba2 = Long.parseLong(teclado.next());
    }
}
