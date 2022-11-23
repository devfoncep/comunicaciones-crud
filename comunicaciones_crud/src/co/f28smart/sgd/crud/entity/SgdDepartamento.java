package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Cacheable(false)
@NamedQueries({ @NamedQuery(name = "SgdDepartamento.findAll", 
                            query = "select o from SgdDepartamento o where o.vigente = 1") })
@Table(name = "SGD_DEPARTAMENTO")
public class SgdDepartamento implements Serializable {
    @SuppressWarnings("oracle.jdeveloper.java.serialversionuid-stale")
    private static final long serialVersionUID = -2443379136011167450L;
    
    @Id
    @Column(name = "ID_DEPARTAMENTO", nullable = false)
    private Integer idDepartamento;
    @Column(length = 6)
    private String codigo;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_MODIFICACION")
    private Date fechaModificacion;
    @Column(name = "IP_CREACION", length = 20)
    private String ipCreacion;
    @Column(name = "IP_MODIFICACION", length = 20)
    private String ipModificacion;
    @Column(length = 50)
    private String nombre;
    @Column(name = "USUARIO_CREACION", length = 50)
    private String usuarioCreacion;
    @Column(name = "USUARIO_MODIFICACION", length = 50)
    private String usuarioModificacion;
    private Integer vigente;

    public SgdDepartamento() {
    }

    public SgdDepartamento(String codigo, Date fechaCreacion, Date fechaModificacion, Integer idDepartamento,
                           String ipCreacion, String ipModificacion, String nombre, String usuarioCreacion,
                           String usuarioModificacion, Integer vigente) {
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.idDepartamento = idDepartamento;
        this.ipCreacion = ipCreacion;
        this.ipModificacion = ipModificacion;
        this.nombre = nombre;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.vigente = vigente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getIpCreacion() {
        return ipCreacion;
    }

    public void setIpCreacion(String ipCreacion) {
        this.ipCreacion = ipCreacion;
    }

    public String getIpModificacion() {
        return ipModificacion;
    }

    public void setIpModificacion(String ipModificacion) {
        this.ipModificacion = ipModificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Integer getVigente() {
        return vigente;
    }

    public void setVigente(Integer vigente) {
        this.vigente = vigente;
    }
}
