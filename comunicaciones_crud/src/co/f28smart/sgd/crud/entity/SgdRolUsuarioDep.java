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
@NamedQueries({ @NamedQuery(name = "SgdRolUsuarioDep.findAll", query = "select o from SgdRolUsuarioDep o"),
                @NamedQuery(name = "SgdRolUsuarioDep.findByUserAndIdRol", query = "select o from SgdRolUsuarioDep o where o.idUsuario = :idUsuario and o.idRol = :idRol")})
@Table(name = "SGD_ROL_USUARIO_DEP")
@SuppressWarnings("oracle.jdeveloper.ejb.entity-class-auto-id-gen")
public class SgdRolUsuarioDep  implements Serializable {
    @SuppressWarnings("compatibility:7400374384453225802")
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "ID_ROL_USUARIO_DEP")
    private Integer idRolUsuarioDep;
    @Column(name = "ID_ROL")
    private Integer idRol;
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Column(name = "CODIGO_DEPENDENCIA")
    private Integer codigoDependencia;
    
    

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setCodigoDependencia(Integer codigoDependencia) {
        this.codigoDependencia = codigoDependencia;
    }

    public Integer getCodigoDependencia() {
        return codigoDependencia;
    }

    public void setIdRolUsuarioDep(Integer idRolUsuarioDep) {
        this.idRolUsuarioDep = idRolUsuarioDep;
    }

    public Integer getIdRolUsuarioDep() {
        return idRolUsuarioDep;
    }
}
