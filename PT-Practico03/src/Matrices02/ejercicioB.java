package Matrices02;

public class ejercicioB {

    public static void main(String[] args) {
        int matriz[][]=new int[6][6];
        cargarMatriz(matriz);
        mostrarMatriz(matriz);
    }
    static void cargarMatriz(int matrizRecib[][]){
        for (int i = 0; i < matrizRecib.length; i++) {
            for (int j = 0; j < matrizRecib[i].length; j++) {
                if (i==j) {
                    matrizRecib[i][j]=1;
                } else {
                    matrizRecib[i][j]=0;
                }                
            }
        }
    }
    static void mostrarMatriz(int matrizRecibida[][]){
        for (int i = 0; i < matrizRecibida.length; i++) {
            for (int j = 0; j < matrizRecibida[i].length; j++) {
                System.out.print("["+matrizRecibida[i][j]+"] ");
            }
            System.out.println("\n");
        }
    }
}