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
@NamedQueries({ @NamedQuery(name = "SgdTipoAnexoFisico.findAll", query = "select o from SgdTipoAnexoFisico o") })
@Table(name = "SGD_TIPO_ANEXO_FISICO")
public class SgdTipoAnexoFisico implements Serializable {
    @SuppressWarnings("compatibility:2533630326169304756")
    private static final long serialVersionUID = -7372775295951483034L;
    
    @Id
    @Column(name = "ID_TIPO_ANEXO_FISICO", nullable = false)
    private Integer idTipoAnexoFisico;
    @Column(nullable = false, length = 30)
    private String nombre;
    @Column(length = 50)
    private String codigo;
    @Column(length = 200)
    private String descripcion;

    public SgdTipoAnexoFisico() {
    }

    public SgdTipoAnexoFisico(String codigo, String descripcion, Integer idTipoAnexoFisico, String nombre) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idTipoAnexoFisico = idTipoAnexoFisico;
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

    public Integer getIdTipoAnexoFisico() {
        return idTipoAnexoFisico;
    }

    public void setIdTipoAnexoFisico(Integer idTipoAnexoFisico) {
        this.idTipoAnexoFisico = idTipoAnexoFisico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
