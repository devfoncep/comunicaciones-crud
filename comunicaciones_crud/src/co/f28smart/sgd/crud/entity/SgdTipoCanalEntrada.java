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
@NamedQueries({ @NamedQuery(name = "SgdTipoCanalEntrada.findAll", 
                            query = "select o from SgdTipoCanalEntrada o where o.activo = 1 order by o.nombre asc"),
                @NamedQuery(name = "SgdTipoCanalEntrada.findByCodigoTipoComEntrada", 
                            query = "select o from SgdTipoCanalEntrada o inner join SgdTipoComEntrada t on o.idTipoComEntrada = t.idTipoComEntrada where o.activo = 1 and t.codigo = :codigo order by o.nombre asc")})
@Table(name = "SGD_TIPO_CANAL_ENTRADA")
public class SgdTipoCanalEntrada implements Serializable {
    @SuppressWarnings("compatibility:3931720870310371178")
    private static final long serialVersionUID = 1L;
    @Column(nullable = false)
    private Integer activo;
    @Id
    @Column(name = "ID_TIPO_CANAL_ENTRADA", nullable = false)
    private Integer idTipoCanalEntrada;
    @Column(name = "ID_TIPO_COM_ENTRADA", nullable = false)
    private Integer idTipoComEntrada;
    @Column(nullable = false, length = 50)
    private String nombre;

    public SgdTipoCanalEntrada() {
    }

    public SgdTipoCanalEntrada(Integer activo, Integer idTipoCanalEntrada, Integer idTipoComEntrada,
                               String nombre) {
        this.activo = activo;
        this.idTipoCanalEntrada = idTipoCanalEntrada;
        this.idTipoComEntrada = idTipoComEntrada;
        this.nombre = nombre;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getIdTipoCanalEntrada() {
        return idTipoCanalEntrada;
    }

    public void setIdTipoCanalEntrada(Integer idTipoCanalEntrada) {
        this.idTipoCanalEntrada = idTipoCanalEntrada;
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
