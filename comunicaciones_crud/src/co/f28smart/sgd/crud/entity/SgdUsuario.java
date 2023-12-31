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
@NamedQueries({ @NamedQuery(name = "SgdUsuario.findAll", query = "select o from SgdUsuario o"),
                @NamedQuery(name = "SgdUsuario.findById", 
                            query = "select o from SgdUsuario o where o.idUsuario = :param and o.activo = 1"),
                @NamedQuery(name = "SgdUsuario.findByDependencia", 
                            query = "select o from SgdUsuario o where o.codigoDependencia = :param and o.activo = 1 order by o.nombreUsuario asc"),
                @NamedQuery(name = "SgdUsuario.findByDependencyApprovers", 
                            query = "select o from SgdUsuario o, SgdRolUsuarioDep ur where o.idUsuario = ur.idUsuario and ur.idRol = 2 AND ur.codigoDependencia = :param AND o.activo = 1 order by o.nombreUsuario asc")
                })
@Table(name = "SGD_USUARIO")
@SuppressWarnings("oracle.jdeveloper.ejb.entity-class-auto-id-gen")
public class SgdUsuario implements Serializable {
    @SuppressWarnings("compatibility:-81295835425403243")
    private static final long serialVersionUID = 1L;

    @Column(name = "CODIGO_DEPENDENCIA")
    private Integer codigoDependencia;
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
    @Column(name = "ACTIVO", nullable = false)
    private int activo;

    public SgdUsuario() {
    }

    public SgdUsuario(Integer codigoDependencia, String email, Date fechaActualizacion, Date fechaCreacion,
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

    public Integer getCodigoDependencia() {
        return codigoDependencia;
    }

    public void setCodigoDependencia(Integer codigoDependencia) {
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

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getActivo() {
        return activo;
    }
}
