package co.f28smart.sgd.crud.dto;

import co.f28smart.sgd.crud.entity.sisla.*;

import java.io.Serializable;

public class DestinatarioCuentaCobro implements Serializable{
    @SuppressWarnings("compatibility:5154273749411943722")
    private static final long serialVersionUID = 1L;
    private DatosOficRemisCpSigef destinatario;
    private CuentaCobroCp2017 cuentaCobro;
    public DestinatarioCuentaCobro() {
        super();
    }


    public DestinatarioCuentaCobro(DatosOficRemisCpSigef destinatario, CuentaCobroCp2017 cuentaCobro) {
        this.destinatario = destinatario;
        this.cuentaCobro = cuentaCobro;
    }

    public void setDestinatario(DatosOficRemisCpSigef destinatario) {
        this.destinatario = destinatario;
    }

    public DatosOficRemisCpSigef getDestinatario() {
        return destinatario;
    }

    public void setCuentaCobro(CuentaCobroCp2017 cuentaCobro) {
        this.cuentaCobro = cuentaCobro;
    }

    public CuentaCobroCp2017 getCuentaCobro() {
        return cuentaCobro;
    }

}
