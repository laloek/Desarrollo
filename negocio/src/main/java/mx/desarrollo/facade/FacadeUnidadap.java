/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;
import java.util.List;
import mx.desarrollo.delegate.DelegateUnidadap;
import mx.desarrollo.entidad.Unidadap;
/**
 *
 * @author lalo_
 */
public class FacadeUnidadap {
    private final DelegateUnidadap delegateUnidadap;

    public FacadeUnidadap() {
        this.delegateUnidadap = new DelegateUnidadap();
    }
    
    public void guardarUnidadap(Unidadap unidadap){
        delegateUnidadap.saveUnidadap(unidadap);
    }
    
     public List<Unidadap> todasunidadap()
    {
        return delegateUnidadap.allUnidades();
    }
}
