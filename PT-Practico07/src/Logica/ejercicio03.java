package Logica;


public class ejercicio03 {

    public static void main(String[] args) {
        Mascota[] vectorMascotas = new Mascota[5];
        vectorMascotas[0]= new Mascota("Nancy", "Gato", "H", "Canela", "Largo", "Chartreux");
        vectorMascotas[1]= new Mascota("Bobby", "Perro", "M", "Naranja", "Corto", "Callejero");
        vectorMascotas[2]= new Mascota("Tadeo", "Perro", "M", "Negro, Blanco y Amarillo", "Largo", "Pastor Aleman");
        vectorMascotas[3]= new Mascota("Pelusa", "Pájaro", "H", "Azul", "Tiene plumas", "Carpintero");
        vectorMascotas[4]= new Mascota("Bartolito", "Tortuga", "M", "Gris", "No tiene", "Marina");
        
        System.out.println("------- Listado de Mascotas -------");
        for (int i = 0; i < vectorMascotas.length; i++) {
            System.out.println("Nombre: "+vectorMascotas[i].getNombre()+", Especie: "+vectorMascotas[i].getEspecie()+", Sexo: "+vectorMascotas[i].getSexo());
        }
        System.out.println("\nCambiando nombre de mascotas...");
        vectorMascotas[2].setNombre("Dumbo");
        vectorMascotas[4].setNombre("Rafael");
        System.out.println("Nombre: "+vectorMascotas[2].getNombre()+", Especie: "+vectorMascotas[2].getEspecie()+", Sexo: "+vectorMascotas[2].getSexo());
        System.out.println("Nombre: "+vectorMascotas[4].getNombre()+", Especie: "+vectorMascotas[4].getEspecie()+", Sexo: "+vectorMascotas[4].getSexo());
        
        System.out.println("\n------- Solo Perros -------");
        for (int i = 0; i < vectorMascotas.length; i++) {
            if (vectorMascotas[i].getEspecie().equalsIgnoreCase("perro")) {
                System.out.println("Nombre: "+vectorMascotas[i].getNombre()+", Especie: "+vectorMascotas[i].getEspecie()+", Sexo: "+vectorMascotas[i].getSexo());
            }
        }
    }
}