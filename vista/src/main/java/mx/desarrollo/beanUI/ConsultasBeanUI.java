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
import mx.desarrollo.helper.profesorHelper;
import mx.desarrollo.entidad.Unidadap;
import mx.desarrollo.helper.UnidadapHelper;

/**
 *
 * @author Kevin
 */
@ManagedBean(name = "consultasUI")
@SessionScoped
public class ConsultasBeanUI implements Serializable{
    private Unidadap unidad;
    private Profesor profe;
    private profesorHelper profesorHelper;
    private UnidadapHelper unidadapHelper;
    
    public ConsultasBeanUI() {
        profesorHelper = new profesorHelper();
        unidadapHelper = new UnidadapHelper();
    }
    
    /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init(){
        profe= new Profesor();
        unidad = new Unidadap();
    }

    public List<Profesor> getListaProfesor()
    {
        List<Profesor> lista = profesorHelper.todosprofesores();
        return lista;
    }
 
    public List<Unidadap> getListaUnidadap(){
        List<Unidadap> listaunidad = unidadapHelper.todasunidades();
        return listaunidad;
    }

            /* getters y setters*/

    public Profesor getProfesor() {
        return profe;
    }

    public void setProfesor(Profesor profe) {
        this.profe = profe;
    }
    public Unidadap getUnidadap() {
        return unidad;
    }

    public void setUnidadap(Unidadap unidad) {
        this.unidad = unidad;
    }
    
    
    
    
    
    
    
    

    

    
}