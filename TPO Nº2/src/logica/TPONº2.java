package logica;

//import igu.Principal;
import igu.Principal1;


public class TPONº2 {

    public static void main(String[] args) {
        //creo la controladora para poder acceder a la logica desde la pantalla
        Controladora control = new Controladora();
        
        //creo la pantalla enviando como parametro la controladora y le seteo los atributos para que sea visible
        //Principal pantalla = new Principal(control);        
        Principal1 pantalla = new Principal1(control);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
    }
}