package Matrices02;

import java.util.Scanner;

public class ejercicioE {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //int matriz[][] = new int[6][3];
        int matriz[][] = {{120, 15, 30}, {65, 1, 2}, {4, 52, 7}, {46, 32, 16}, {64, 23, 11}, {61, 12, 91}};
        String vectorDestinos[] = {"Rio", "Cancún", "Madrid", "Roma", "Milán", "Iguazú"};
        //cargarMatriz(matriz, teclado);
        mostrarMatriz(matriz);
        int vuelo, cantPasajeros, pasajesDisponibles;
        int destinoElegido = vuelo = 0;
        do {
            destinoElegido = elegirDestino(vectorDestinos, teclado);
            if (destinoElegido != 6) {
                vuelo = elegirVuelo(teclado) - 1;
                pasajesDisponibles= matriz[destinoElegido][vuelo];
                cantPasajeros=cantidadDePasajeros(teclado, pasajesDisponibles);
                matriz[destinoElegido][vuelo]=pasajesDisponibles-cantPasajeros;
                System.out.println("**********************************\nSu reserva fue realizada con éxito\n**********************************");                
                mostrarMatriz(matriz);
            }
        } while (destinoElegido != 6);
        System.out.println("\nGRACIAS por usar nuestro Sistema");
    }

    static int elegirDestino(String destinos[], Scanner leer) {
        String destElegido = "";
        System.out.println("****** Destinos ******\n- Rio\n- Cancún\n- Madrid\n- Roma\n- Milán\n- Iguazu");
        do {
            System.out.print("Ingrese destino: ");
            destElegido = leer.next().toUpperCase();
        } while (!(destElegido.equalsIgnoreCase("RIO") || destElegido.equalsIgnoreCase("Cancun") || destElegido.equalsIgnoreCase("Madrid") || destElegido.equalsIgnoreCase("Roma") || destElegido.equalsIgnoreCase("Milan") || destElegido.equalsIgnoreCase("Iguazu") || destElegido.equalsIgnoreCase("Finish")));

        switch (destElegido) {
            case "RIO":
                return 0;
            case "CANCUN":
                return 1;
            case "MADRID":
                return 2;
            case "ROMA":
                return 3;
            case "MILAN":
                return 4;
            case "IGUAZU":
                return 5;            
            default:
                return 6;
        }
    }

    static int elegirVuelo(Scanner sc) {
        System.out.print("******* Elegir Vuelo *******\n1) Mañana\n2) Tarde\n3) Noche\n");
        int op;
        do {
            System.out.print("Ingrese Opción: ");
            op = sc.nextInt();
        } while (op < 1 || 3 < op);
        return op;
    }

    static int cantidadDePasajeros(Scanner tecla, int disponible) {
        int cantidad = 0;
        System.out.println("******* Elegir Cantidad de Pasajeros *******");
        System.out.println("(Ingrese 0 para CANCELAR)");
        do {
            System.out.print("Cantidad de pasajeros: ");
            cantidad = tecla.nextInt();
            if (disponible < cantidad) {
                System.out.println("Disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
            }
        } while (disponible < cantidad);
        return cantidad;
    }

    static void cargarMatriz(int matrizRecib[][], Scanner tecl) {
        System.out.println("---------------- CARGAR DATOS ----------------");
        double promedio = 0;
        //double nota;
        for (int f = 0; f < matrizRecib.length; f++) {
            System.out.println("******** Destino " + f + " ********");
            for (int c = 0; c < matrizRecib[f].length; c++) {
                switch (c) {
                    case 0:
                        System.out.print("Cantidad Asientos Mañana: ");
                        break;
                    case 1:
                        System.out.print("Cantidad Asientos Tarde: ");
                        break;
                    case 2:
                        System.out.print("Cantidad Asientos Noche: ");
                        break;
                }
                matrizRecib[f][c] = (int) tecl.nextInt();
            }
        }
    }

    static void mostrarMatriz(int matrizRecibida[][]) {
        System.out.println("\n---------------- M A T R I Z ----------------");
        for (int f = 0; f < matrizRecibida.length; f++) {
            switch (f) {
                case 0:
                    System.out.print("Rio de Janeiro: ");
                    break;
                case 1:
                    System.out.print("    Cancún    : ");
                    break;
                case 2:
                    System.out.print("    Madrid    : ");
                    break;
                case 3:
                    System.out.print("     Roma     : ");
                    break;
                case 4:
                    System.out.print("     Milán    : ");
                    break;
                case 5:
                    System.out.print("    Iguazú    : ");
                    break;
            }
            for (int c = 0; c < matrizRecibida[f].length; c++) {
                if (100 < matrizRecibida[f][c]) {
                    System.out.print("[" + matrizRecibida[f][c] + "] ");
                } else if (10 < matrizRecibida[f][c]) {
                    System.out.print("[ " + matrizRecibida[f][c] + "] ");
                } else {
                    System.out.print("[  " + matrizRecibida[f][c] + "] ");
                }
            }
            System.out.println("");
        }
    }
}
