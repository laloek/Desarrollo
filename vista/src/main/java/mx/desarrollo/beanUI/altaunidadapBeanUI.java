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
import mx.desarrollo.entidad.Unidadap;
import mx.desarrollo.helper.UnidadapHelper;

/**
 *
 * @author Kevin
 */
@ManagedBean(name = "altaunidadapUI")
@SessionScoped
public class altaunidadapBeanUI implements Serializable{
    private Unidadap unidadap;
    private UnidadapHelper unidadapHelper;
    
    public altaunidadapBeanUI() {
        unidadapHelper = new UnidadapHelper();
    }
    
    /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init(){
        unidadap= new Unidadap();
    }

    public void nuevaUnidadap()
    {
        System.out.println("smn al ui");
        Unidadap uap= new Unidadap();
        uap.setNombreUnidadAprendizaje(unidadap.getNombreUnidadAprendizaje());
        uap.setHorasClase(unidadap.getHorasClase());
        uap.setHorasLaboratorio(unidadap.getHorasLaboratorio());
        uap.setHorasTaller(unidadap.getHorasTaller());
        System.out.println(uap.getNombreUnidadAprendizaje());
        System.out.println(uap.getHorasClase());
        System.out.println(uap.getHorasLaboratorio());
        System.out.println(uap.getHorasTaller());
        unidadapHelper.altaUnidadap(uap);
        
    }
 
    
    /* getters y setters*/

    public Unidadap getUnidadap() {
        return unidadap;
    }

    public void setUnidadap(Unidadap unidadap) {
        this.unidadap = unidadap;
    }
    
    
    
    
    
    
    
    

    

    
}
