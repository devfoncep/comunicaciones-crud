package co.f28smart.sgd.crud.entity;

public class Requisito {
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
}
