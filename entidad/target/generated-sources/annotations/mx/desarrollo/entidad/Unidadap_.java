package mx.desarrollo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.desarrollo.entidad.Profesor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-19T15:27:00")
@StaticMetamodel(Unidadap.class)
public class Unidadap_ { 

    public static volatile SingularAttribute<Unidadap, String> nombreUnidadAprendizaje;
    public static volatile SingularAttribute<Unidadap, Integer> idUnidadAprendizaje;
    public static volatile SingularAttribute<Unidadap, Float> horasLaboratorio;
    public static volatile SingularAttribute<Unidadap, Float> horasClase;
    public static volatile CollectionAttribute<Unidadap, Profesor> profesorCollection;
    public static volatile SingularAttribute<Unidadap, Float> horasTaller;

}