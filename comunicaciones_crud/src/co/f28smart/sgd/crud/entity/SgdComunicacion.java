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
@NamedQueries({ @NamedQuery(name = "SgdComunicacion.findAll", query = "select o from SgdComunicacion o") })
@Table(name = "SGD_COMUNICACION")
public class SgdComunicacion implements Serializable {
    private static final long serialVersionUID = -7471303998889146198L;
    @Column(name = "ACCESO_NEGADO", length = 2)
    private String accesoNegado;
    @Column(length = 10)
    private String appname;
    @Column(nullable = false, length = 510)
    private String asunto;
    @Column(name = "COD_SERIE", length = 20)
    private String codSerie;
    @Column(name = "COD_SUBSERIE", length = 50)
    private String codSubserie;
    @Column(length = 300)
    private String comentarios;
    @Column(name = "CONTENT_FLD_COMUNICACIONES", length = 200)
    private String contentFldComunicaciones;
    @Column(name = "CONTENT_FLD_OTRO", length = 200)
    private String contentFldOtro;
    @Column(name = "CONTENT_FLD_TITULO", length = 200)
    private String contentFldTitulo;
    @Column(name = "DIAS_PARA_RESPUESTA")
    private Integer diasParaRespuesta;
    @Column(name = "ESTADO_COMUNICACION", length = 100)
    private String estadoComunicacion;
    @Column(name = "ES_PQRS", length = 2)
    private String esPqrs;
    @Column(name = "ES_TITULO", nullable = false, length = 1)
    private String esTitulo;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTUALIZACION")
    private Date fechaActualizacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_VENCIMIENTO")
    private Date fechaVencimiento;
    @Column(name = "GRUPO_SEGURIDAD", length = 100)
    private String grupoSeguridad;
    @Column(name = "IDENTIF_RESERVADA", length = 2)
    private String identifReservada;
    @Id
    @Column(name = "ID_COMUNICACION")
    private BigDecimal idComunicacion;
    @Column(name = "ID_DEPENDENCIA_DESTINO")
    private Integer idDependenciaDestino;
    @Column(name = "ID_SUB_CATEGORIA")
    private BigDecimal idSubCategoria;
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
    @Column(name = "NOMBRE_SERIE", length = 200)
    private String nombreSerie;
    @Column(name = "NOMBRE_SUBSERIE", length = 200)
    private String nombreSubserie;
    @Column(name = "NOMBRE_TP_DOC", length = 200)
    private String nombreTpDoc;
    @Column(name = "NRO_ANEXOS", nullable = false)
    private Integer nroAnexos;
    @Column(name = "NRO_FOLIOS", nullable = false)
    private Integer nroFolios;
    @Column(name = "NRO_PLACA", length = 100)
    private String nroPlaca;
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
    @Column(name = "TRASLADO_OTRA_ENTIDAD", length = 2)
    private String trasladoOtraEntidad;
    @Column(name = "USUARIO_ACTUALIZACION", length = 100)
    private String usuarioActualizacion;
    @Column(name = "USUARIO_CREACION", nullable = false, length = 100)
    private String usuarioCreacion;

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
        this.accesoNegado = accesoNegado;
        this.appname = appname;
        this.asunto = asunto;
        this.codSerie = codSerie;
        this.codSubserie = codSubserie;
        this.comentarios = comentarios;
        this.contentFldComunicaciones = contentFldComunicaciones;
        this.contentFldOtro = contentFldOtro;
        this.contentFldTitulo = contentFldTitulo;
        this.diasParaRespuesta = diasParaRespuesta;
        this.esPqrs = esPqrs;
        this.esTitulo = esTitulo;
        this.estadoComunicacion = estadoComunicacion;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
        this.grupoSeguridad = grupoSeguridad;
        this.idComunicacion = idComunicacion;
        this.idDependenciaDestino = idDependenciaDestino;
        this.idSubCategoria = idSubCategoria;
        this.idTipoDocumentalTramite = idTipoDocumentalTramite;
        this.idTipoSolicitud = idTipoSolicitud;
        this.idTramite = idTramite;
        this.idUnidadProductora = idUnidadProductora;
        this.identifReservada = identifReservada;
        this.instanceNumber = instanceNumber;
        this.medioRespuesta = medioRespuesta;
        this.nombreSerie = nombreSerie;
        this.nombreSubserie = nombreSubserie;
        this.nombreTpDoc = nombreTpDoc;
        this.nroAnexos = nroAnexos;
        this.nroFolios = nroFolios;
        this.nroPlaca = nroPlaca;
        this.nroRadicado = nroRadicado;
        this.nroRadicadoRelacionado = nroRadicadoRelacionado;
        this.referencia = referencia;
        this.requiereRespuesta = requiereRespuesta;
        this.tipoComunicacion = tipoComunicacion;
        this.tramite = tramite;
        this.trasladoOtraEntidad = trasladoOtraEntidad;
        this.usuarioActualizacion = usuarioActualizacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getAccesoNegado() {
        return accesoNegado;
    }

    public void setAccesoNegado(String accesoNegado) {
        this.accesoNegado = accesoNegado;
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

    public String getCodSerie() {
        return codSerie;
    }

    public void setCodSerie(String codSerie) {
        this.codSerie = codSerie;
    }

    public String getCodSubserie() {
        return codSubserie;
    }

    public void setCodSubserie(String codSubserie) {
        this.codSubserie = codSubserie;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getContentFldComunicaciones() {
        return contentFldComunicaciones;
    }

    public void setContentFldComunicaciones(String contentFldComunicaciones) {
        this.contentFldComunicaciones = contentFldComunicaciones;
    }

    public String getContentFldOtro() {
        return contentFldOtro;
    }

    public void setContentFldOtro(String contentFldOtro) {
        this.contentFldOtro = contentFldOtro;
    }

    public String getContentFldTitulo() {
        return contentFldTitulo;
    }

    public void setContentFldTitulo(String contentFldTitulo) {
        this.contentFldTitulo = contentFldTitulo;
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

    public String getEsTitulo() {
        return esTitulo;
    }

    public void setEsTitulo(String esTitulo) {
        this.esTitulo = esTitulo;
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

    public String getGrupoSeguridad() {
        return grupoSeguridad;
    }

    public void setGrupoSeguridad(String grupoSeguridad) {
        this.grupoSeguridad = grupoSeguridad;
    }

    public String getIdentifReservada() {
        return identifReservada;
    }

    public void setIdentifReservada(String identifReservada) {
        this.identifReservada = identifReservada;
    }

    public BigDecimal getIdComunicacion() {
        return idComunicacion;
    }

    public void setIdComunicacion(BigDecimal idComunicacion) {
        this.idComunicacion = idComunicacion;
    }

    public Integer getIdDependenciaDestino() {
        return idDependenciaDestino;
    }

    public void setIdDependenciaDestino(Integer idDependenciaDestino) {
        this.idDependenciaDestino = idDependenciaDestino;
    }

    public BigDecimal getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(BigDecimal idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
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

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public String getNombreSubserie() {
        return nombreSubserie;
    }

    public void setNombreSubserie(String nombreSubserie) {
        this.nombreSubserie = nombreSubserie;
    }

    public String getNombreTpDoc() {
        return nombreTpDoc;
    }

    public void setNombreTpDoc(String nombreTpDoc) {
        this.nombreTpDoc = nombreTpDoc;
    }

    public Integer getNroAnexos() {
        return nroAnexos;
    }

    public void setNroAnexos(Integer nroAnexos) {
        this.nroAnexos = nroAnexos;
    }

    public Integer getNroFolios() {
        return nroFolios;
    }

    public void setNroFolios(Integer nroFolios) {
        this.nroFolios = nroFolios;
    }

    public String getNroPlaca() {
        return nroPlaca;
    }

    public void setNroPlaca(String nroPlaca) {
        this.nroPlaca = nroPlaca;
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

    public String getTrasladoOtraEntidad() {
        return trasladoOtraEntidad;
    }

    public void setTrasladoOtraEntidad(String trasladoOtraEntidad) {
        this.trasladoOtraEntidad = trasladoOtraEntidad;
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
