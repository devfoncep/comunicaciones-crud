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
@NamedQueries({ @NamedQuery(name = "SgdUsuarioNew.findAll", query = "select o from SgdUsuarioNew o") })
@Table(name = "SGD_USUARIO_NEW")
public class SgdUsuarioNew implements Serializable {
    private static final long serialVersionUID = 5325175382482439292L;
    @Column(name = "CODIGO_DEPENDENCIA")
    private Long codigoDependencia;
    @Column(length = 100)
    private String email;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTUALIZACION")
    private Date fechaActualizacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Id
    @Column(name = "ID_USUARIO", length = 100)
    private String idUsuario;
    @Column(name = "NOMBRE_USUARIO", length = 100)
    private String nombreUsuario;
    @Column(name = "USUARIO_ACTUALIZACION", length = 100)
    private String usuarioActualizacion;
    @Column(name = "USUARIO_CREACION", nullable = false, length = 100)
    private String usuarioCreacion;

    public SgdUsuarioNew() {
    }

    public SgdUsuarioNew(Long codigoDependencia, String email, Date fechaActualizacion, Date fechaCreacion,
                         String idUsuario, String nombreUsuario, String usuarioActualizacion, String usuarioCreacion) {
        this.codigoDependencia = codigoDependencia;
        this.email = email;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.usuarioActualizacion = usuarioActualizacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    public Long getCodigoDependencia() {
        return codigoDependencia;
    }

    public void setCodigoDependencia(Long codigoDependencia) {
        this.codigoDependencia = codigoDependencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }
}
