/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Evelin
 */
@Entity
@Table(name = "artesanos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artesanos.findAll", query = "SELECT a FROM Artesanos a")
    , @NamedQuery(name = "Artesanos.findByArtesanosId", query = "SELECT a FROM Artesanos a WHERE a.artesanosId = :artesanosId")
    , @NamedQuery(name = "Artesanos.findByNombre", query = "SELECT a FROM Artesanos a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Artesanos.findByApellido", query = "SELECT a FROM Artesanos a WHERE a.apellido = :apellido")
    , @NamedQuery(name = "Artesanos.findByHistoria", query = "SELECT a FROM Artesanos a WHERE a.historia = :historia")
    , @NamedQuery(name = "Artesanos.findByRegion", query = "SELECT a FROM Artesanos a WHERE a.region = :region")
    , @NamedQuery(name = "Artesanos.findByImagen", query = "SELECT a FROM Artesanos a WHERE a.imagen = :imagen")})
public class Artesanos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "artesanos_id")
    private Integer artesanosId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 200)
    @Column(name = "historia")
    private String historia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "region")
    private String region;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "imagen")
    private String imagen;
    @JoinColumn(name = "categorias_id", referencedColumnName = "categorias_id")
    @ManyToOne
    private Categorias categoriasId;

    public Artesanos() {
    }

    public Artesanos(Integer artesanosId) {
        this.artesanosId = artesanosId;
    }

    public Artesanos(Integer artesanosId, String nombre, String apellido, String region, String imagen) {
        this.artesanosId = artesanosId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.region = region;
        this.imagen = imagen;
    }

    public Integer getArtesanosId() {
        return artesanosId;
    }

    public void setArtesanosId(Integer artesanosId) {
        this.artesanosId = artesanosId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Categorias getCategoriasId() {
        return categoriasId;
    }

    public void setCategoriasId(Categorias categoriasId) {
        this.categoriasId = categoriasId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artesanosId != null ? artesanosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artesanos)) {
            return false;
        }
        Artesanos other = (Artesanos) object;
        if ((this.artesanosId == null && other.artesanosId != null) || (this.artesanosId != null && !this.artesanosId.equals(other.artesanosId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Artesanos[ artesanosId=" + artesanosId + " ]";
    }
    
}
