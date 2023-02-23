package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "SgdDepTipocomintSeq.findAll", query = "select o from SgdDepTipocomintSeq o"),
                @NamedQuery(name = "SgdDepTipocomintSeq.findByIdTipoComInt", 
                            query = "select d from SgdDepTipocomintSeq o " +
                                    "inner join SgdDependencia d " +
                                    "on d.codigoDependencia = o.codigoDependencia " +
                                    "where o.idTipoComInterna = :idTipoComInterna"),
                })
@Table(name = "SGD_DEP_TIPOCOMINT_SEQ")
public class SgdDepTipocomintSeq implements Serializable {
    @SuppressWarnings("compatibility:3299838484804833996")
    private static final long serialVersionUID = 1L;
    @Column(name = "CODIGO_DEPENDENCIA", nullable = false, unique = true)
    private Integer codigoDependencia;
    @Id
    @Column(name = "ID_DEP_TIPOCOMINT_SEQ", nullable = false)
    private Integer idDepTipocomintSeq;
    @Column(name = "ID_TIPO_COM_INTERNA", unique = true)
    private Integer idTipoComInterna;
    @Column(name = "SEQUENCE_NAME", nullable = false, length = 50)
    private String sequenceName;

    public SgdDepTipocomintSeq() {
    }

    public SgdDepTipocomintSeq(Integer codigoDependencia, Integer idDepTipocomintSeq, Integer idTipoComInterna,
                               String sequenceName) {
        this.codigoDependencia = codigoDependencia;
        this.idDepTipocomintSeq = idDepTipocomintSeq;
        this.idTipoComInterna = idTipoComInterna;
        this.sequenceName = sequenceName;
    }


    public Integer getCodigoDependencia() {
        return codigoDependencia;
    }

    public void setCodigoDependencia(Integer codigoDependencia) {
        this.codigoDependencia = codigoDependencia;
    }

    public Integer getIdDepTipocomintSeq() {
        return idDepTipocomintSeq;
    }

    public void setIdDepTipocomintSeq(Integer idDepTipocomintSeq) {
        this.idDepTipocomintSeq = idDepTipocomintSeq;
    }

    public Integer getIdTipoComInterna() {
        return idTipoComInterna;
    }

    public void setIdTipoComInterna(Integer idTipoComInterna) {
        this.idTipoComInterna = idTipoComInterna;
    }

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("codigoDependencia=");
        buffer.append(getCodigoDependencia());
        buffer.append(',');
        buffer.append("idDepTipocomintSeq=");
        buffer.append(getIdDepTipocomintSeq());
        buffer.append(',');
        buffer.append("idTipoComInterna=");
        buffer.append(getIdTipoComInterna());
        buffer.append(',');
        buffer.append("sequenceName=");
        buffer.append(getSequenceName());
        buffer.append(']');
        return buffer.toString();
    }
}
