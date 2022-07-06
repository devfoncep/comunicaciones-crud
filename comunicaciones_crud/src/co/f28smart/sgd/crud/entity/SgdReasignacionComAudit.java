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
@NamedQueries({ @NamedQuery(name = "SgdReasignacionComAudit.findAll",
                            query = "select o from SgdReasignacionComAudit o") })
@Table(name = "SGD_REASIGNACION_COM_AUDIT")
public class SgdReasignacionComAudit implements Serializable {
    private static final long serialVersionUID = -4987428639304910337L;
    @Column(name = "DIAS_PARA_RESPUESTA")
    private Integer diasParaRespuesta;
    @Column(name = "ESTADO_COMUNICACION", length = 100)
    private String estadoComunicacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_VENCIMIENTO")
    private Date fechaVencimiento;
    @Column(name = "ID_DEP_DESTINO_NEW")
    private Integer idDepDestinoNew;
    @Column(name = "ID_DEP_DESTINO_OLD")
    private Integer idDepDestinoOld;
    @Column(name = "ID_DEP_ORIGEN")
    private Integer idDepOrigen;
    @Id
    @Column(name = "ID_REASG_COM", nullable = false)
    private BigDecimal idReasgCom;
    @Column(name = "NRO_RADICADO", length = 100)
    private String nroRadicado;
    @Column(name = "TIPO_COMUNICACION", length = 100)
    private String tipoComunicacion;
    @Column(name = "USUARIO_ACT_COM", length = 100)
    private String usuarioActCom;

    public SgdReasignacionComAudit() {
    }

    public SgdReasignacionComAudit(Integer diasParaRespuesta, String estadoComunicacion, Date fechaCreacion,
                                   Date fechaVencimiento, Integer idDepDestinoNew, Integer idDepDestinoOld,
                                   Integer idDepOrigen, BigDecimal idReasgCom, String nroRadicado,
                                   String tipoComunicacion, String usuarioActCom) {
        this.diasParaRespuesta = diasParaRespuesta;
        this.estadoComunicacion = estadoComunicacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
        this.idDepDestinoNew = idDepDestinoNew;
        this.idDepDestinoOld = idDepDestinoOld;
        this.idDepOrigen = idDepOrigen;
        this.idReasgCom = idReasgCom;
        this.nroRadicado = nroRadicado;
        this.tipoComunicacion = tipoComunicacion;
        this.usuarioActCom = usuarioActCom;
    }

    public Integer getDiasParaRespuesta() {
        return diasParaRespuesta;
    }

    public void setDiasParaRespuesta(Integer diasParaRespuesta) {
        this.diasParaRespuesta = diasParaRespuesta;
    }

    public String getEstadoComunicacion() {
        return estadoComunicacion;
    }

    public void setEstadoComunicacion(String estadoComunicacion) {
        this.estadoComunicacion = estadoComunicacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getIdDepDestinoNew() {
        return idDepDestinoNew;
    }

    public void setIdDepDestinoNew(Integer idDepDestinoNew) {
        this.idDepDestinoNew = idDepDestinoNew;
    }

    public Integer getIdDepDestinoOld() {
        return idDepDestinoOld;
    }

    public void setIdDepDestinoOld(Integer idDepDestinoOld) {
        this.idDepDestinoOld = idDepDestinoOld;
    }

    public Integer getIdDepOrigen() {
        return idDepOrigen;
    }

    public void setIdDepOrigen(Integer idDepOrigen) {
        this.idDepOrigen = idDepOrigen;
    }

    public BigDecimal getIdReasgCom() {
        return idReasgCom;
    }

    public void setIdReasgCom(BigDecimal idReasgCom) {
        this.idReasgCom = idReasgCom;
    }

    public String getNroRadicado() {
        return nroRadicado;
    }

    public void setNroRadicado(String nroRadicado) {
        this.nroRadicado = nroRadicado;
    }

    public String getTipoComunicacion() {
        return tipoComunicacion;
    }

    public void setTipoComunicacion(String tipoComunicacion) {
        this.tipoComunicacion = tipoComunicacion;
    }

    public String getUsuarioActCom() {
        return usuarioActCom;
    }

    public void setUsuarioActCom(String usuarioActCom) {
        this.usuarioActCom = usuarioActCom;
    }
}
