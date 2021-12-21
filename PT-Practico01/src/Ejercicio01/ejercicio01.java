package Ejercicio01;


public class ejercicio01 {

    public static void main(String[] args) {
        //ejercicio A
        int entero;
        double doble;
        String cadena="";
        //ejercicio B, se puede hacer esta operacion, el unico error que es que la variable String no tiene valor
        entero=1;
        doble=entero;
        //Ejercicio C, error nos pide castear (convertirlo a entero) el valor de la variable double
        doble=2.5;
        entero=(int) doble;
        //Ejercicio D, de la unica forma que se puede asignar este valor es poniendolo en comillas, de otra forma da error
        //cadena=35;
        //Ejercicio E, para almacenar el 48 se debe hacer entre comillas
        cadena="48";
        
        System.out.println("Entero: "+entero+"\nDouble: "+doble+"\nString: "+cadena);
    }
}