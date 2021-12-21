package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Mascota;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-11-14T20:45:30")
@StaticMetamodel(ServicioPrestado.class)
public class ServicioPrestado_ { 

    public static volatile SingularAttribute<ServicioPrestado, Date> fecha;
    public static volatile SingularAttribute<ServicioPrestado, String> observaciones;
    public static volatile SingularAttribute<ServicioPrestado, Boolean> atencion_especial;
    public static volatile SingularAttribute<ServicioPrestado, String> id;
    public static volatile SingularAttribute<ServicioPrestado, Mascota> mascotaAtendida;

}