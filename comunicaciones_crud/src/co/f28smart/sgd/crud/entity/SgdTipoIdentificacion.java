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
@NamedQueries({ @NamedQuery(name = "SgdTipoIdentificacion.findAll", query = "select o from SgdTipoIdentificacion o") })
@Table(name = "SGD_TIPO_IDENTIFICACION")
public class SgdTipoIdentificacion implements Serializable {
    private static final long serialVersionUID = 6714023058132846863L;
    @Column(nullable = false, length = 20)
    private String codigo;
    @Id
    @Column(name = "ID_TIPO_IDENTIFICACION", nullable = false)
    private Integer idTipoIdentificacion;
    @Column(nullable = false, length = 200)
    private String nombre;

    public SgdTipoIdentificacion() {
    }

    public SgdTipoIdentificacion(String codigo, Integer idTipoIdentificacion, String nombre) {
        this.codigo = codigo;
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
