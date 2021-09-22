/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lalo_
 */
@Entity
@Table(name = "unidadap")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidadap.findAll", query = "SELECT u FROM Unidadap u")
    , @NamedQuery(name = "Unidadap.findByIdUnidadAprendizaje", query = "SELECT u FROM Unidadap u WHERE u.idUnidadAprendizaje = :idUnidadAprendizaje")
    , @NamedQuery(name = "Unidadap.findByNombreUnidadAprendizaje", query = "SELECT u FROM Unidadap u WHERE u.nombreUnidadAprendizaje = :nombreUnidadAprendizaje")
    , @NamedQuery(name = "Unidadap.findByHorasClase", query = "SELECT u FROM Unidadap u WHERE u.horasClase = :horasClase")
    , @NamedQuery(name = "Unidadap.findByHorasTaller", query = "SELECT u FROM Unidadap u WHERE u.horasTaller = :horasTaller")
    , @NamedQuery(name = "Unidadap.findByHorasLaboratorio", query = "SELECT u FROM Unidadap u WHERE u.horasLaboratorio = :horasLaboratorio")})
public class Unidadap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUnidadAprendizaje")
    private Integer idUnidadAprendizaje;
    @Column(name = "NombreUnidadAprendizaje")
    private String nombreUnidadAprendizaje;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HorasClase")
    private Float horasClase;
    @Column(name = "HorasTaller")
    private Float horasTaller;
    @Column(name = "HorasLaboratorio")
    private Float horasLaboratorio;
    @ManyToMany(mappedBy = "unidadapList",cascade = CascadeType.ALL)
    private List<Profesor> profesorList;

    public Unidadap() {
    }

    public Unidadap(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public Integer getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public String getNombreUnidadAprendizaje() {
        return nombreUnidadAprendizaje;
    }

    public void setNombreUnidadAprendizaje(String nombreUnidadAprendizaje) {
        this.nombreUnidadAprendizaje = nombreUnidadAprendizaje;
    }

    public Float getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Float horasClase) {
        this.horasClase = horasClase;
    }

    public Float getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(Float horasTaller) {
        this.horasTaller = horasTaller;
    }

    public Float getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(Float horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @XmlTransient
    public List<Profesor> getProfesorList() {
        return profesorList;
    }

    public void setProfesorList(List<Profesor> profesorList) {
        this.profesorList = profesorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadAprendizaje != null ? idUnidadAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidadap)) {
            return false;
        }
        Unidadap other = (Unidadap) object;
        if ((this.idUnidadAprendizaje == null && other.idUnidadAprendizaje != null) || (this.idUnidadAprendizaje != null && !this.idUnidadAprendizaje.equals(other.idUnidadAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.desarrollo.entidad.Unidadap[ idUnidadAprendizaje=" + idUnidadAprendizaje + " ]";
    }
    
}
