package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

public class OptionslistPK implements Serializable {
    @SuppressWarnings("compatibility:8513546902524400045")
    private static final long serialVersionUID = 1L;
    
    private String dkey;
    private Integer dorder;

    public OptionslistPK() {
    }

    public OptionslistPK(String dkey, Integer dorder) {
        this.dkey = dkey;
        this.dorder = dorder;
    }

    public boolean equals(Object other) {
        if (other instanceof OptionslistPK) {
            final OptionslistPK otherOptionslistPK = (OptionslistPK) other;
            final boolean areEqual = (otherOptionslistPK.dkey.equals(dkey) && otherOptionslistPK.dorder.equals(dorder));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String getDkey() {
        return dkey;
    }

    public void setDkey(String dkey) {
        this.dkey = dkey;
    }

    public Integer getDorder() {
        return dorder;
    }

    public void setDorder(Integer dorder) {
        this.dorder = dorder;
    }
}
