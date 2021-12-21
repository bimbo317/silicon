package persistencia;

import java.util.List;
import logica.Duenio;
import logica.Mascota;
import persistencia.exceptions.MiException;

public class ControladoraPersistencia {

    DuenioJpaController duenioJPA = new DuenioJpaController();
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    ServicioPrestadoJpaController servicioPrestadoJPA = new ServicioPrestadoJpaController();

    //método para alta
    public void crearDuenio(Duenio duenio) throws MiException {
        validar(duenio);
        try {
            duenioJPA.create(duenio);
        } catch (Exception e) {
            throw new MiException("Error al crear el Dueño");
        }

    }

    //método para baja
    public void eliminarDuenio(Duenio duenio) throws MiException {
        validar(duenio);
        try {
            duenioJPA.destroy(duenio.getNum_cliente());
        } catch (Exception e) {
            throw new MiException("El dueño no pudo ser eliminado");
        }
    }

    //método para lectura
    public List<Duenio> obtenerDuenios() {
        return duenioJPA.findDuenioEntities();
    }

    //método para modificar
    public void modificarDuenio(Duenio duenio) throws MiException {
        validar(duenio);
        try {
            duenioJPA.edit(duenio);
        } catch (Exception e) {
            throw new MiException("El dueño no pudo ser editado");
        }
    }

    //método buscar
    public Duenio buscarDuenio(Duenio duenio) {
        return duenioJPA.findDuenio(duenio.getNum_cliente());
    }

    //método para buscar dueño por id (nro de cliente)
    public Duenio buscarDuenio(int idDuenio) {
        return duenioJPA.findDuenio(idDuenio);
    }

    //método validar
    public void validar(Duenio duenio) throws MiException {
        if (duenio == null) {
            throw new MiException("El dueño no puede ser nulo");
        }
    }

    //método que busca si existe un cliente con el nombre y celular ingresados, si lo encuentra lo devuelve, sino lo crea
    public Duenio buscarOcrearDuenio(String nombreCliente, String celCliente) throws MiException {
        List<Duenio> listaDuenios = duenioJPA.findDuenioEntities();
        Duenio duenio = new Duenio();
        boolean duenioEncontrado = false;
        //si la lista no esta vacia, la recorro buscando el cliente
        if (!listaDuenios.isEmpty()) {
            for (Duenio duenioActual : listaDuenios) {
                if (duenioActual.getNombre().equalsIgnoreCase(nombreCliente) && duenioActual.getTelefono().equalsIgnoreCase(celCliente)) {
                    duenio = duenioActual;
                    duenioEncontrado = true;
                    break;
                }
            }
        }
        //si el cliente no fue encontrado lo crea
        if (duenioEncontrado == false) {
            duenio.setNombre(nombreCliente.toUpperCase());
            duenio.setTelefono(celCliente);
            try {
                duenioJPA.create(duenio);
            } catch (Exception e) {
                throw new MiException("Error al crear el Dueño");
            }
        }
        return duenio;
    }
    
    // método para buscar la posicion de la mascota dentro de la lista del cliente, en caso de no encontrarla devuelve NULL
    public Integer posicionMascota(Duenio cliente, String nombreMascota, String raza, String color) {
        List<Mascota> listaMascotas=cliente.getListaMascotas();
        Integer posicion=null;
        if (!listaMascotas.isEmpty()) {
            for (Mascota mascotaActual : listaMascotas) {
                if (mascotaActual.getNombre().equalsIgnoreCase(nombreMascota) && mascotaActual.getRaza().equalsIgnoreCase(raza) 
                        && mascotaActual.getColor().equalsIgnoreCase(color)) {
                    posicion=listaMascotas.indexOf(mascotaActual);
                    break;
                }
            }
        }        
        return posicion;
    }
}
