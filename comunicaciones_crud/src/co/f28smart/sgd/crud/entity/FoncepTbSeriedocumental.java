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
@NamedQueries({ @NamedQuery(name = "FoncepTbSeriedocumental.findAll",
                            query = "select o from FoncepTbSeriedocumental o"),
                @NamedQuery(name = "FoncepTbSeriedocumental.findByIdUnidadProductora",
                            query = "select o from FoncepTbSeriedocumental o where o.idseriedocumental = :param"),
                @NamedQuery(name = "FoncepTbSeriedocumental.findById",
                            query = "select o from FoncepTbSeriedocumental o where o.idseriedocumental = :param order by o.seriedocumental asc"),
                @NamedQuery(name = "FoncepTbSeriedocumental.findIdByCodeAndIdUnidadProductora",
                            query = "select o.idseriedocumental from FoncepTbSeriedocumental o where o.codigoserie = :param and o.idunidadproductora = :param1")})
@Table(name = "FONCEP_TB_SERIEDOCUMENTAL")
public class FoncepTbSeriedocumental implements Serializable {
    @SuppressWarnings("compatibility:8924926712261943735")
    private static final long serialVersionUID = 1L;
    private Integer codigoserie;
    @Column(length = 80)
    private String descripcionserie;

    /**
     */
    @Id
    @Column(nullable = false)
    private Integer idseriedocumental;
    private Integer idunidadproductora;
    private Timestamp schcreatetimestamp;
    private Timestamp schmodifytimestamp;
    @Column(length = 50)
    private String schsourceid;
    @Column(length = 80)
    private String seriedocumental;

    public FoncepTbSeriedocumental() {
    }

    public FoncepTbSeriedocumental(Integer codigoserie, String descripcionserie, Integer idseriedocumental,
                                   Integer idunidadproductora, Timestamp schcreatetimestamp,
                                   Timestamp schmodifytimestamp, String schsourceid, String seriedocumental) {
        this.codigoserie = codigoserie;
        this.descripcionserie = descripcionserie;
        this.idseriedocumental = idseriedocumental;
        this.idunidadproductora = idunidadproductora;
        this.schcreatetimestamp = schcreatetimestamp;
        this.schmodifytimestamp = schmodifytimestamp;
        this.schsourceid = schsourceid;
        this.seriedocumental = seriedocumental;
    }

    public Integer getCodigoserie() {
        return codigoserie;
    }

    public void setCodigoserie(Integer codigoserie) {
        this.codigoserie = codigoserie;
    }

    public String getDescripcionserie() {
        return descripcionserie;
    }

    public void setDescripcionserie(String descripcionserie) {
        this.descripcionserie = descripcionserie;
    }

    public Integer getIdseriedocumental() {
        return idseriedocumental;
    }

    public void setIdseriedocumental(Integer idseriedocumental) {
        this.idseriedocumental = idseriedocumental;
    }

    public Integer getIdunidadproductora() {
        return idunidadproductora;
    }

    public void setIdunidadproductora(Integer idunidadproductora) {
        this.idunidadproductora = idunidadproductora;
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

    public String getSeriedocumental() {
        return seriedocumental;
    }

    public void setSeriedocumental(String seriedocumental) {
        this.seriedocumental = seriedocumental;
    }
}
