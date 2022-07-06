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
@NamedQueries({ @NamedQuery(name = "SgdPais.findAll", query = "select o from SgdPais o")
                })
@Table(name = "SGD_PAIS")
public class SgdPais implements Serializable {
    private static final long serialVersionUID = 4818450103284138967L;
    @Id
    @Column(nullable = false)
    private Integer id;
    private String iso;
    @Column(length = 80)
    private String nombre;

    public SgdPais() {
    }

    public SgdPais(Integer id, String iso, String nombre) {
        this.id = id;
        this.iso = iso;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
