package mx.desarrollo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.desarrollo.entidad.Unidadap;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-19T15:27:00")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile SingularAttribute<Profesor, Integer> idProfesor;
    public static volatile CollectionAttribute<Profesor, Unidadap> unidadapCollection;
    public static volatile SingularAttribute<Profesor, String> apellido;
    public static volatile SingularAttribute<Profesor, String> nombre;
    public static volatile SingularAttribute<Profesor, String> rfc;

}