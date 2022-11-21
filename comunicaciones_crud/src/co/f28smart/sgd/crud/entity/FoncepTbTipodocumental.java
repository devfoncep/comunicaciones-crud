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
@NamedQueries({ @NamedQuery(name = "FoncepTbTipodocumental.findAll",
                            query = "select o from FoncepTbTipodocumental o"),
                @NamedQuery(name = "FoncepTbTipodocumental.findIdByCode",
                            query = "select o.idtipodocumental from FoncepTbTipodocumental o where o.codigotipodocumental = :param"),
                @NamedQuery(name = "FoncepTbTipodocumental.findById",
                            query = "select o from FoncepTbTipodocumental o where o.idtipodocumental = :param"),
                @NamedQuery(name = "FoncepTbTipodocumental.findBySubSerieDocumental",
                            query = "select o from FoncepTbTipodocumental o where o.idsubseriedocumental = :param order by o.tipodocumental asc")})
@Table(name = "FONCEP_TB_TIPODOCUMENTAL")
public class FoncepTbTipodocumental implements Serializable {
    @SuppressWarnings("compatibility:8191924903203980878")
    private static final long serialVersionUID = 1L;
    private Integer codigotipodocumental;
    @Column(length = 130)
    private String descripciontipodocumental;
    private Integer idsubseriedocumental;
    @Id
    @Column(nullable = false)
    private Integer idtipodocumental;
    private Timestamp schcreatetimestamp;
    private Timestamp schmodifytimestamp;
    @Column(length = 50)
    private String schsourceid;
    @Column(length = 130)
    private String tipodocumental;

    public FoncepTbTipodocumental() {
    }

    public FoncepTbTipodocumental(Integer codigotipodocumental, String descripciontipodocumental,
                                  Integer idsubseriedocumental, Integer idtipodocumental,
                                  Timestamp schcreatetimestamp, Timestamp schmodifytimestamp, String schsourceid,
                                  String tipodocumental) {
        this.codigotipodocumental = codigotipodocumental;
        this.descripciontipodocumental = descripciontipodocumental;
        this.idsubseriedocumental = idsubseriedocumental;
        this.idtipodocumental = idtipodocumental;
        this.schcreatetimestamp = schcreatetimestamp;
        this.schmodifytimestamp = schmodifytimestamp;
        this.schsourceid = schsourceid;
        this.tipodocumental = tipodocumental;
    }

    public Integer getCodigotipodocumental() {
        return codigotipodocumental;
    }

    public void setCodigotipodocumental(Integer codigotipodocumental) {
        this.codigotipodocumental = codigotipodocumental;
    }

    public String getDescripciontipodocumental() {
        return descripciontipodocumental;
    }

    public void setDescripciontipodocumental(String descripciontipodocumental) {
        this.descripciontipodocumental = descripciontipodocumental;
    }

    public Integer getIdsubseriedocumental() {
        return idsubseriedocumental;
    }

    public void setIdsubseriedocumental(Integer idsubseriedocumental) {
        this.idsubseriedocumental = idsubseriedocumental;
    }

    public Integer getIdtipodocumental() {
        return idtipodocumental;
    }

    public void setIdtipodocumental(Integer idtipodocumental) {
        this.idtipodocumental = idtipodocumental;
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

    public String getTipodocumental() {
        return tipodocumental;
    }

    public void setTipodocumental(String tipodocumental) {
        this.tipodocumental = tipodocumental;
    }
}
