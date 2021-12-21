package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private Boolean alergico;
    //private Boolean atencion_especial;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, String color, Boolean alergico) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAlergico() {
        return alergico;
    }

    public void setAlergico(Boolean alergico) {
        this.alergico = alergico;
    }
}
