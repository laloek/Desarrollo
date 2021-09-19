/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;
import mx.desarrollo.delegate.DelegateUnidadap;
import mx.desarrollo.entidad.Unidadap;
/**
 *
 * @author lalo_
 */
public class FacadeUnidadap {
    private final DelegateUnidadap delegateProfesor;

    public FacadeUnidadap() {
        this.delegateProfesor = new DelegateUnidadap();
    }
    
    public void guardarAlumno(Unidadap unidadap){
        delegateProfesor.saveUnidadap(unidadap);
    }
}
