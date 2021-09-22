/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.beanUI;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.entidad.Unidadap;
import mx.desarrollo.helper.profesorHelper;

/**
 *
 * @author Kevin
 */
@ManagedBean(name = "altaprofesorUI")
@SessionScoped
public class altaprofesorBeanUI implements Serializable{
    private Profesor profe;
    private List<Unidadap> unidadapList;
    private profesorHelper profesorHelper;
    
    public altaprofesorBeanUI() {
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

    public void nuevoProfesor()
    {
        System.out.print(profe.getNombre());
        System.out.print(profe.getApellido());
        System.out.print(profe.getRfc());
        profe.setUnidadapList(unidadapList);
        profesorHelper.altaProfesor(profe);
    }
 public void listaunidades(int unidad){
       System.out.println(unidad);
    }
    
    /* getters y setters*/

    public Profesor getProfesor() {
        return profe;
    }

    public void setProfesor(Profesor profe) {
        this.profe = profe;
    }
    
    
    
    
    
    
    
    

    

    
}