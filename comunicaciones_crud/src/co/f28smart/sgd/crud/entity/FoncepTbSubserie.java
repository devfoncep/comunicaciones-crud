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
@NamedQueries({ @NamedQuery(name = "FoncepTbSubserie.findAll", query = "select o from FoncepTbSubserie o"),
                @NamedQuery(name = "FoncepTbSubserie.findIdByCodeAndIdSerieDocumental",
                            query = "select o.idsubserie from FoncepTbSubserie o where o.codigosubserie = :param and o.idserie = :param1")})
@Table(name = "FONCEP_TB_SUBSERIE")
public class FoncepTbSubserie implements Serializable {
    @SuppressWarnings("compatibility:4873862971804842299")
    private static final long serialVersionUID = 1L;
    private Integer codigosubserie;
    @Column(length = 130)
    private String descripcionsubserie;
    private Integer idserie;
    @Id
    @Column(nullable = false)
    private Integer idsubserie;
    private Timestamp schcreatetimestamp;
    private Timestamp schmodifytimestamp;
    @Column(length = 50)
    private String schsourceid;
    @Column(length = 130)
    private String subserie;

    public FoncepTbSubserie() {
    }

    public FoncepTbSubserie(Integer codigosubserie, String descripcionsubserie, Integer idserie,
                            Integer idsubserie, Timestamp schcreatetimestamp, Timestamp schmodifytimestamp,
                            String schsourceid, String subserie) {
        this.codigosubserie = codigosubserie;
        this.descripcionsubserie = descripcionsubserie;
        this.idserie = idserie;
        this.idsubserie = idsubserie;
        this.schcreatetimestamp = schcreatetimestamp;
        this.schmodifytimestamp = schmodifytimestamp;
        this.schsourceid = schsourceid;
        this.subserie = subserie;
    }

    public Integer getCodigosubserie() {
        return codigosubserie;
    }

    public void setCodigosubserie(Integer codigosubserie) {
        this.codigosubserie = codigosubserie;
    }

    public String getDescripcionsubserie() {
        return descripcionsubserie;
    }

    public void setDescripcionsubserie(String descripcionsubserie) {
        this.descripcionsubserie = descripcionsubserie;
    }

    public Integer getIdserie() {
        return idserie;
    }

    public void setIdserie(Integer idserie) {
        this.idserie = idserie;
    }

    public Integer getIdsubserie() {
        return idsubserie;
    }

    public void setIdsubserie(Integer idsubserie) {
        this.idsubserie = idsubserie;
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

    public String getSubserie() {
        return subserie;
    }

    public void setSubserie(String subserie) {
        this.subserie = subserie;
    }
}
