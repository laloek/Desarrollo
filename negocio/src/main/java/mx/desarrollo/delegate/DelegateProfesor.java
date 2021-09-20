
package mx.desarrollo.delegate;
import java.util.List;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.integracion.ServiceLocator;

public class DelegateProfesor {
    
    public void saveProfesor(Profesor profesor){
        ServiceLocator.getInstanceProfesorDAO().save(profesor);
    }
    
    public List<Profesor> allProfesor()
    {
        return ServiceLocator.getInstanceProfesorDAO().findAll();
    }
}
