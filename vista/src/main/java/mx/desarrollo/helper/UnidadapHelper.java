/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.helper;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import mx.desarrollo.entidad.Unidadap;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author Kevin
 */
public class UnidadapHelper implements Serializable{
    

    /**
     * Metodo para hacer login llamara a la instancia de usuarioFacade
     * @param correo
     * @param password
     * @return 
     */
    
    public void altaUnidadap(Unidadap uap){
        System.out.println("smn al helper");
        ServiceFacadeLocator.getInstanceFacadeUnidadap().guardarUnidadap(uap);
    }
    
}
