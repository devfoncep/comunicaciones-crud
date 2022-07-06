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
@NamedQueries({ @NamedQuery(name = "SgdComunicacionesView.findAll", query = "select o from SgdComunicacionesView o") })
@Table(name = "SGD_COMUNICACIONES_VIEW")
public class SgdComunicacionesView implements Serializable {
    private static final long serialVersionUID = -5649354820755721053L;
    @Column(length = 10)
    private String appname;
    @Column(length = 510)
    private String asunto;
    @Column(length = 20)
    private String celular;
    @Column(length = 50)
    private String departamento;
    @Column(length = 200)
    private String direccion;
    @Column(length = 200)
    private String email;
    @Column(length = 50)
    private String etnia;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Column(name = "MEDIO_RESPUESTA", length = 100)
    private String medioRespuesta;
    @Column(length = 50)
    private String municipio;
    @Id
    @Column(name = "NRO_RADICADO", length = 100)
    private String nroRadicado;
    @Id
    @Column(name = "NUMERO_IDENTIFICACION", length = 20)
    private String numeroIdentificacion;
    @Column(length = 100)
    private String ocupacion;
    @Column(length = 80)
    private String pais;
    @Column(name = "POBLACION_VULNERABLE", length = 50)
    private String poblacionVulnerable;
    @Column(name = "PRIMER_APELLIDO", length = 101)
    private String primerApellido;
    @Column(name = "PRIMER_NOMBRE", length = 104)
    private String primerNombre;
    @Column(name = "RANGO_EDAD", length = 50)
    private String rangoEdad;
    @Column(name = "SEGUNDO_APELLIDO", length = 100)
    private String segundoApellido;
    @Column(name = "SEGUNDO_NOMBRE", length = 100)
    private String segundoNombre;
    @Column(length = 200)
    private String subcategoria;
    @Column(length = 21)
    private String telefono;
    @Column(name = "TIPO_COMUNICACION", length = 100)
    private String tipoComunicacion;
    @Column(name = "TIPO_SOLICITUD", length = 50)
    private String tipoSolicitud;

    public SgdComunicacionesView() {
    }

    public SgdComunicacionesView(String appname, String asunto, String celular, String departamento, String direccion,
                                 String email, String etnia, Date fechaCreacion, String medioRespuesta,
                                 String municipio, String nroRadicado, String numeroIdentificacion, String ocupacion,
                                 String pais, String poblacionVulnerable, String primerApellido, String primerNombre,
                                 String rangoEdad, String segundoApellido, String segundoNombre, String subcategoria,
                                 String telefono, String tipoComunicacion, String tipoSolicitud) {
        this.appname = appname;
        this.asunto = asunto;
        this.celular = celular;
        this.departamento = departamento;
        this.direccion = direccion;
        this.email = email;
        this.etnia = etnia;
        this.fechaCreacion = fechaCreacion;
        this.medioRespuesta = medioRespuesta;
        this.municipio = municipio;
        this.nroRadicado = nroRadicado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.ocupacion = ocupacion;
        this.pais = pais;
        this.poblacionVulnerable = poblacionVulnerable;
        this.primerApellido = primerApellido;
        this.primerNombre = primerNombre;
        this.rangoEdad = rangoEdad;
        this.segundoApellido = segundoApellido;
        this.segundoNombre = segundoNombre;
        this.subcategoria = subcategoria;
        this.telefono = telefono;
        this.tipoComunicacion = tipoComunicacion;
        this.tipoSolicitud = tipoSolicitud;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMedioRespuesta() {
        return medioRespuesta;
    }

    public void setMedioRespuesta(String medioRespuesta) {
        this.medioRespuesta = medioRespuesta;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNroRadicado() {
        return nroRadicado;
    }

    public void setNroRadicado(String nroRadicado) {
        this.nroRadicado = nroRadicado;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPoblacionVulnerable() {
        return poblacionVulnerable;
    }

    public void setPoblacionVulnerable(String poblacionVulnerable) {
        this.poblacionVulnerable = poblacionVulnerable;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoComunicacion() {
        return tipoComunicacion;
    }

    public void setTipoComunicacion(String tipoComunicacion) {
        this.tipoComunicacion = tipoComunicacion;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }
}
