package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.util.Objects;

public class Requisito implements Serializable{
    @SuppressWarnings("compatibility:1768570552640283876")
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String requisito;
    private boolean cumple;
    
    public Requisito() {
        super();
    }

    public Requisito(Integer id, String requisito, boolean cumple) {
        this.id = id;
        this.requisito = requisito;
        this.cumple = cumple;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setCumple(boolean cumple) {
        this.cumple = cumple;
    }

    public boolean isCumple() {
        return cumple;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(Objects.isNull(id) ? "" : id+" " );
            sb.append(Objects.isNull(requisito) ? "" : requisito+" " );
            sb.append(Objects.isNull(cumple) ? "" : cumple+" " );
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sb.toString();
    }
}
