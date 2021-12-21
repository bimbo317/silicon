package Ejercicios02;

import java.util.Scanner;

public class ejercicioC {

    public static void main(String[] args) {
//        En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el marco de la Fiesta Nacional del Inmigrante. 
//        El evento cuenta con un día de inscripciones el día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos 
//        que puede llegar a haber. Desde la Federación de Colectividades (Organismo que organiza), manifestaron que se solicitan 
//        los siguientes datos para la inscripción de cada participante: dni, nombre, apellido y edad.
        Scanner teclado = new Scanner(System.in);
        int dni, edad, contador;
        dni = contador = 0;
        String nombre, apellido;
        nombre = "";
        System.out.println("********** Bienvenido a la Maratón del Inmigrante **********");
        System.out.println("\nFin del dia de inscripciones");
        do {
            contador++;
            System.out.println("------ Ingrese datos del Participante Nro " + contador + " ------");
            System.out.print("DNI: ");
            dni = (int) teclado.nextInt();
            System.out.print("Nombre: ");
            nombre = teclado.next();
            if (dni != 0 && !nombre.equals("fin")) {
                System.out.print("Apellido: ");
                apellido = teclado.next();
                System.out.print("Edad: ");
                edad = teclado.nextInt();
                if (6 <= edad && edad <= 10) {
                    System.out.println("Categoria: Menores A");
                } else if (11 <= edad && edad <= 17) {
                    System.out.println("Categoria: Menores B");
                } else if (18 <= edad && edad <= 30) {
                    System.out.println("Categoria: Juveniles");
                } else if (31 <= edad && edad <= 50) {
                    System.out.println("Categoria: Adultos");
                } else if (50 < edad) {
                    System.out.println("Categoria: Adultos Mayores");
                }
            }
        } while (dni != 0 && !nombre.equals("fin"));
    }
}
