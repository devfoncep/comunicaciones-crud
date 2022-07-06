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
@NamedQueries({ @NamedQuery(name = "SgdAccionRespuesta.findAll", query = "select o from SgdAccionRespuesta o") })
@Table(name = "SGD_ACCION_RESPUESTA")
public class SgdAccionRespuesta implements Serializable {
    private static final long serialVersionUID = 3735286363225120083L;
    @Column(length = 50)
    private String codigo;
    @Column(length = 200)
    private String descripcion;
    @Id
    @Column(name = "ID_ACCION_RESPUESTA", nullable = false)
    private Integer idAccionRespuesta;
    @Column(nullable = false, length = 50)
    private String nombre;

    public SgdAccionRespuesta() {
    }

    public SgdAccionRespuesta(String codigo, String descripcion, Integer idAccionRespuesta, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idAccionRespuesta = idAccionRespuesta;
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

    public Integer getIdAccionRespuesta() {
        return idAccionRespuesta;
    }

    public void setIdAccionRespuesta(Integer idAccionRespuesta) {
        this.idAccionRespuesta = idAccionRespuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
