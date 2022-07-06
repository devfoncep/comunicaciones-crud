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
@NamedQueries({ @NamedQuery(name = "SgdCategoriaTipo.findAll", query = "select o from SgdCategoriaTipo o") })
@Table(name = "SGD_CATEGORIA_TIPO")
public class SgdCategoriaTipo implements Serializable {
    private static final long serialVersionUID = 1547707930557920827L;
    @Id
    @Column(name = "ID_CATEGORIA_TIPO", nullable = false)
    private BigDecimal idCategoriaTipo;
    @Column(name = "ID_SUB_CATEGORIA", nullable = false, unique = true)
    private BigDecimal idSubCategoria;
    @Column(name = "ID_TIPO_SOLICITUD", nullable = false, unique = true)
    private BigDecimal idTipoSolicitud;

    public SgdCategoriaTipo() {
    }

    public SgdCategoriaTipo(BigDecimal idCategoriaTipo, BigDecimal idSubCategoria, BigDecimal idTipoSolicitud) {
        this.idCategoriaTipo = idCategoriaTipo;
        this.idSubCategoria = idSubCategoria;
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public BigDecimal getIdCategoriaTipo() {
        return idCategoriaTipo;
    }

    public void setIdCategoriaTipo(BigDecimal idCategoriaTipo) {
        this.idCategoriaTipo = idCategoriaTipo;
    }

    public BigDecimal getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(BigDecimal idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    public BigDecimal getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(BigDecimal idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }
}
