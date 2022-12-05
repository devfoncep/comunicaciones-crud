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
@NamedQueries({ @NamedQuery(name = "FoncepTbFondodocumental.findAll",
                            query = "select o from FoncepTbFondodocumental o order by o.fondo asc"),
                @NamedQuery(name = "FoncepTbFondodocumental.findIdByCode",
                            query = "select o.id from FoncepTbFondodocumental o where o.codigofondo = :param"),
                @NamedQuery(name = "FoncepTbFondodocumental.findById",
                            query = "select o.id from FoncepTbFondodocumental o where o.id = :param")})
@Table(name = "FONCEP_TB_FONDODOCUMENTAL")
public class FoncepTbFondodocumental implements Serializable {
    @SuppressWarnings("compatibility:1882481842952879497")
    private static final long serialVersionUID = 1L;
    private Integer codigofondo;
    
    @Column(length = 60)
    private String fondo;
    @Id
    @Column(nullable = false)
    private Integer id;
    private Timestamp schcreatetimestamp;
    private Timestamp schmodifytimestamp;
    @Column(length = 50)
    private String schsourceid;
    @Column(length = 65)
    private String unidadfondo;

    public FoncepTbFondodocumental() {
    }

    public FoncepTbFondodocumental(Integer codigofondo, String fondo, Integer id, Timestamp schcreatetimestamp,
                                   Timestamp schmodifytimestamp, String schsourceid, String unidadfondo) {
        this.codigofondo = codigofondo;
        this.fondo = fondo;
        this.id = id;
        this.schcreatetimestamp = schcreatetimestamp;
        this.schmodifytimestamp = schmodifytimestamp;
        this.schsourceid = schsourceid;
        this.unidadfondo = unidadfondo;
    }

    public Integer getCodigofondo() {
        return codigofondo;
    }

    public void setCodigofondo(Integer codigofondo) {
        this.codigofondo = codigofondo;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUnidadfondo() {
        return unidadfondo;
    }

    public void setUnidadfondo(String unidadfondo) {
        this.unidadfondo = unidadfondo;
    }
}
