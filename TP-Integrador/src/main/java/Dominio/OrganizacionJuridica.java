package Dominio;

import java.util.List;

public class OrganizacionJuridica extends Organizacion{

    private String codigoIGJ;
    private long cuit;
    private String direccionPostal;
    private String nombreFicticioJuridico;
    private String razonSocial;
    private List<OrganizacionBase> organizacionesBase;



    public String getCodigoIGJ() {
        return codigoIGJ;
    }

    public void setCodigoIGJ(String codigoIGJ) {
        this.codigoIGJ = codigoIGJ;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getNombreFicticioJuridico() {
        return nombreFicticioJuridico;
    }

    public void setNombreFicticioJuridico(String nombreFicticioJuridico) {
        this.nombreFicticioJuridico = nombreFicticioJuridico;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
