/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.helper;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author Kevin
 */
public class profesorHelper implements Serializable{
   
 
    public void altaProfesor(Profesor profe){
        ServiceFacadeLocator.getInstanceFacadeProfesor().guardarProfesor(profe);
    }
    
}
