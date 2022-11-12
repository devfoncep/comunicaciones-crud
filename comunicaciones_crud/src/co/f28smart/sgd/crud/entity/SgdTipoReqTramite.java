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
@NamedQueries({ @NamedQuery(name = "SgdTipoReqTramite.findAll", query = "select o from SgdTipoReqTramite o order by o.nombre asc"),
                @NamedQuery(name = "SgdTipoReqTramite.findByTipoTramite", 
                            query = "select o from SgdTipoReqTramite o where o.idTipoTramite = :idTipoTramite order by o.nombre asc")})
@Table(name = "SGD_TIPO_REQUISITO_TRAMITE")
public class SgdTipoReqTramite {
    
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "NOMBRE", length = 150, nullable = false)
    private String nombre;
    @Column(name = "CODIGO", length = 10, nullable = false)
    private String codigo;
    @Column(name = "ID_TIPO_TRAMITE", nullable = false)
    private Integer idTipoTramite;
    
    
    public SgdTipoReqTramite() {
        super();
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

    public void setIdTipoTramite(Integer idTipoTramite) {
        this.idTipoTramite = idTipoTramite;
    }

    public Integer getIdTipoTramite() {
        return idTipoTramite;
    }
}
