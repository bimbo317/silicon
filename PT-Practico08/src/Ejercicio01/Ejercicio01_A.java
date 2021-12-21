package Ejercicio01;

public class Ejercicio01_A {

    static VideoJuego[] vector = new VideoJuego[5];

    public static void main(String[] args) {

        vector[0] = new VideoJuego("0001", "Mario Bros 3", "NES", 100, "Plataforma");
        vector[1] = new VideoJuego("0002", "Devil May Cry 3", "PlayStation 2", 1000, "Hack & Slash");
        vector[2] = new VideoJuego("0003", "Doom", "PC", 950, "Shooter");
        vector[3] = new VideoJuego("0004", "Super Mario 64", "Nintendo 64", 150, "Horror");
        vector[4] = new VideoJuego("0005", "Fifa 22", "Xbox One", 325, "Soccer");

        mostrarVector();

        System.out.println("Cambiando nombre de jugadores...");
        vector[1].setTitulo("DEVIL MAY CRY 5");
        vector[2].setTitulo("DOOM 3");
        vector[1].setCantJugadores(654);
        vector[2].setCantJugadores(741);

        mostrarVector();
        buscarJuegoPorConsola("Nintendo 64");
    }

    static void mostrarVector() {
        System.out.println("\n---- Lista de Video Juegos ----");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Titulo: " + vector[i].getTitulo() + ", Consola: " + vector[i].getConsola()
                    + ", Cantidad de jugadores: " + vector[i].getCantJugadores());
        }
    }

    static void buscarJuegoPorConsola(String consola) {
        System.out.println("\n---- Lista de Video Juegos de "+consola+" ----");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getConsola().equalsIgnoreCase(consola)) {
                System.out.println("Titulo: " + vector[i].getTitulo() + ", Consola: " + vector[i].getConsola()
                        + ", Cantidad de jugadores: " + vector[i].getCantJugadores());
            }

        }
    }

}
