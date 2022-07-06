package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@NamedQueries({ @NamedQuery(name = "SgdRemitente.findAll", query = "select o from SgdRemitente o"),
                @NamedQuery(name = "SgdRemitente.findByIdNameNit",
                            query =
                            "select o from SgdRemitente o where lower(o.nombreCompleto) like :nombre or o.noIdentificacion = :id or o.nitEntidad = :nit order by o.nombreCompleto asc")
    })
@Table(name = "SGD_REMITENTE")
public class SgdRemitente implements Serializable {
    private static final long serialVersionUID = 4513687236400617391L;
    @Column(length = 20)
    private String cargo;
    @Column(length = 20)
    private String celular;
    @Column(nullable = false, length = 50)
    private String direccion;
    @Column(nullable = false, length = 50)
    private String email;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTUALIZACION")
    private Date fechaActualizacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Column(name = "ID_DEPARTAMENTO")
    private BigDecimal idDepartamento;
    @Column(name = "ID_ETNIA")
    private BigDecimal idEtnia;
    @Column(name = "ID_MUNICIPIO")
    private BigDecimal idMunicipio;
    @Column(name = "ID_PAIS", nullable = false)
    private BigDecimal idPais;
    @Column(name = "ID_POBLACION_VULNERABLE")
    private BigDecimal idPoblacionVulnerable;
    @Column(name = "ID_RANGO_EDAD")
    private BigDecimal idRangoEdad;
    @Column(name = "ID_TIPO_IDENTIFICACION", nullable = false)
    private BigDecimal idTipoIdentificacion;
    @Column(name = "NOMBRE_COMPLETO", nullable = false, length = 50)
    private String nombreCompleto;
    @Id
    @Column(name = "NO_IDENTIFICACION", nullable = false)
    private BigDecimal noIdentificacion;
    @Column(length = 20)
    private String telefono;
    @Column(length = 20)
    private String titulo;
    @Column(name = "USUARIO_ACTUALIZACION", length = 20)
    private String usuarioActualizacion;
    @Column(name = "USUARIO_CREACION", length = 20)
    private String usuarioCreacion;
    @Column(name = "NIT_ENTIDAD")
    private BigDecimal nitEntidad;

    public SgdRemitente() {
    }

    public SgdRemitente(String cargo, String celular, String direccion, String email, Date fechaActualizacion,
                        Date fechaCreacion, BigDecimal idDepartamento, BigDecimal idEtnia, BigDecimal idMunicipio,
                        BigDecimal idPais, BigDecimal idPoblacionVulnerable, BigDecimal idRangoEdad,
                        BigDecimal idTipoIdentificacion, BigDecimal nitEntidad, BigDecimal noIdentificacion,
                        String nombreCompleto, String telefono, String titulo, String usuarioActualizacion,
                        String usuarioCreacion) {
        this.cargo = cargo;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.idDepartamento = idDepartamento;
        this.idEtnia = idEtnia;
        this.idMunicipio = idMunicipio;
        this.idPais = idPais;
        this.idPoblacionVulnerable = idPoblacionVulnerable;
        this.idRangoEdad = idRangoEdad;
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.nitEntidad = nitEntidad;
        this.noIdentificacion = noIdentificacion;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.titulo = titulo;
        this.usuarioActualizacion = usuarioActualizacion;
        this.usuarioCreacion = usuarioCreacion;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public BigDecimal getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(BigDecimal idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public BigDecimal getIdEtnia() {
        return idEtnia;
    }

    public void setIdEtnia(BigDecimal idEtnia) {
        this.idEtnia = idEtnia;
    }

    public BigDecimal getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(BigDecimal idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public BigDecimal getIdPais() {
        return idPais;
    }

    public void setIdPais(BigDecimal idPais) {
        this.idPais = idPais;
    }

    public BigDecimal getIdPoblacionVulnerable() {
        return idPoblacionVulnerable;
    }

    public void setIdPoblacionVulnerable(BigDecimal idPoblacionVulnerable) {
        this.idPoblacionVulnerable = idPoblacionVulnerable;
    }

    public BigDecimal getIdRangoEdad() {
        return idRangoEdad;
    }

    public void setIdRangoEdad(BigDecimal idRangoEdad) {
        this.idRangoEdad = idRangoEdad;
    }

    public BigDecimal getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(BigDecimal idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public BigDecimal getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(BigDecimal noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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


    public void setNitEntidad(BigDecimal nitEntidad) {
        this.nitEntidad = nitEntidad;
    }

    public BigDecimal getNitEntidad() {
        return nitEntidad;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("cargo=");
        buffer.append(getCargo());
        buffer.append(',');
        buffer.append("celular=");
        buffer.append(getCelular());
        buffer.append(',');
        buffer.append("direccion=");
        buffer.append(getDireccion());
        buffer.append(',');
        buffer.append("email=");
        buffer.append(getEmail());
        buffer.append(',');
        buffer.append("fechaActualizacion=");
        buffer.append(getFechaActualizacion());
        buffer.append(',');
        buffer.append("fechaCreacion=");
        buffer.append(getFechaCreacion());
        buffer.append(',');
        buffer.append("idDepartamento=");
        buffer.append(getIdDepartamento());
        buffer.append(',');
        buffer.append("idEtnia=");
        buffer.append(getIdEtnia());
        buffer.append(',');
        buffer.append("idMunicipio=");
        buffer.append(getIdMunicipio());
        buffer.append(',');
        buffer.append("idPais=");
        buffer.append(getIdPais());
        buffer.append(',');
        buffer.append("idPoblacionVulnerable=");
        buffer.append(getIdPoblacionVulnerable());
        buffer.append(',');
        buffer.append("idRangoEdad=");
        buffer.append(getIdRangoEdad());
        buffer.append(',');
        buffer.append("idTipoIdentificacion=");
        buffer.append(getIdTipoIdentificacion());
        buffer.append(',');
        buffer.append("noIdentificacion=");
        buffer.append(getNoIdentificacion());
        buffer.append(',');
        buffer.append("nombreCompleto=");
        buffer.append(getNombreCompleto());
        buffer.append(',');
        buffer.append("telefono=");
        buffer.append(getTelefono());
        buffer.append(',');
        buffer.append("titulo=");
        buffer.append(getTitulo());
        buffer.append(',');
        buffer.append("usuarioActualizacion=");
        buffer.append(getUsuarioActualizacion());
        buffer.append(',');
        buffer.append("usuarioCreacion=");
        buffer.append(getUsuarioCreacion());
        buffer.append(']');
        return buffer.toString();
    }
}
