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
@NamedQueries({ @NamedQuery(name = "SgdRemitente.findAll", query = "select o from SgdRemitente o"),
                @NamedQuery(name = "SgdRemitente.findByIdName",
                            query =
                            "select o from SgdRemitente o where lower(o.nombreCompleto) like :nombre and lower(o.noIdentificacion) like :id order by o.nombreCompleto asc")
    })
@Table(name = "SGD_REMITENTE")
public class SgdRemitente implements Serializable {
    @SuppressWarnings("compatibility:3055226622659022595")
    private static final long serialVersionUID = 1L;
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
    private Long idDepartamento;
    @Column(name = "ID_ETNIA")
    private Long idEtnia;
    @Column(name = "ID_MUNICIPIO")
    private Long idMunicipio;
    @Column(name = "ID_PAIS", nullable = false)
    private Long idPais;
    @Column(name = "ID_POBLACION_VULNERABLE")
    private Long idPoblacionVulnerable;
    @Column(name = "ID_RANGO_EDAD")
    private Long idRangoEdad;
    @Column(name = "ID_TIPO_IDENTIFICACION", nullable = false)
    private Integer idTipoIdentificacion;
    @Column(name = "NOMBRE_COMPLETO", nullable = false, length = 50)
    private String nombreCompleto;
    @Id
    @Column(name = "NO_IDENTIFICACION", nullable = false)
    private String noIdentificacion;
    @Column(length = 20)
    private String telefono;
    @Column(length = 20)
    private String titulo;
    @Column(name = "USUARIO_ACTUALIZACION", length = 20)
    private String usuarioActualizacion;
    @Column(name = "USUARIO_CREACION", length = 20)
    private String usuarioCreacion;
    @Column(name = "NIT_ENTIDAD")
    private Long nitEntidad;
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;

    public SgdRemitente() {
    }

    public SgdRemitente(String cargo, String celular, String direccion, String email, Date fechaActualizacion,
                        Date fechaCreacion, Long idDepartamento, Long idEtnia, Long idMunicipio,
                        Long idPais, Long idPoblacionVulnerable, Long idRangoEdad,
                        Integer idTipoIdentificacion, Long nitEntidad, String noIdentificacion,
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

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Long getIdEtnia() {
        return idEtnia;
    }

    public void setIdEtnia(Long idEtnia) {
        this.idEtnia = idEtnia;
    }

    public Long getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Long idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public Long getIdPoblacionVulnerable() {
        return idPoblacionVulnerable;
    }

    public void setIdPoblacionVulnerable(Long idPoblacionVulnerable) {
        this.idPoblacionVulnerable = idPoblacionVulnerable;
    }

    public Long getIdRangoEdad() {
        return idRangoEdad;
    }

    public void setIdRangoEdad(Long idRangoEdad) {
        this.idRangoEdad = idRangoEdad;
    }

    public Integer getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(String noIdentificacion) {
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


    public void setNitEntidad(Long nitEntidad) {
        this.nitEntidad = nitEntidad;
    }

    public Long getNitEntidad() {
        return nitEntidad;
    }


    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
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
