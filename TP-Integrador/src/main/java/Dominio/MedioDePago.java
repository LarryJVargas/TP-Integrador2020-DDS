package Dominio;

public class MedioDePago {

    private long identificador;
    private String nombreMedioDePago;




    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getNombreMedioDePago() {
        return nombreMedioDePago;
    }

    public void setNombreMedioDePago(String nombreMedioDePago) {
        this.nombreMedioDePago = nombreMedioDePago;
    }
}
