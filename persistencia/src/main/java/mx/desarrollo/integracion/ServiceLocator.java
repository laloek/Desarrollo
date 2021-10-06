/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;

import mx.desarrollo.DAO.ProfesorDAO;
import mx.desarrollo.DAO.UnidadapDAO;


/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static ProfesorDAO profesorDAO;
    private static UnidadapDAO unidadapDAO;
    
    public static ProfesorDAO getInstanceProfesorDAO(){
        if(profesorDAO == null){
            profesorDAO = new ProfesorDAO();
            return profesorDAO;
        } else{
            return profesorDAO;
        }
    }
    
    public static UnidadapDAO getInstanceUnidadapDAO(){
        if(unidadapDAO == null){
            unidadapDAO = new UnidadapDAO();
            return unidadapDAO;
        } else{
            return unidadapDAO;
        }
    }
    
}
