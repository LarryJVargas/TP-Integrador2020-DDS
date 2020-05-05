package Dominio;

public class OrganizacionBase extends Organizacion{

    private String descripcion;
    private String nombreFicticioBase;




    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreFicticioBase() {
        return nombreFicticioBase;
    }

    public void setNombreFicticioBase(String nombreFicticioBase) {
        this.nombreFicticioBase = nombreFicticioBase;
    }
}
