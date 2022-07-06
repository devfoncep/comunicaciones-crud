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
@NamedQueries({ @NamedQuery(name = "SgdTipoEnvio.findAll", query = "select o from SgdTipoEnvio o") })
@Table(name = "SGD_TIPO_ENVIO")
public class SgdTipoEnvio implements Serializable {
    private static final long serialVersionUID = 5418651374264245187L;
    @Column(length = 50)
    private String codigo;
    @Column(length = 200)
    private String descripcion;
    @Id
    @Column(name = "ID_TIPO_ENVIO", nullable = false)
    private Integer idTipoEnvio;
    @Column(nullable = false, length = 50)
    private String nombre;

    public SgdTipoEnvio() {
    }

    public SgdTipoEnvio(String codigo, String descripcion, Integer idTipoEnvio, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idTipoEnvio = idTipoEnvio;
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

    public Integer getIdTipoEnvio() {
        return idTipoEnvio;
    }

    public void setIdTipoEnvio(Integer idTipoEnvio) {
        this.idTipoEnvio = idTipoEnvio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
