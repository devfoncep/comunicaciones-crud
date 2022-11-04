package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "FoncepTbUnidadproductora.findAll",
                            query = "select o from FoncepTbUnidadproductora o"),
                @NamedQuery(name = "FoncepTbUnidadproductora.findIdByCode",
                            query = "select o.idunidad from FoncepTbUnidadproductora o where o.codigounidad = :param")})
@Table(name = "FONCEP_TB_UNIDADPRODUCTORA")
public class FoncepTbUnidadproductora implements Serializable {
    @SuppressWarnings("compatibility:-5249136211501503820")
    private static final long serialVersionUID = 1L;
    private Integer codigounidad;
    private Integer idfondodocumental;
    @Id
    @Column(nullable = false)
    private Integer idunidad;
    private Timestamp schcreatetimestamp;
    private Timestamp schmodifytimestamp;
    @Column(length = 50)
    private String schsourceid;
    @Column(length = 60)
    private String unidad;
    @Column(length = 65)
    private String unidadproductora;

    public FoncepTbUnidadproductora() {
    }

    public FoncepTbUnidadproductora(Integer codigounidad, Integer idfondodocumental, Integer idunidad,
                                    Timestamp schcreatetimestamp, Timestamp schmodifytimestamp, String schsourceid,
                                    String unidad, String unidadproductora) {
        this.codigounidad = codigounidad;
        this.idfondodocumental = idfondodocumental;
        this.idunidad = idunidad;
        this.schcreatetimestamp = schcreatetimestamp;
        this.schmodifytimestamp = schmodifytimestamp;
        this.schsourceid = schsourceid;
        this.unidad = unidad;
        this.unidadproductora = unidadproductora;
    }

    public Integer getCodigounidad() {
        return codigounidad;
    }

    public void setCodigounidad(Integer codigounidad) {
        this.codigounidad = codigounidad;
    }

    public Integer getIdfondodocumental() {
        return idfondodocumental;
    }

    public void setIdfondodocumental(Integer idfondodocumental) {
        this.idfondodocumental = idfondodocumental;
    }

    public Integer getIdunidad() {
        return idunidad;
    }

    public void setIdunidad(Integer idunidad) {
        this.idunidad = idunidad;
    }

    public Timestamp getSchcreatetimestamp() {
        return schcreatetimestamp;
    }

    public void setSchcreatetimestamp(Timestamp schcreatetimestamp) {
        this.schcreatetimestamp = schcreatetimestamp;
    }

    public Timestamp getSchmodifytimestamp() {
        return schmodifytimestamp;
    }

    public void setSchmodifytimestamp(Timestamp schmodifytimestamp) {
        this.schmodifytimestamp = schmodifytimestamp;
    }

    public String getSchsourceid() {
        return schsourceid;
    }

    public void setSchsourceid(String schsourceid) {
        this.schsourceid = schsourceid;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidadproductora() {
        return unidadproductora;
    }

    public void setUnidadproductora(String unidadproductora) {
        this.unidadproductora = unidadproductora;
    }
}
