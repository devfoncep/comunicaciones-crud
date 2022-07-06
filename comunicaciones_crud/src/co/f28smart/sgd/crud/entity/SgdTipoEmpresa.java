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
@NamedQueries({ @NamedQuery(name = "SgdTipoEmpresa.findAll", query = "select o from SgdTipoEmpresa o") })
@Table(name = "SGD_TIPO_EMPRESA")
public class SgdTipoEmpresa implements Serializable {
    private static final long serialVersionUID = -5140241388884750262L;
    @Column(length = 50)
    private String codigo;
    @Column(length = 200)
    private String descripcion;
    @Id
    @Column(name = "ID_TIPO_EMPRESA", nullable = false)
    private Integer idTipoEmpresa;
    @Column(nullable = false, length = 50)
    private String nombre;

    public SgdTipoEmpresa() {
    }

    public SgdTipoEmpresa(String codigo, String descripcion, Integer idTipoEmpresa, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idTipoEmpresa = idTipoEmpresa;
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

    public Integer getIdTipoEmpresa() {
        return idTipoEmpresa;
    }

    public void setIdTipoEmpresa(Integer idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
