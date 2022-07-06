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
@NamedQueries({ @NamedQuery(name = "SgdTipoTitulo.findAll", query = "select o from SgdTipoTitulo o") })
@Table(name = "SGD_TIPO_TITULO")
public class SgdTipoTitulo implements Serializable {
    private static final long serialVersionUID = -4592819944207274512L;
    @Column(length = 50)
    private String codigo;
    @Column(length = 200)
    private String descripcion;
    @Id
    @Column(name = "ID_TIPO_TITULO", nullable = false)
    private Integer idTipoTitulo;
    @Column(nullable = false, length = 50)
    private String nombre;

    public SgdTipoTitulo() {
    }

    public SgdTipoTitulo(String codigo, String descripcion, Integer idTipoTitulo, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idTipoTitulo = idTipoTitulo;
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

    public Integer getIdTipoTitulo() {
        return idTipoTitulo;
    }

    public void setIdTipoTitulo(Integer idTipoTitulo) {
        this.idTipoTitulo = idTipoTitulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
