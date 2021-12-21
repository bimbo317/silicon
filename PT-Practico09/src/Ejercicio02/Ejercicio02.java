package Ejercicio02;


public class Ejercicio02 {

    public static void main(String[] args) {
        Vehiculo[] miVector=new Vehiculo[9];
        miVector[0]=new Auto("cuero", 250, "VAG-123", "ASDHH32165843321", "1.4", "Gris", "Toyota Corolla", "1997", 3);
        miVector[1]=new Auto("sintetico", 350, "VAG-312", "ASDHH32165843321", "1.8", "Negro", "Chevrolet Cruze", "2015", 3);
        miVector[2]=new Auto("cuero vegano", 500, "VAG-654", "ASDHH32165843321", "2.0", "Blanco", "VW Vento", "2021", 3);
        miVector[3]=new Moto(100, "ecocuero", "HJ-321654", "DASSA798321", "200cc", "Rojo", "Guerrero", "2015", 1);
        miVector[4]=new Moto(250, "ecocuero", "HJ-321654", "DASSA798321", "250cc", "Negra", "Yamaha", "2002", 1);
        miVector[5]=new Moto(1700, "ecocuero", "HJ-321654", "DASSA798321", "1700cc", "Verde", "Kawasaki", "2021", 1);
        miVector[6]=new Colectivo(true, true, "Corta distancia", "ASD-654", "KGHJ-654321654", "Diesel", "Azul", "Mercedes Benz", "2005", 28);
        miVector[7]=new Colectivo(true, true, "Larga distancia", "AS-654321", "KGHJ-654321654", "Diesel", "Negro", "Mercedes Benz", "2015", 60);
        miVector[8]=new Camion(true, 4, "MK-199021", "YUAS-3216544465", "Diesel", "Blanco", "Scannia", "1998", 2);
        
        for (int i = 0; i < miVector.length; i++) {
            miVector[i].queSoy();
        }
    }
}