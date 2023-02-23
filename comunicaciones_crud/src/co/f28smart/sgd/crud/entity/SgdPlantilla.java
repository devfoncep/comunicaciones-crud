package co.f28smart.sgd.crud.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Cacheable(false)
@NamedQueries({ @NamedQuery(name = "SgdPlantilla.findAll", query = "select o from SgdPlantilla o"),
                @NamedQuery(name = "SgdPlantilla.findByIdTipoCom", 
                            query = "select o from SgdPlantilla o where o.idTipoComunicacion = :idTipoComunicacion")})
@Table(name = "SGD_PLANTILLA")
public class SgdPlantilla implements Serializable {
    @SuppressWarnings("compatibility:-5118871809529840640")
    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_MODIFICACION")
    private Date fechaModificacion;
    @Id
    @Column(name = "ID_SGD_PLANTILLA", nullable = false)
    private Long idSgdPlantilla;
    @Column(name = "IP_CREACION", length = 20)
    private String ipCreacion;
    @Column(name = "IP_MODIFICACION", length = 20)
    private String ipModificacion;
    @Column(length = 200)
    private String nombre;
    @Column(name = "PARAMETRO_REEMPLAZO", length = 100)
    private String parametroReemplazo;
    @Column(length = 500)
    private String ruta;
    @Column(name = "USUARIO_CREACION", length = 50)
    private String usuarioCreacion;
    @Column(name = "USUARIO_MODIFICACION", length = 50)
    private String usuarioModificacion;
    @Column(name = "VIGENTE")
    private Integer vigente;
    @Column(name = "ID_TIPO_COMUNICACION")
    private Integer idTipoComunicacion;
    @Lob
    @Column(name = "ARCHIVO")
    private byte[] archivo;
    

    public SgdPlantilla() {
    }

    public SgdPlantilla(Date fechaCreacion, Date fechaModificacion, Long idSgdPlantilla, String ipCreacion,
                        String ipModificacion, String nombre, String parametroReemplazo, String ruta,
                        String usuarioCreacion, String usuarioModificacion, Integer vigente) {
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.idSgdPlantilla = idSgdPlantilla;
        this.ipCreacion = ipCreacion;
        this.ipModificacion = ipModificacion;
        this.nombre = nombre;
        this.parametroReemplazo = parametroReemplazo;
        this.ruta = ruta;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.vigente = vigente;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Long getIdSgdPlantilla() {
        return idSgdPlantilla;
    }

    public void setIdSgdPlantilla(Long idSgdPlantilla) {
        this.idSgdPlantilla = idSgdPlantilla;
    }

    public String getIpCreacion() {
        return ipCreacion;
    }

    public void setIpCreacion(String ipCreacion) {
        this.ipCreacion = ipCreacion;
    }

    public String getIpModificacion() {
        return ipModificacion;
    }

    public void setIpModificacion(String ipModificacion) {
        this.ipModificacion = ipModificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParametroReemplazo() {
        return parametroReemplazo;
    }

    public void setParametroReemplazo(String parametroReemplazo) {
        this.parametroReemplazo = parametroReemplazo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Integer getVigente() {
        return vigente;
    }

    public void setVigente(Integer vigente) {
        this.vigente = vigente;
    }

    public void setIdTipoComunicacion(Integer idTipoComunicacion) {
        this.idTipoComunicacion = idTipoComunicacion;
    }

    public Integer getIdTipoComunicacion() {
        return idTipoComunicacion;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public byte[] getArchivo() {
        return archivo;
    }


    @Override
    public String toString() {
        return super.toString ()
        +"fechaCreacion :"+fechaCreacion+","
        +"fechaModificacion :"+fechaModificacion+","
        +"idSgdPlantilla :"+idSgdPlantilla+","
        +"ipCreacion :"+ipCreacion+","
        +"ipModificacion :"+ipModificacion+","
        +"nombre :"+nombre+","
        +"parametroReemplazo :"+parametroReemplazo+","
        +"ruta :"+ruta+","
        +"usuarioCreacion :"+usuarioCreacion+","
        +"usuarioModificacion :"+usuarioModificacion+","
        +"vigente :"+vigente+","
        +"idTipoComunicacion :"+idTipoComunicacion+","
        +"archivo :"+archivo+"}";
    }
}
