package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

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
@NamedQueries({ @NamedQuery(name = "SgdDependencia.findAll", query = "select o from SgdDependencia o"),
                @NamedQuery(name = "SgdDependencia.findById", query = "select o from SgdDependencia o where o.codigoDependencia = :param"),
                @NamedQuery(name = "SgdDependencia.findDependencias", 
                            query = "select d from SgdDependencia d where d.vigente = 1 order by d.dependencia asc")
                })
@Table(name = "SGD_DEPENDENCIA")
public class SgdDependencia implements Serializable {
    @SuppressWarnings("compatibility:3103887272074231263")
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODIGO_DEPENDENCIA", nullable = false, length = 100)
    private Integer codigoDependencia;
    @Column(nullable = false, length = 200)
    private String dependencia;
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
    @Column(name = "USUARIO_CREACION", length = 50)
    private String usuarioCreacion;
    @Column(name = "USUARIO_MODIFICACION", length = 50)
    private String usuarioModificacion;
    @Column(nullable = false)
    private BigDecimal vigente;
    @Column
    private String ciudad;

    public SgdDependencia() {
    }

    public SgdDependencia(Integer codigoDependencia, String dependencia, Date fechaCreacion, Date fechaModificacion,
                           BigDecimal idSubCategoria, String ipCreacion, String ipModificacion, String subcategoria,
                           String usuarioCreacion, String usuarioModificacion, String vicepresidencia,
                           BigDecimal vigente) {
        this.codigoDependencia = codigoDependencia;
        this.dependencia = dependencia;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.ipCreacion = ipCreacion;
        this.ipModificacion = ipModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.vigente = vigente;
    }

    public Integer getCodigoDependencia() {
        return codigoDependencia;
    }

    public void setCodigoDependencia(Integer codigoDependencia) {
        this.codigoDependencia = codigoDependencia;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
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

    public BigDecimal getVigente() {
        return vigente;
    }

    public void setVigente(BigDecimal vigente) {
        this.vigente = vigente;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }
}
