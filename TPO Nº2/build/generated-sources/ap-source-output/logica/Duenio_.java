package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Mascota;
import logica.ServicioPrestado;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-11-14T20:45:30")
@StaticMetamodel(Duenio.class)
public class Duenio_ { 

    public static volatile SingularAttribute<Duenio, Integer> num_cliente;
    public static volatile SingularAttribute<Duenio, String> telefono;
    public static volatile SingularAttribute<Duenio, String> nombre;
    public static volatile ListAttribute<Duenio, ServicioPrestado> listaServiciosPrestados;
    public static volatile ListAttribute<Duenio, Mascota> listaMascotas;

}