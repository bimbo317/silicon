package Ejercicio02;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
//        Un instituto de inglés desea informar a sus alumnos los días y horarios de sus clases. Para ello, decidió la creación de una aplicación que, 
//        a partir del ingreso de la edad del alumno, le informe en qué días y horarios los alumnos tienen clases. Como información, 
//        la academia proporciona los siguientes datos respecto a los grupos y los diferentes horarios.
//        a) Kinder(de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
//        b) 1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
//        c) 2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19
//        d) 3rd year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30
        Scanner teclado = new Scanner(System.in);
        String cursado = "";
        System.out.println("Ingrese edad de alumno y se mostrará el horario de cursado");
        int edad = teclado.nextInt();
        if (4 <= edad && edad < 14) {
            if (4 <= edad && edad <= 6) {
                cursado = "Kinder: Lunes y Miércoles de 16 a 17";
            } else if (7 <= edad && edad <= 8) {
                cursado = "1st Year: Martes y Jueves de 16:30 a 17:30";
            } else if (9 <= edad && edad <= 10) {
                cursado = "2nd Year: Martes y Jueves de 17:30 a 19:00";
            } else if (11 <= edad && edad <= 13) {
                cursado = "3rd Year: Lunes y Miércoles de 17:00 a 18:30";
            }
            System.out.println("Horario de cursado para la edad "+edad+"\n"+cursado);
        } else {
            System.out.println("No existen horarios para la edad ingresada");
        }

    }
}
