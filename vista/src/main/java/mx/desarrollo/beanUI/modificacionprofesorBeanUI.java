/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.beanUI;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.helper.profesorHelper;

/**
 *
 * @author Kevin
 */
@ManagedBean(name = "modificacionprofesorUI")
@SessionScoped
public class modificacionprofesorBeanUI implements Serializable{
    private Profesor profe;
    private profesorHelper profesorHelper;
    
    public modificacionprofesorBeanUI() {
        profesorHelper = new profesorHelper();
    }
    
    /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init(){
        profe= new Profesor();
    }

    
    public void modificarprofe()
    {
        System.out.println(profe.getApellido());
        System.out.println(profe.getIdProfesor());
        profesorHelper.modificacionprofe(profe);
    }
 
 
    public Profesor buscarprofesor(int id)
    {
        profe = profesorHelper.buscarProfesor(id);
        return profe;
    }
    
    /* getters y setters*/

    public Profesor getProfesor() {
        return profe;
    }

    public void setProfesor(Profesor profe) {
        this.profe = profe;
    }
}