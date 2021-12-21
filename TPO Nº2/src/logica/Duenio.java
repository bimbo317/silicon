package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int num_cliente;
    @Basic
    private String nombre;
    private String telefono;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Mascota> listaMascotas;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<ServicioPrestado> listaServiciosPrestados;

    public Duenio() {
    }

    public Duenio(String nombre, String telefono, List<Mascota> listaMascotas) {
        
        this.nombre = nombre;
        this.telefono = telefono;
        this.listaMascotas = listaMascotas;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public List<ServicioPrestado> getListaServiciosPrestados() {
        return listaServiciosPrestados;
    }

    public void setListaServiciosPrestados(List<ServicioPrestado> listaServiciosPrestados) {
        this.listaServiciosPrestados = listaServiciosPrestados;
    }
}
