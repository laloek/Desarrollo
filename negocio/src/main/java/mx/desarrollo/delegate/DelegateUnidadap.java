/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;
import mx.desarrollo.entidad.Unidadap;
import mx.desarrollo.integracion.ServiceLocator;
/**
 *
 * @author lalo_
 */
public class DelegateUnidadap {
    
    public void saveUnidadap(Unidadap unidadap){
        ServiceLocator.getInstanceUsuarioDAO().save(unidadap);
    }
    
}
