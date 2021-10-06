/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;
import java.util.List;
import mx.desarrollo.delegate.DelegateProfesor;
import mx.desarrollo.entidad.Profesor;
/**
 *
 * @author lalo_
 */
public class FacadeProfesor {
    private final DelegateProfesor delegateProfesor;

    public FacadeProfesor() {
        this.delegateProfesor = new DelegateProfesor();
    }
    
    public void guardarProfesor(Profesor profesor){
        delegateProfesor.saveProfesor(profesor);
        
    }
    
    public void modificarprofesor(Profesor profe)
    {
        delegateProfesor.updateprofesor(profe);
    }
    
    public void eliminarProfesor(Profesor profesor)
    {
        delegateProfesor.deleteProfesor(profesor);
    }
    
    public List<Profesor> todosprofesores()
    {
        return delegateProfesor.allProfesor();
    }
    
    public Profesor busquedaProfesor(int id)
    {
        
        return delegateProfesor.searchProfesor(id);
    }
    
    
}
