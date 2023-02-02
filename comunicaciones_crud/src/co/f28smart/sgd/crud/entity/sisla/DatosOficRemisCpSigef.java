package co.f28smart.sgd.crud.entity.sisla;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "DatosOficRemisCpSigef.findAll", query = "select o from DatosOficRemisCpSigef o"),
                @NamedQuery(name = "DatosOficRemisCpSigef.findAllInFase1", query =
                            "select new co.f28smart.sgd.crud.dto.DestinatarioCuentaCobro(t1,t2) " + 
                            "from DatosOficRemisCpSigef t1, CuentaCobroCp2017 t2 " + 
                            "where t1.idCuentaCobro = t2.idCuentaCobro " + 
                            "and t2.fase = 1 " + 
                            "order by t1.idCuentaCobro desc"),
                @NamedQuery(name = "DatosOficRemisCpSigef.findAllbyDates", query =
                            "select new co.f28smart.sgd.crud.dto.DestinatarioCuentaCobro(t1,t2) " + 
                            "from DatosOficRemisCpSigef t1, CuentaCobroCp2017 t2 " + 
                            "where t1.idCuentaCobro = t2.idCuentaCobro " + 
                            "and t2.fase = 1 " + 
                            "and t2.fechaCorte BETWEEN :initDate and :endDate " +
                            "order by t1.idCuentaCobro desc ")})
@Table(name = "DATOS_OFIC_REMIS_CP_SIGEF")
public class DatosOficRemisCpSigef implements Serializable {
    @SuppressWarnings("compatibility:2406175925473092258")
    private static final long serialVersionUID = 1L;
    @Column(length = 500)
    private String banco;
    @Column(length = 400)
    private String ciudad;
    @Column(length = 500)
    private String dependencia;
    @Column(length = 100)
    private String direccion;
    @Column(name = "DIRECCION_PAGO", length = 500)
    private String direccionPago;
    @Column(name = "DIRECCION_SUPERCADE", length = 500)
    private String direccionSupercade;
    @Column(length = 100)
    private String email;
    @Column(length = 500)
    private String fax;
    @Id
    @Column(name = "ID_CUENTA_COBRO", nullable = false)
    private Long idCuentaCobro;
    @Column(length = 500)
    private String nit;
    @Column(name = "NOMBRE_ENTIDAD", nullable = false, length = 120)
    private String nombreEntidad;
    @Column(name = "NOMBRE_REPRESENTANTE", nullable = false, length = 100)
    private String nombreRepresentante;
    @Column(name = "NRO_CUENTA", length = 38)
    private String nroCuenta;
    @Column(name = "PERIODO_FIN", length = 50)
    private String periodoFin;
    @Column(name = "PERIODO_INI", length = 50)
    private String periodoIni;
    @Column(length = 500)
    private String sigla;
    @Column(length = 500)
    private String sucursal;
    @Column(length = 50)
    private String telefono;
    @Column(name = "TIPO_CUENTA", length = 35)
    private String tipoCuenta;
    @Column(name = "TITULAR_CUENTA", length = 500)
    private String titularCuenta;
    @Column(name = "VALOR_LETRAS", length = 4000)
    private String valorLetras;
    @Column(name = "VLR_TOTAL")
    private BigDecimal vlrTotal;

    public DatosOficRemisCpSigef() {
    }

    public DatosOficRemisCpSigef(String banco, String ciudad, String dependencia, String direccion,
                                 String direccionPago, String direccionSupercade, String email, String fax,
                                 Long idCuentaCobro, String nit, String nombreEntidad, String nombreRepresentante,
                                 String nroCuenta, String periodoFin, String periodoIni, String sigla, String sucursal,
                                 String telefono, String tipoCuenta, String titularCuenta, String valorLetras,
                                 BigDecimal vlrTotal) {
        this.banco = banco;
        this.ciudad = ciudad;
        this.dependencia = dependencia;
        this.direccion = direccion;
        this.direccionPago = direccionPago;
        this.direccionSupercade = direccionSupercade;
        this.email = email;
        this.fax = fax;
        this.idCuentaCobro = idCuentaCobro;
        this.nit = nit;
        this.nombreEntidad = nombreEntidad;
        this.nombreRepresentante = nombreRepresentante;
        this.nroCuenta = nroCuenta;
        this.periodoFin = periodoFin;
        this.periodoIni = periodoIni;
        this.sigla = sigla;
        this.sucursal = sucursal;
        this.telefono = telefono;
        this.tipoCuenta = tipoCuenta;
        this.titularCuenta = titularCuenta;
        this.valorLetras = valorLetras;
        this.vlrTotal = vlrTotal;
    }


    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionPago() {
        return direccionPago;
    }

    public void setDireccionPago(String direccionPago) {
        this.direccionPago = direccionPago;
    }

    public String getDireccionSupercade() {
        return direccionSupercade;
    }

    public void setDireccionSupercade(String direccionSupercade) {
        this.direccionSupercade = direccionSupercade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Long getIdCuentaCobro() {
        return idCuentaCobro;
    }

    public void setIdCuentaCobro(Long idCuentaCobro) {
        this.idCuentaCobro = idCuentaCobro;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getPeriodoFin() {
        return periodoFin;
    }

    public void setPeriodoFin(String periodoFin) {
        this.periodoFin = periodoFin;
    }

    public String getPeriodoIni() {
        return periodoIni;
    }

    public void setPeriodoIni(String periodoIni) {
        this.periodoIni = periodoIni;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public String getValorLetras() {
        return valorLetras;
    }

    public void setValorLetras(String valorLetras) {
        this.valorLetras = valorLetras;
    }

    public BigDecimal getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(BigDecimal vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("banco=");
        buffer.append(getBanco());
        buffer.append(',');
        buffer.append("ciudad=");
        buffer.append(getCiudad());
        buffer.append(',');
        buffer.append("dependencia=");
        buffer.append(getDependencia());
        buffer.append(',');
        buffer.append("direccion=");
        buffer.append(getDireccion());
        buffer.append(',');
        buffer.append("direccionPago=");
        buffer.append(getDireccionPago());
        buffer.append(',');
        buffer.append("direccionSupercade=");
        buffer.append(getDireccionSupercade());
        buffer.append(',');
        buffer.append("email=");
        buffer.append(getEmail());
        buffer.append(',');
        buffer.append("fax=");
        buffer.append(getFax());
        buffer.append(',');
        buffer.append("idCuentaCobro=");
        buffer.append(getIdCuentaCobro());
        buffer.append(',');
        buffer.append("nit=");
        buffer.append(getNit());
        buffer.append(',');
        buffer.append("nombreEntidad=");
        buffer.append(getNombreEntidad());
        buffer.append(',');
        buffer.append("nombreRepresentante=");
        buffer.append(getNombreRepresentante());
        buffer.append(',');
        buffer.append("nroCuenta=");
        buffer.append(getNroCuenta());
        buffer.append(',');
        buffer.append("periodoFin=");
        buffer.append(getPeriodoFin());
        buffer.append(',');
        buffer.append("periodoIni=");
        buffer.append(getPeriodoIni());
        buffer.append(',');
        buffer.append("sigla=");
        buffer.append(getSigla());
        buffer.append(',');
        buffer.append("sucursal=");
        buffer.append(getSucursal());
        buffer.append(',');
        buffer.append("telefono=");
        buffer.append(getTelefono());
        buffer.append(',');
        buffer.append("tipoCuenta=");
        buffer.append(getTipoCuenta());
        buffer.append(',');
        buffer.append("titularCuenta=");
        buffer.append(getTitularCuenta());
        buffer.append(',');
        buffer.append("valorLetras=");
        buffer.append(getValorLetras());
        buffer.append(',');
        buffer.append("vlrTotal=");
        buffer.append(getVlrTotal());
        buffer.append(']');
        return buffer.toString();
    }
}
