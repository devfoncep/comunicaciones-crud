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
@NamedQueries({ @NamedQuery(name = "SgdComunicacionPrqsAud.findAll",
                            query = "select o from SgdComunicacionPrqsAud o") })
@Table(name = "SGD_COMUNICACION_PRQS_AUD")
public class SgdComunicacionPrqsAud implements Serializable {
    private static final long serialVersionUID = 4942012994281302660L;
    @Column(name = "ES_PQRS_NEW", length = 2)
    private String esPqrsNew;
    @Column(name = "ES_PQRS_OLD", length = 2)
    private String esPqrsOld;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTUALIZACION", nullable = false)
    private Date fechaActualizacion;
    @Id
    @Column(name = "ID_COMUNICACION", nullable = false)
    private BigDecimal idComunicacion;
    @Column(name = "NRO_RADICADO", nullable = false, length = 100)
    private String nroRadicado;
    @Column(name = "USUARIO_ACTUALIZACION", nullable = false, length = 100)
    private String usuarioActualizacion;

    public SgdComunicacionPrqsAud() {
    }

    public SgdComunicacionPrqsAud(String esPqrsNew, String esPqrsOld, Date fechaActualizacion,
                                  BigDecimal idComunicacion, String nroRadicado, String usuarioActualizacion) {
        this.esPqrsNew = esPqrsNew;
        this.esPqrsOld = esPqrsOld;
        this.fechaActualizacion = fechaActualizacion;
        this.idComunicacion = idComunicacion;
        this.nroRadicado = nroRadicado;
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public String getEsPqrsNew() {
        return esPqrsNew;
    }

    public void setEsPqrsNew(String esPqrsNew) {
        this.esPqrsNew = esPqrsNew;
    }

    public String getEsPqrsOld() {
        return esPqrsOld;
    }

    public void setEsPqrsOld(String esPqrsOld) {
        this.esPqrsOld = esPqrsOld;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public BigDecimal getIdComunicacion() {
        return idComunicacion;
    }

    public void setIdComunicacion(BigDecimal idComunicacion) {
        this.idComunicacion = idComunicacion;
    }

    public String getNroRadicado() {
        return nroRadicado;
    }

    public void setNroRadicado(String nroRadicado) {
        this.nroRadicado = nroRadicado;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }
}
