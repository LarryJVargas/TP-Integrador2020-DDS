package Dominio;

public class DocumentoComercial {

    private TipoDocumentoComercial tipoDeDocumento;
    private Operacion operacion;




    public TipoDocumentoComercial getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDocumentoComercial tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }
}
