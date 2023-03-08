package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "SgdTipoComEntrada.findAll", query = "select o from SgdTipoComEntrada o where o.activo = 1 order by o.nombre asc") })
@Table(name = "SGD_TIPO_COM_ENTRADA")
public class SgdTipoComEntrada implements Serializable {
    @SuppressWarnings("compatibility:1580779620278104788")
    private static final long serialVersionUID = 1L;
    @Column(nullable = false)
    private Integer activo;
    @Column(length = 20)
    private String codigo;
    @Id
    @Column(name = "ID_TIPO_COM_ENTRADA", nullable = false)
    private Integer idTipoComEntrada;
    @Column(nullable = false, length = 50)
    private String nombre;

    public SgdTipoComEntrada() {
    }

    public SgdTipoComEntrada(Integer activo, String codigo, Integer idTipoComEntrada, String nombre) {
        this.activo = activo;
        this.codigo = codigo;
        this.idTipoComEntrada = idTipoComEntrada;
        this.nombre = nombre;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getIdTipoComEntrada() {
        return idTipoComEntrada;
    }

    public void setIdTipoComEntrada(Integer idTipoComEntrada) {
        this.idTipoComEntrada = idTipoComEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
