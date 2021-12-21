package Matrices02;


public class ejercicioA {

    public static void main(String[] args) {
        int matriz[][]=new int[4][5];
        cargarMatriz(matriz);
        mostrarMatriz(matriz);
    }
    
    static void cargarMatriz(int matrizRecib[][]){
        for (int i = 0; i < matrizRecib.length; i++) {
            for (int j = 0; j < matrizRecib[i].length; j++) {
                matrizRecib[i][j]=(int) 5;
            }
        }
    }
    static void mostrarMatriz(int matrizRecibida[][]){
        for (int i = 0; i < matrizRecibida.length; i++) {
            for (int j = 0; j < matrizRecibida[i].length; j++) {
                System.out.print("["+matrizRecibida[i][j]+"]");
            }
            System.out.println("\n");
        }
    }
}