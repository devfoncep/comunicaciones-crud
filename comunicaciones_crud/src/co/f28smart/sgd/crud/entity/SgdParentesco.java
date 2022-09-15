package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Cacheable(false)
@NamedQueries({ @NamedQuery(name = "SgdParentesco.findAll", query = "select o from SgdParentesco o") })
@Table(name = "SGD_PARENTESCO")
public class SgdParentesco implements Serializable {
    private static final long serialVersionUID = -7190617838137513910L;
    
    @Id
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(length = 10)
    private String codigo;
    @Column(nullable = false)
    private Integer activo;

    public SgdParentesco() {
    }

    public SgdParentesco(Integer id, String nombre, String codigo, Integer activo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.activo = activo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getActivo() {
        return activo;
    }
}
