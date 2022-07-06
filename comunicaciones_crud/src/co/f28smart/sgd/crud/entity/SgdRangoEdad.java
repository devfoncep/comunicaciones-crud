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
@NamedQueries({ @NamedQuery(name = "SgdRangoEdad.findAll", query = "select o from SgdRangoEdad o") })
@Table(name = "SGD_RANGO_EDAD")
public class SgdRangoEdad implements Serializable {
    private static final long serialVersionUID = 7445178815216376570L;
    @Column(length = 20)
    private String codigo;
    @Column(nullable = false, length = 50)
    private String descripcion;
    @Id
    @Column(name = "ID_RANGO_EDAD", nullable = false)
    private Integer idRangoEdad;

    public SgdRangoEdad() {
    }

    public SgdRangoEdad(String codigo, String descripcion, Integer idRangoEdad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idRangoEdad = idRangoEdad;
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

    public Integer getIdRangoEdad() {
        return idRangoEdad;
    }

    public void setIdRangoEdad(Integer idRangoEdad) {
        this.idRangoEdad = idRangoEdad;
    }
}
