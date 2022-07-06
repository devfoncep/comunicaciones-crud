package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Cacheable(false)
@NamedQueries({ @NamedQuery(name = "SgdAnexoComunicacion.findAll", query = "select o from SgdAnexoComunicacion o") })
@Table(name = "SGD_ANEXO_COMUNICACION")
public class SgdAnexoComunicacion implements Serializable {
    private static final long serialVersionUID = 4016157234550582174L;
    private BigDecimal cantidad;
    @Column(nullable = false, length = 210)
    private String descripcion;
    @Column(name = "ENLACE_CONTENT", length = 300)
    private String enlaceContent;
    @Id
    @Column(name = "ID_ANEXO_COMUNICACION")
    private BigDecimal idAnexoComunicacion;
    @Column(name = "ID_COMUNICACION")
    private BigDecimal idComunicacion;
    @Column(name = "NUMERO_RADICADO", length = 20)
    private String numeroRadicado;
    @Column(name = "RUTA_LOCAL_CARGUE", length = 500)
    private String rutaLocalCargue;

    public SgdAnexoComunicacion() {
    }

    public SgdAnexoComunicacion(BigDecimal cantidad, String descripcion, String enlaceContent,
                                BigDecimal idAnexoComunicacion, BigDecimal idComunicacion, String numeroRadicado,
                                String rutaLocalCargue) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.enlaceContent = enlaceContent;
        this.idAnexoComunicacion = idAnexoComunicacion;
        this.idComunicacion = idComunicacion;
        this.numeroRadicado = numeroRadicado;
        this.rutaLocalCargue = rutaLocalCargue;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnlaceContent() {
        return enlaceContent;
    }

    public void setEnlaceContent(String enlaceContent) {
        this.enlaceContent = enlaceContent;
    }

    public BigDecimal getIdAnexoComunicacion() {
        return idAnexoComunicacion;
    }

    public void setIdAnexoComunicacion(BigDecimal idAnexoComunicacion) {
        this.idAnexoComunicacion = idAnexoComunicacion;
    }

    public BigDecimal getIdComunicacion() {
        return idComunicacion;
    }

    public void setIdComunicacion(BigDecimal idComunicacion) {
        this.idComunicacion = idComunicacion;
    }

    public String getNumeroRadicado() {
        return numeroRadicado;
    }

    public void setNumeroRadicado(String numeroRadicado) {
        this.numeroRadicado = numeroRadicado;
    }

    public String getRutaLocalCargue() {
        return rutaLocalCargue;
    }

    public void setRutaLocalCargue(String rutaLocalCargue) {
        this.rutaLocalCargue = rutaLocalCargue;
    }
}
