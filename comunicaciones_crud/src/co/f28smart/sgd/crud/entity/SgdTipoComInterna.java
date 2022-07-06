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
@NamedQueries({ @NamedQuery(name = "SgdTipoComInterna.findAll", query = "select o from SgdTipoComInterna o") })
@Table(name = "SGD_TIPO_COM_INTERNA")
public class SgdTipoComInterna implements Serializable {
    private static final long serialVersionUID = -1158138414914659361L;
    @Column(length = 50)
    private String codigo;
    @Column(length = 200)
    private String descripcion;
    @Id
    @Column(name = "ID_TIPO_COM_INTERNA", nullable = false)
    private Integer idTipoComInterna;
    @Column(length = 50)
    private String nombre;

    public SgdTipoComInterna() {
    }

    public SgdTipoComInterna(String codigo, String descripcion, Integer idTipoComInterna, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idTipoComInterna = idTipoComInterna;
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

    public Integer getIdTipoComInterna() {
        return idTipoComInterna;
    }

    public void setIdTipoComInterna(Integer idTipoComInterna) {
        this.idTipoComInterna = idTipoComInterna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
