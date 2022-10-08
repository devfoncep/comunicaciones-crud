package co.f28smart.sgd.crud.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Cacheable(false)
@NamedQueries({ @NamedQuery(name = "SgdIdiomaCom.findAll", query = "select o from SgdIdiomaCom o") })
@Table(name = "SGD_IDIOMA_COM")
public class SgdIdiomaCom {
    
    @Id
    @Column(name = "ID_IDIOMA_COM", nullable = false)
    private Integer idIdiomaCom;
    @Column(name = "CODIGO_IDIOMA", nullable = false, length = 5)
    private String codigoIdioma;
    @Column(nullable = false, length = 50)
    private String nombre;
    
    public SgdIdiomaCom() {
        super();
    }

    public SgdIdiomaCom(Integer idIdiomaCom, String codigoIdioma, String nombre) {
        this.idIdiomaCom = idIdiomaCom;
        this.codigoIdioma = codigoIdioma;
        this.nombre = nombre;
    }

    public void setIdIdiomaCom(Integer idIdiomaCom) {
        this.idIdiomaCom = idIdiomaCom;
    }

    public Integer getIdIdiomaCom() {
        return idIdiomaCom;
    }

    public void setCodigoIdioma(String codigoIdioma) {
        this.codigoIdioma = codigoIdioma;
    }

    public String getCodigoIdioma() {
        return codigoIdioma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
