package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "SgdEntidad.findAll", query = "select o from SgdEntidad o"),
                @NamedQuery(name = "SgdEntidad.findByNameNit", query = "select o from SgdEntidad o where o.idEntidad = :nit or lower(o.nombre) like :nombre order by o.nombre asc"),
                @NamedQuery(name = "SgdEntidad.findById", query = "select o from SgdEntidad o where o.idEntidad = :id")})
@Table(name = "SGD_ENTIDAD")
public class SgdEntidad implements Serializable {
    private static final long serialVersionUID = -5647801916819121870L;
    
    @Id
    @Column(name = "ID_ENTIDAD", nullable = false)
    private Long idEntidad;
    @Column(name = "APARTADO_AEREO", length = 20)
    private String apartadoAereo;
    @Column(length = 50)
    private String codigo;
    @Column(length = 200)
    private String descripcion;
    @Column(length = 20)
    private String direccion;
    @Column(nullable = false, length = 20)
    private String email;
    @Column(length = 20)
    private String fax;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTUALIZACION")
    private Date fechaActualizacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Column(name = "ID_DEPARTAMENTO")
    private Long idDepartamento;
    @Column(name = "ID_MUNICIPIO")
    private Long idMunicipio;
    @Column(name = "ID_PAIS", nullable = false)
    private Long idPais;
    @Column(name = "ID_TIPO_EMPRESA", nullable = false)
    private Long idTipoEmpresa;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(length = 20)
    private String oficina;
    @Column(length = 20)
    private String telefono;
    @Column(name = "USUARIO_ACTUALIZACION", length = 20)
    private String usuarioActualizacion;
    @Column(name = "USUARIO_CREACION", length = 20)
    private String usuarioCreacion;
    @Column(length = 20)
    private String website;


    public SgdEntidad() {
    }

    public SgdEntidad(String apartadoAereo, String codigo, String descripcion, String direccion, String email,
                      String fax, Date fechaActualizacion, Date fechaCreacion, Long idDepartamento,
                      Long idEntidad, Long idMunicipio, Long idPais, Long idTipoEmpresa,
                      String nombre, String oficina, String telefono, String usuarioActualizacion,
                      String usuarioCreacion, String website) {
        this.apartadoAereo = apartadoAereo;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.email = email;
        this.fax = fax;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.idDepartamento = idDepartamento;
        this.idEntidad = idEntidad;
        this.idMunicipio = idMunicipio;
        this.idPais = idPais;
        this.idTipoEmpresa = idTipoEmpresa;
        this.nombre = nombre;
        this.oficina = oficina;
        this.telefono = telefono;
        this.usuarioActualizacion = usuarioActualizacion;
        this.usuarioCreacion = usuarioCreacion;
        this.website = website;
    }


    public String getApartadoAereo() {
        return apartadoAereo;
    }

    public void setApartadoAereo(String apartadoAereo) {
        this.apartadoAereo = apartadoAereo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public Long getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(Long idEntidad) {
        this.idEntidad = idEntidad;
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

    public Long getIdTipoEmpresa() {
        return idTipoEmpresa;
    }

    public void setIdTipoEmpresa(Long idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("apartadoAereo=");
        buffer.append(getApartadoAereo());
        buffer.append(',');
        buffer.append("codigo=");
        buffer.append(getCodigo());
        buffer.append(',');
        buffer.append("descripcion=");
        buffer.append(getDescripcion());
        buffer.append(',');
        buffer.append("direccion=");
        buffer.append(getDireccion());
        buffer.append(',');
        buffer.append("email=");
        buffer.append(getEmail());
        buffer.append(',');
        buffer.append("fax=");
        buffer.append(getFax());
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
        buffer.append("idEntidad=");
        buffer.append(getIdEntidad());
        buffer.append(',');
        buffer.append("idMunicipio=");
        buffer.append(getIdMunicipio());
        buffer.append(',');
        buffer.append("idPais=");
        buffer.append(getIdPais());
        buffer.append(',');
        buffer.append("idTipoEmpresa=");
        buffer.append(getIdTipoEmpresa());
        buffer.append(',');
        buffer.append("nombre=");
        buffer.append(getNombre());
        buffer.append(',');
        buffer.append("oficina=");
        buffer.append(getOficina());
        buffer.append(',');
        buffer.append("telefono=");
        buffer.append(getTelefono());
        buffer.append(',');
        buffer.append("usuarioActualizacion=");
        buffer.append(getUsuarioActualizacion());
        buffer.append(',');
        buffer.append("usuarioCreacion=");
        buffer.append(getUsuarioCreacion());
        buffer.append(',');
        buffer.append("website=");
        buffer.append(getWebsite());
        buffer.append(']');
        return buffer.toString();
    }
}
