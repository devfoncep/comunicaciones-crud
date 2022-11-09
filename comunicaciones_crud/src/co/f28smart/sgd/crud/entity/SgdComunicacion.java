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
@NamedQueries({ @NamedQuery(name = "SgdComunicacion.findAll", query = "select o from SgdComunicacion o"),
                @NamedQuery(name = "SgdComunicacion.findByNroRadicado", query = "select o from SgdComunicacion o where o.nroRadicado = :nroRadicado ")})
@Table(name = "SGD_COMUNICACION")
public class SgdComunicacion implements Serializable {
    @SuppressWarnings("compatibility:2548931255626527989")
    private static final long serialVersionUID = 1L;

    @Column(length = 10)
    private String appname;
    @Column(nullable = false, length = 510)
    private String asunto;
    @Column(name = "DIAS_PARA_RESPUESTA")
    private Integer diasParaRespuesta;
    @Column(name = "ESTADO_COMUNICACION", length = 100)
    private String estadoComunicacion;
    @Column(name = "ES_PQRS", length = 2)
    private String esPqrs;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTUALIZACION")
    private Date fechaActualizacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_VENCIMIENTO")
    private Date fechaVencimiento;
    @Id
    @Column(name = "ID_COMUNICACION")
    private BigDecimal idComunicacion;
    @Column(name = "ID_TIPO_DOCUMENTAL_TRAMITE")
    private Long idTipoDocumentalTramite;
    @Column(name = "ID_TIPO_SOLICITUD")
    private BigDecimal idTipoSolicitud;
    @Column(name = "ID_TRAMITE")
    private Integer idTramite;
    @Column(name = "ID_UNIDAD_PRODUCTORA", nullable = false)
    private Integer idUnidadProductora;
    @Column(name = "INSTANCE_NUMBER")
    private BigDecimal instanceNumber;
    @Column(name = "MEDIO_RESPUESTA", length = 100)
    private String medioRespuesta;
    @Column(name = "NRO_RADICADO", length = 100)
    private String nroRadicado;
    @Column(name = "NRO_RADICADO_RELACIONADO", length = 100)
    private String nroRadicadoRelacionado;
    @Column(length = 200)
    private String referencia;
    @Column(name = "REQUIERE_RESPUESTA", nullable = false, length = 1)
    private String requiereRespuesta;
    @Column(name = "TIPO_COMUNICACION", length = 100)
    private String tipoComunicacion;
    @Column(length = 100)
    private String tramite;
    @Column(name = "USUARIO_ACTUALIZACION", length = 100)
    private String usuarioActualizacion;
    @Column(name = "USUARIO_CREACION", nullable = false, length = 100)
    private String usuarioCreacion;
    @Column(name="DESCRIPCION")
    private String descripcion;

    public SgdComunicacion() {
    }

    public SgdComunicacion(String accesoNegado, String appname, String asunto, String codSerie, String codSubserie,
                           String comentarios, String contentFldComunicaciones, String contentFldOtro,
                           String contentFldTitulo, Integer diasParaRespuesta, String esPqrs, String esTitulo,
                           String estadoComunicacion, Date fechaActualizacion, Date fechaCreacion,
                           Date fechaVencimiento, String grupoSeguridad, BigDecimal idComunicacion,
                           Integer idDependenciaDestino, BigDecimal idSubCategoria, Long idTipoDocumentalTramite,
                           BigDecimal idTipoSolicitud, Integer idTramite, Integer idUnidadProductora,
                           String identifReservada, BigDecimal instanceNumber, String medioRespuesta,
                           String nombreSerie, String nombreSubserie, String nombreTpDoc, Integer nroAnexos,
                           Integer nroFolios, String nroPlaca, String nroRadicado, String nroRadicadoRelacionado,
                           String referencia, String requiereRespuesta, String tipoComunicacion, String tramite,
                           String trasladoOtraEntidad, String usuarioActualizacion, String usuarioCreacion) {

        this.appname = appname;
        this.asunto = asunto;

        this.diasParaRespuesta = diasParaRespuesta;
        this.esPqrs = esPqrs;

        this.estadoComunicacion = estadoComunicacion;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;

        this.idComunicacion = idComunicacion;

        this.idTipoDocumentalTramite = idTipoDocumentalTramite;
        this.idTipoSolicitud = idTipoSolicitud;
        this.idTramite = idTramite;
        this.idUnidadProductora = idUnidadProductora;

        this.instanceNumber = instanceNumber;
        this.medioRespuesta = medioRespuesta;

        this.nroRadicado = nroRadicado;
        this.nroRadicadoRelacionado = nroRadicadoRelacionado;
        this.referencia = referencia;
        this.requiereRespuesta = requiereRespuesta;
        this.tipoComunicacion = tipoComunicacion;
        this.tramite = tramite;
        this.usuarioActualizacion = usuarioActualizacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
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

    public String getEsPqrs() {
        return esPqrs;
    }

    public void setEsPqrs(String esPqrs) {
        this.esPqrs = esPqrs;
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

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }



    public BigDecimal getIdComunicacion() {
        return idComunicacion;
    }

    public void setIdComunicacion(BigDecimal idComunicacion) {
        this.idComunicacion = idComunicacion;
    }



    public Long getIdTipoDocumentalTramite() {
        return idTipoDocumentalTramite;
    }

    public void setIdTipoDocumentalTramite(Long idTipoDocumentalTramite) {
        this.idTipoDocumentalTramite = idTipoDocumentalTramite;
    }

    public BigDecimal getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(BigDecimal idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public Integer getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Integer idTramite) {
        this.idTramite = idTramite;
    }

    public Integer getIdUnidadProductora() {
        return idUnidadProductora;
    }

    public void setIdUnidadProductora(Integer idUnidadProductora) {
        this.idUnidadProductora = idUnidadProductora;
    }

    public BigDecimal getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(BigDecimal instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    public String getMedioRespuesta() {
        return medioRespuesta;
    }

    public void setMedioRespuesta(String medioRespuesta) {
        this.medioRespuesta = medioRespuesta;
    }



    public String getNroRadicado() {
        return nroRadicado;
    }

    public void setNroRadicado(String nroRadicado) {
        this.nroRadicado = nroRadicado;
    }

    public String getNroRadicadoRelacionado() {
        return nroRadicadoRelacionado;
    }

    public void setNroRadicadoRelacionado(String nroRadicadoRelacionado) {
        this.nroRadicadoRelacionado = nroRadicadoRelacionado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getRequiereRespuesta() {
        return requiereRespuesta;
    }

    public void setRequiereRespuesta(String requiereRespuesta) {
        this.requiereRespuesta = requiereRespuesta;
    }

    public String getTipoComunicacion() {
        return tipoComunicacion;
    }

    public void setTipoComunicacion(String tipoComunicacion) {
        this.tipoComunicacion = tipoComunicacion;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
