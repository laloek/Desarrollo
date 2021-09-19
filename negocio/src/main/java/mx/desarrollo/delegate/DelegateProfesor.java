
package mx.desarrollo.delegate;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.integracion.ServiceLocator;

public class DelegateProfesor {
    
    public void saveProfesor(Profesor profesor){
        ServiceLocator.getInstanceAlumnoDAO().save(profesor);
    }
    
}
