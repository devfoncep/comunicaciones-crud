package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Optionslist.findAll", query = "select o from Optionslist o"),
                @NamedQuery(name = "Optionslist.findByKey", query = "select o from Optionslist o where o.dkey = :param order by o.dorder asc")})
@IdClass(OptionslistPK.class)
public class Optionslist implements Serializable {
    @SuppressWarnings("compatibility:-4631113172496206069")
    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false, length = 50)
    private String dkey;
    @Column(nullable = false, length = 100)
    private String doption;
    @Id
    @Column(nullable = false)
    private Integer dorder;

    public Optionslist() {
    }

    public Optionslist(String dkey, String doption, Integer dorder) {
        this.dkey = dkey;
        this.doption = doption;
        this.dorder = dorder;
    }

    public String getDkey() {
        return dkey;
    }

    public void setDkey(String dkey) {
        this.dkey = dkey;
    }

    public String getDoption() {
        return doption;
    }

    public void setDoption(String doption) {
        this.doption = doption;
    }

    public Integer getDorder() {
        return dorder;
    }

    public void setDorder(Integer dorder) {
        this.dorder = dorder;
    }
}
