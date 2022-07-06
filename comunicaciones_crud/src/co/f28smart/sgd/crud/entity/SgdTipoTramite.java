package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Cacheable(false)
@NamedQueries({ @NamedQuery(name = "SgdTipoTramite.findAll", query = "select o from SgdTipoTramite o") })
@Table(name = "SGD_TIPO_TRAMITE")
public class SgdTipoTramite implements Serializable {
    @SuppressWarnings("compatibility:7570316146848990074")
    private static final long serialVersionUID = -1341718912957311109L;
    @Column(length = 50)
    private String codigo;
    @Column(length = 200)
    private String descripcion;
    @Id
    @Column(name = "ID_TIPO_TRAMITE", nullable = false)
    private Integer idTipoTramite;
    @Column(nullable = false, length = 50)
    private String nombre;

    public SgdTipoTramite() {
    }

    public SgdTipoTramite(String codigo, String descripcion, Integer idTipoTramite, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idTipoTramite = idTipoTramite;
        this.nombre = nombre;
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

    public Integer getIdTipoTramite() {
        return idTipoTramite;
    }

    public void setIdTipoTramite(Integer idTipoTramite) {
        this.idTipoTramite = idTipoTramite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
