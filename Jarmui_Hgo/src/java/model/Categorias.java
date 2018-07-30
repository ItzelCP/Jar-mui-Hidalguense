/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Evelin
 */
@Entity
@Table(name = "categorias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorias.findAll", query = "SELECT c FROM Categorias c")
    , @NamedQuery(name = "Categorias.findByCategoriasId", query = "SELECT c FROM Categorias c WHERE c.categoriasId = :categoriasId")
    , @NamedQuery(name = "Categorias.findByNombre", query = "SELECT c FROM Categorias c WHERE c.nombre = :nombre")})
public class Categorias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "categorias_id")
    private Integer categoriasId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "categoriasId")
    private List<Artesanos> artesanosList;

    public Categorias() {
    }

    public Categorias(Integer categoriasId) {
        this.categoriasId = categoriasId;
    }

    public Categorias(Integer categoriasId, String nombre) {
        this.categoriasId = categoriasId;
        this.nombre = nombre;
    }

    public Integer getCategoriasId() {
        return categoriasId;
    }

    public void setCategoriasId(Integer categoriasId) {
        this.categoriasId = categoriasId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Artesanos> getArtesanosList() {
        return artesanosList;
    }

    public void setArtesanosList(List<Artesanos> artesanosList) {
        this.artesanosList = artesanosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriasId != null ? categoriasId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorias)) {
            return false;
        }
        Categorias other = (Categorias) object;
        if ((this.categoriasId == null && other.categoriasId != null) || (this.categoriasId != null && !this.categoriasId.equals(other.categoriasId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Categorias[ categoriasId=" + categoriasId + " ]";
    }
    
}
