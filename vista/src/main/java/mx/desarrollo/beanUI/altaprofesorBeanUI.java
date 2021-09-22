/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.beanUI;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.entidad.Unidadap;
import mx.desarrollo.helper.UnidadapHelper;
import mx.desarrollo.helper.profesorHelper;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Kevin
 */
@ManagedBean(name = "altaprofesorUI")
@ViewScoped
public class altaprofesorBeanUI implements Serializable {

    private Profesor profe;
    private List<Unidadap> unidadapList;
    private List<Integer> listaIdUnidad;
    private profesorHelper profesorHelper;

    public altaprofesorBeanUI() {
        profesorHelper = new profesorHelper();
    }

    /**
     * Metodo postconstructor todo lo que este dentro de este metodo sera la
     * primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init() {
        profe = new Profesor();
        unidadapList= new UnidadapHelper().todasunidades();
        listaIdUnidad = new ArrayList();
    }

    public void nuevoProfesor() throws IOException {
        profe.setUnidadapList(asociarUnidades());
        profesorHelper.altaProfesor(profe);
        //PrimeFaces.current().dialog().showMessageDynamic(new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Registro realizado"));
        cambioPagina();
    }

    public List<Unidadap> asociarUnidades() {
        List<Unidadap> unidadesAsociadas = new ArrayList();
        for(int x=0; x<unidadapList.size(); x++){
            for(int y=0; y<listaIdUnidad.size(); y++){
                if(Objects.equals(unidadapList.get(x).getIdUnidadAprendizaje(), listaIdUnidad.get(y))){
                    unidadesAsociadas.add(unidadapList.get(x));
                    
                }
            }
        }
        return unidadesAsociadas;
    }
    public void cambioPagina() throws IOException {
        String appURL = "/Inicio.xhtml";
        FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + appURL);
    }
    

    /* getters y setters*/
    public List<Unidadap> getUnidadapList() {
        return unidadapList;
    }

    
    public void setUnidadapList(List<Unidadap> unidadapList) {
        this.unidadapList = unidadapList;
    }

    public Profesor getProfesor() {
        return profe;
    }

    public void setProfesor(Profesor profe) {
        this.profe = profe;
    }

    public List<Integer> getListaIdUnidad() {
        return listaIdUnidad;
    }

    public void setListaIdUnidad(List<Integer> listaIdUnidad) {
        this.listaIdUnidad = listaIdUnidad;
    }

}
