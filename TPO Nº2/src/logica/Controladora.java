package logica;

import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.MiException;

public class Controladora {
    
    ControladoraPersistencia controladora = new ControladoraPersistencia();
    
    //método para alta
    public void crearDuenio(Duenio duenio) throws MiException {
        try {
            controladora.crearDuenio(duenio);
        } catch (MiException ex) {
            throw new MiException("No se pudo crear el dueño");
        }
    }
    
    //método para baja
    public void eliminarDuenio(Duenio duenio) throws MiException{
        try {
            controladora.eliminarDuenio(duenio);
        } catch (MiException ex) {
            throw new MiException("No se pudo eliminar el dueño");
        }
    }
    
    //método para lectura
    public List<Duenio> obtenerDuenios(){
        return controladora.obtenerDuenios();
    }
    
    //método para modificar
    public void modificarDuenio(Duenio duenio) throws MiException{
        try {
            controladora.modificarDuenio(duenio);
        } catch (MiException ex) {
            throw new MiException("No se pudo modificar el dueño");
        }
    }
    
    //método buscar
    public Duenio buscarDuenio(Duenio duenio){
        return controladora.buscarDuenio(duenio);
    }
    
    public Duenio buscarDuenio(int idDuenio){
        return controladora.buscarDuenio(idDuenio);
    }    
    //metodo para guardar los valores ingresados.
    public void guardarServicio(String nombreCliente, String celCliente, String nombreMascota, String raza, String color, String tareasObservaciones, int alergico, int atencionEspecial) throws MiException {
        //valido que todos los campos hayan sido ingresados
        validarCamposIngresados(nombreCliente, celCliente, nombreMascota, raza, color, tareasObservaciones);
        Duenio cliente= controladora.buscarOcrearDuenio(nombreCliente, celCliente);
        //Busco la posicion en la lista de mascotas del cliente ingresado, si no la encuentra devuelve NULL
        Integer posicionMascota=controladora.posicionMascota(cliente, nombreMascota, raza, color);
        Mascota mascota;
        if (posicionMascota==null) {
            //no encontró la mascota en ninguna posicion, se crea una nueva seteando los datos que fueron ingresados
            mascota=new Mascota();
            mascota.setNombre(nombreMascota.toUpperCase());
            mascota.setRaza(raza.toUpperCase());
            mascota.setColor(color.toUpperCase());
            mascota.setAlergico(posicionAbooleano(alergico));
            //se agrega la mascota creada a la lista del cliente ingresado
            cliente.getListaMascotas().add(mascota);
        } else {
            //si la mascota se encuentra se busca de la lista y se selecciona para su guardado en el servicioPrestado.
            mascota=cliente.getListaMascotas().get(posicionMascota);
        }
        //creo un nuevo servicio con los datos ingresados y le agrego la fecha y hora de forma automatica (para en una segunda iteracion 
            //poder identificar cada servicioPrestado por fecha y hora).
        ServicioPrestado servPrestado=new ServicioPrestado(new Date(), tareasObservaciones, mascota, posicionAbooleano(atencionEspecial));
        //agrego el servicioPrestado a la lista
        cliente.getListaServiciosPrestados().add(servPrestado);
        //Guardo los cambios en el cliente
        try {
            //guardo los datos del ServicioPrestado asociandolo al cliente ingresado junto con su mascota.
            modificarDuenio(cliente);
        } catch (Exception e) {
            // en caso de error creo una excepcion y la muestro por pantalla.
            throw new MiException("No se pudo guardar el servicio");
        }
        
    }
    
    //método para validar el ingreso de todos los campos, en caso de que falte uno lanza una excepcion y muestra cartel de error
    private void validarCamposIngresados(String nombreCliente, String celCliente, String nombreMascota, String raza, String color, String tareasObservaciones) throws MiException {
        //si el texto de la variable es el texto por defecto se genera una excepcion porque no se ingresó ningun valor en ese campo
        if (nombreCliente.equals("Ingrese nombre Dueño")) {
            throw new MiException("Falta nombre Dueño");
        }
        
        if (celCliente.equals("Ingrese celular Dueño")) {
            throw new MiException("Falta celular Dueño");
        }
        
        if (nombreMascota.equals("Ingrese nombre Mascota")) {
            throw new MiException("Falta nombre Mascota");
        }
        
        if (raza.equals("Ingrese raza Mascota")) {
            throw new MiException("Falta raza Mascota");
        }
        
        if (color.equals("Ingrese color de Mascota")) {
            throw new MiException("Falta color Mascota");
        }
        
        if (tareasObservaciones.equals("Ingrese las tareas realizadas y las observaciones")) {
            throw new MiException("Faltan las tareas realizadas");
        }
    }
    
    // método que transforma el index del combobox por un True o false
    private boolean posicionAbooleano(int indice){
        return indice==1;
    }
}
