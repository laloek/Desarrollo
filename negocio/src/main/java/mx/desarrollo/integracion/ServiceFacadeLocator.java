/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;

import mx.desarrollo.facade.FacadeProfesor;
import mx.desarrollo.facade.FacadeUnidadap;

/**
 *
 * @author EduardoCardona <>
 */
public class ServiceFacadeLocator {
    
    private static FacadeProfesor facadeProfesor;
    private static FacadeUnidadap facadeUnidadap;
    
    public static FacadeProfesor getInstanceFacadeAlumno() {
        if (facadeProfesor == null) {
            facadeProfesor = new FacadeProfesor();
            return facadeProfesor;
        } else {
            return facadeProfesor;
        }
    }
    
    public static FacadeUnidadap getInstanceFacadeUsuario() {
        if (facadeUnidadap == null) {
            facadeUnidadap = new FacadeUnidadap();
            return facadeUnidadap;
        } else {
            return facadeUnidadap;
        }
    }
}
