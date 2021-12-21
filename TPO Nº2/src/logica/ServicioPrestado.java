package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ServicioPrestado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic
    private String observaciones;
    private Boolean atencion_especial;
    @ManyToOne
    private Mascota mascotaAtendida;

    public ServicioPrestado(Date fecha, String observaciones, Mascota mascota, Boolean atencion_especial) {
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.atencion_especial = atencion_especial;
        this.mascotaAtendida=mascota;
    }

    public ServicioPrestado() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(Boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public Mascota getMascotaAtendida() {
        return mascotaAtendida;
    }

    public void setMascotaAtendida(Mascota mascotaAtendida) {
        this.mascotaAtendida = mascotaAtendida;
    }
    
    
}
