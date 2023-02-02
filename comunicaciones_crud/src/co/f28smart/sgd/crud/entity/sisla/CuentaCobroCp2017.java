package co.f28smart.sgd.crud.entity.sisla;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

@NamedQueries({ @NamedQuery(name = "CuentaCobroCp2017.findAll", query = "select o from CuentaCobroCp2017 o") })
@Table(name = "CUENTA_COBRO_CP_2017")
public class CuentaCobroCp2017 implements Serializable {
    @SuppressWarnings("compatibility:4754772273496976945")
    private static final long serialVersionUID = 1L;
    @Column(name = "ACTA_LEGALIZACION", length = 50)
    private String actaLegalizacion;
    @Column(name = "ARCH_PAGO_REFERENCIADO", length = 100)
    private String archPagoReferenciado;
    private Long capital;
    @Column(name = "DIAS_TRANSCURRIDOS")
    private Long diasTranscurridos;
    @Column(name = "ENTIDAD_CUENTA_COBRO", nullable = false, length = 10)
    private String entidadCuentaCobro;
    @Column(length = 2)
    private String fase;
    @Column(name = "FASE_INI", length = 2)
    private String faseIni;
    @Temporal(TemporalType.DATE)
    @Column(name = "FCH_GEN_ARCH_PAGO_REFERENCIADO")
    private Date fchGenArchPagoReferenciado;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACT")
    private Date fechaAct;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CAMBIO_FASE")
    private Date fechaCambioFase;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CORTE")
    private Date fechaCorte;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_FACTURACION")
    private Date fechaFacturacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_INTERES")
    private Date fechaInteres;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_LEGALIZACION")
    private Date fechaLegalizacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_RADI")
    private Date fechaRadi;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_RECAUDO")
    private Date fechaRecaudo;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_RECIBIDA")
    private Date fechaRecibida;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_SIGEF")
    private Date fechaSigef;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_VCTO_PAGO_CAPITAL")
    private Date fechaVctoPagoCapital;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_VCTO_PAGO_INTERES")
    private Date fechaVctoPagoInteres;
    @Id
    @Column(name = "ID_CUENTA_COBRO", nullable = false)
    private Long idCuentaCobro;
    @Column(name = "ID_CUENTA_COBRO_ORIGEN")
    private Long idCuentaCobroOrigen;
    @Column(name = "ID_RADI", length = 20)
    private String idRadi;
    @Column(name = "ID_RECIBIDA", length = 20)
    private String idRecibida;
    @Column(name = "ID_SIGEF", length = 20)
    private String idSigef;
    private Long interes;
    @Column(name = "NOM_ARCH_CERTIFICACION", length = 100)
    private String nomArchCertificacion;
    @Column(name = "NOM_ARCH_CUENTA_COBRO", length = 100)
    private String nomArchCuentaCobro;
    @Column(name = "NOM_ARCH_LIQUIDACION", length = 100)
    private String nomArchLiquidacion;
    private Long recaudo;
    private Long saldo;
    @Column(name = "USR_ACT", length = 50)
    private String usrAct;
    @Column(name = "USUARIO_CAMBIO_FASE", length = 20)
    private String usuarioCambioFase;
    @Column(name = "USUARIO_RADI", length = 20)
    private String usuarioRadi;
    @Column(name = "USUARIO_SIGEF", length = 20)
    private String usuarioSigef;
    @Column(name = "VLR_NOV_CRE")
    private Long vlrNovCre;
    @Column(name = "VLR_NOV_DEB")
    private Long vlrNovDeb;
    @Column(name = "VLR_TOTAL", nullable = false)
    private Long vlrTotal;
    @Column(name = "VLR_TOTAL_NOV")
    private Long vlrTotalNov;

    public CuentaCobroCp2017() {
    }

    public CuentaCobroCp2017(String actaLegalizacion, String archPagoReferenciado, Long capital, Long diasTranscurridos,
                             String entidadCuentaCobro, String fase, String faseIni, Date fchGenArchPagoReferenciado,
                             Date fechaAct, Date fechaCambioFase, Date fechaCorte, Date fechaCreacion,
                             Date fechaFacturacion, Date fechaInteres, Date fechaLegalizacion, Date fechaRadi,
                             Date fechaRecaudo, Date fechaRecibida, Date fechaSigef, Date fechaVctoPagoCapital,
                             Date fechaVctoPagoInteres, Long idCuentaCobro, Long idCuentaCobroOrigen, String idRadi,
                             String idRecibida, String idSigef, Long interes, String nomArchCertificacion,
                             String nomArchCuentaCobro, String nomArchLiquidacion, Long recaudo, Long saldo,
                             String usrAct, String usuarioCambioFase, String usuarioRadi, String usuarioSigef,
                             Long vlrNovCre, Long vlrNovDeb, Long vlrTotal, Long vlrTotalNov) {
        this.actaLegalizacion = actaLegalizacion;
        this.archPagoReferenciado = archPagoReferenciado;
        this.capital = capital;
        this.diasTranscurridos = diasTranscurridos;
        this.entidadCuentaCobro = entidadCuentaCobro;
        this.fase = fase;
        this.faseIni = faseIni;
        this.fchGenArchPagoReferenciado = fchGenArchPagoReferenciado;
        this.fechaAct = fechaAct;
        this.fechaCambioFase = fechaCambioFase;
        this.fechaCorte = fechaCorte;
        this.fechaCreacion = fechaCreacion;
        this.fechaFacturacion = fechaFacturacion;
        this.fechaInteres = fechaInteres;
        this.fechaLegalizacion = fechaLegalizacion;
        this.fechaRadi = fechaRadi;
        this.fechaRecaudo = fechaRecaudo;
        this.fechaRecibida = fechaRecibida;
        this.fechaSigef = fechaSigef;
        this.fechaVctoPagoCapital = fechaVctoPagoCapital;
        this.fechaVctoPagoInteres = fechaVctoPagoInteres;
        this.idCuentaCobro = idCuentaCobro;
        this.idCuentaCobroOrigen = idCuentaCobroOrigen;
        this.idRadi = idRadi;
        this.idRecibida = idRecibida;
        this.idSigef = idSigef;
        this.interes = interes;
        this.nomArchCertificacion = nomArchCertificacion;
        this.nomArchCuentaCobro = nomArchCuentaCobro;
        this.nomArchLiquidacion = nomArchLiquidacion;
        this.recaudo = recaudo;
        this.saldo = saldo;
        this.usrAct = usrAct;
        this.usuarioCambioFase = usuarioCambioFase;
        this.usuarioRadi = usuarioRadi;
        this.usuarioSigef = usuarioSigef;
        this.vlrNovCre = vlrNovCre;
        this.vlrNovDeb = vlrNovDeb;
        this.vlrTotal = vlrTotal;
        this.vlrTotalNov = vlrTotalNov;
    }


    public String getActaLegalizacion() {
        return actaLegalizacion;
    }

    public void setActaLegalizacion(String actaLegalizacion) {
        this.actaLegalizacion = actaLegalizacion;
    }

    public String getArchPagoReferenciado() {
        return archPagoReferenciado;
    }

    public void setArchPagoReferenciado(String archPagoReferenciado) {
        this.archPagoReferenciado = archPagoReferenciado;
    }

    public Long getCapital() {
        return capital;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }

    public Long getDiasTranscurridos() {
        return diasTranscurridos;
    }

    public void setDiasTranscurridos(Long diasTranscurridos) {
        this.diasTranscurridos = diasTranscurridos;
    }

    public String getEntidadCuentaCobro() {
        return entidadCuentaCobro;
    }

    public void setEntidadCuentaCobro(String entidadCuentaCobro) {
        this.entidadCuentaCobro = entidadCuentaCobro;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getFaseIni() {
        return faseIni;
    }

    public void setFaseIni(String faseIni) {
        this.faseIni = faseIni;
    }

    public Date getFchGenArchPagoReferenciado() {
        return fchGenArchPagoReferenciado;
    }

    public void setFchGenArchPagoReferenciado(Date fchGenArchPagoReferenciado) {
        this.fchGenArchPagoReferenciado = fchGenArchPagoReferenciado;
    }

    public Date getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(Date fechaAct) {
        this.fechaAct = fechaAct;
    }

    public Date getFechaCambioFase() {
        return fechaCambioFase;
    }

    public void setFechaCambioFase(Date fechaCambioFase) {
        this.fechaCambioFase = fechaCambioFase;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public Date getFechaInteres() {
        return fechaInteres;
    }

    public void setFechaInteres(Date fechaInteres) {
        this.fechaInteres = fechaInteres;
    }

    public Date getFechaLegalizacion() {
        return fechaLegalizacion;
    }

    public void setFechaLegalizacion(Date fechaLegalizacion) {
        this.fechaLegalizacion = fechaLegalizacion;
    }

    public Date getFechaRadi() {
        return fechaRadi;
    }

    public void setFechaRadi(Date fechaRadi) {
        this.fechaRadi = fechaRadi;
    }

    public Date getFechaRecaudo() {
        return fechaRecaudo;
    }

    public void setFechaRecaudo(Date fechaRecaudo) {
        this.fechaRecaudo = fechaRecaudo;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public Date getFechaSigef() {
        return fechaSigef;
    }

    public void setFechaSigef(Date fechaSigef) {
        this.fechaSigef = fechaSigef;
    }

    public Date getFechaVctoPagoCapital() {
        return fechaVctoPagoCapital;
    }

    public void setFechaVctoPagoCapital(Date fechaVctoPagoCapital) {
        this.fechaVctoPagoCapital = fechaVctoPagoCapital;
    }

    public Date getFechaVctoPagoInteres() {
        return fechaVctoPagoInteres;
    }

    public void setFechaVctoPagoInteres(Date fechaVctoPagoInteres) {
        this.fechaVctoPagoInteres = fechaVctoPagoInteres;
    }

    public Long getIdCuentaCobro() {
        return idCuentaCobro;
    }

    public void setIdCuentaCobro(Long idCuentaCobro) {
        this.idCuentaCobro = idCuentaCobro;
    }

    public Long getIdCuentaCobroOrigen() {
        return idCuentaCobroOrigen;
    }

    public void setIdCuentaCobroOrigen(Long idCuentaCobroOrigen) {
        this.idCuentaCobroOrigen = idCuentaCobroOrigen;
    }

    public String getIdRadi() {
        return idRadi;
    }

    public void setIdRadi(String idRadi) {
        this.idRadi = idRadi;
    }

    public String getIdRecibida() {
        return idRecibida;
    }

    public void setIdRecibida(String idRecibida) {
        this.idRecibida = idRecibida;
    }

    public String getIdSigef() {
        return idSigef;
    }

    public void setIdSigef(String idSigef) {
        this.idSigef = idSigef;
    }

    public Long getInteres() {
        return interes;
    }

    public void setInteres(Long interes) {
        this.interes = interes;
    }

    public String getNomArchCertificacion() {
        return nomArchCertificacion;
    }

    public void setNomArchCertificacion(String nomArchCertificacion) {
        this.nomArchCertificacion = nomArchCertificacion;
    }

    public String getNomArchCuentaCobro() {
        return nomArchCuentaCobro;
    }

    public void setNomArchCuentaCobro(String nomArchCuentaCobro) {
        this.nomArchCuentaCobro = nomArchCuentaCobro;
    }

    public String getNomArchLiquidacion() {
        return nomArchLiquidacion;
    }

    public void setNomArchLiquidacion(String nomArchLiquidacion) {
        this.nomArchLiquidacion = nomArchLiquidacion;
    }

    public Long getRecaudo() {
        return recaudo;
    }

    public void setRecaudo(Long recaudo) {
        this.recaudo = recaudo;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }

    public String getUsrAct() {
        return usrAct;
    }

    public void setUsrAct(String usrAct) {
        this.usrAct = usrAct;
    }

    public String getUsuarioCambioFase() {
        return usuarioCambioFase;
    }

    public void setUsuarioCambioFase(String usuarioCambioFase) {
        this.usuarioCambioFase = usuarioCambioFase;
    }

    public String getUsuarioRadi() {
        return usuarioRadi;
    }

    public void setUsuarioRadi(String usuarioRadi) {
        this.usuarioRadi = usuarioRadi;
    }

    public String getUsuarioSigef() {
        return usuarioSigef;
    }

    public void setUsuarioSigef(String usuarioSigef) {
        this.usuarioSigef = usuarioSigef;
    }

    public Long getVlrNovCre() {
        return vlrNovCre;
    }

    public void setVlrNovCre(Long vlrNovCre) {
        this.vlrNovCre = vlrNovCre;
    }

    public Long getVlrNovDeb() {
        return vlrNovDeb;
    }

    public void setVlrNovDeb(Long vlrNovDeb) {
        this.vlrNovDeb = vlrNovDeb;
    }

    public Long getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(Long vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    public Long getVlrTotalNov() {
        return vlrTotalNov;
    }

    public void setVlrTotalNov(Long vlrTotalNov) {
        this.vlrTotalNov = vlrTotalNov;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("actaLegalizacion=");
        buffer.append(getActaLegalizacion());
        buffer.append(',');
        buffer.append("archPagoReferenciado=");
        buffer.append(getArchPagoReferenciado());
        buffer.append(',');
        buffer.append("capital=");
        buffer.append(getCapital());
        buffer.append(',');
        buffer.append("diasTranscurridos=");
        buffer.append(getDiasTranscurridos());
        buffer.append(',');
        buffer.append("entidadCuentaCobro=");
        buffer.append(getEntidadCuentaCobro());
        buffer.append(',');
        buffer.append("fase=");
        buffer.append(getFase());
        buffer.append(',');
        buffer.append("faseIni=");
        buffer.append(getFaseIni());
        buffer.append(',');
        buffer.append("fchGenArchPagoReferenciado=");
        buffer.append(getFchGenArchPagoReferenciado());
        buffer.append(',');
        buffer.append("fechaAct=");
        buffer.append(getFechaAct());
        buffer.append(',');
        buffer.append("fechaCambioFase=");
        buffer.append(getFechaCambioFase());
        buffer.append(',');
        buffer.append("fechaCorte=");
        buffer.append(getFechaCorte());
        buffer.append(',');
        buffer.append("fechaCreacion=");
        buffer.append(getFechaCreacion());
        buffer.append(',');
        buffer.append("fechaFacturacion=");
        buffer.append(getFechaFacturacion());
        buffer.append(',');
        buffer.append("fechaInteres=");
        buffer.append(getFechaInteres());
        buffer.append(',');
        buffer.append("fechaLegalizacion=");
        buffer.append(getFechaLegalizacion());
        buffer.append(',');
        buffer.append("fechaRadi=");
        buffer.append(getFechaRadi());
        buffer.append(',');
        buffer.append("fechaRecaudo=");
        buffer.append(getFechaRecaudo());
        buffer.append(',');
        buffer.append("fechaRecibida=");
        buffer.append(getFechaRecibida());
        buffer.append(',');
        buffer.append("fechaSigef=");
        buffer.append(getFechaSigef());
        buffer.append(',');
        buffer.append("fechaVctoPagoCapital=");
        buffer.append(getFechaVctoPagoCapital());
        buffer.append(',');
        buffer.append("fechaVctoPagoInteres=");
        buffer.append(getFechaVctoPagoInteres());
        buffer.append(',');
        buffer.append("idCuentaCobro=");
        buffer.append(getIdCuentaCobro());
        buffer.append(',');
        buffer.append("idCuentaCobroOrigen=");
        buffer.append(getIdCuentaCobroOrigen());
        buffer.append(',');
        buffer.append("idRadi=");
        buffer.append(getIdRadi());
        buffer.append(',');
        buffer.append("idRecibida=");
        buffer.append(getIdRecibida());
        buffer.append(',');
        buffer.append("idSigef=");
        buffer.append(getIdSigef());
        buffer.append(',');
        buffer.append("interes=");
        buffer.append(getInteres());
        buffer.append(',');
        buffer.append("nomArchCertificacion=");
        buffer.append(getNomArchCertificacion());
        buffer.append(',');
        buffer.append("nomArchCuentaCobro=");
        buffer.append(getNomArchCuentaCobro());
        buffer.append(',');
        buffer.append("nomArchLiquidacion=");
        buffer.append(getNomArchLiquidacion());
        buffer.append(',');
        buffer.append("recaudo=");
        buffer.append(getRecaudo());
        buffer.append(',');
        buffer.append("saldo=");
        buffer.append(getSaldo());
        buffer.append(',');
        buffer.append("usrAct=");
        buffer.append(getUsrAct());
        buffer.append(',');
        buffer.append("usuarioCambioFase=");
        buffer.append(getUsuarioCambioFase());
        buffer.append(',');
        buffer.append("usuarioRadi=");
        buffer.append(getUsuarioRadi());
        buffer.append(',');
        buffer.append("usuarioSigef=");
        buffer.append(getUsuarioSigef());
        buffer.append(',');
        buffer.append("vlrNovCre=");
        buffer.append(getVlrNovCre());
        buffer.append(',');
        buffer.append("vlrNovDeb=");
        buffer.append(getVlrNovDeb());
        buffer.append(',');
        buffer.append("vlrTotal=");
        buffer.append(getVlrTotal());
        buffer.append(',');
        buffer.append("vlrTotalNov=");
        buffer.append(getVlrTotalNov());
        buffer.append(']');
        return buffer.toString();
    }
}
