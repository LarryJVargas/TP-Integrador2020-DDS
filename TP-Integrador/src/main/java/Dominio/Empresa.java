package Dominio;

public class Empresa implements TipoDeEmpresa{

    private String actividad;
    private int cantidadDePersonal;
    private double ventaAnual;
    private TipoDeEmpresa tipoDeEmpresa;

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }


    public int getCantidadDePersonal() {
        return cantidadDePersonal;
    }

    public void setCantidadDePersonal(int cantidadDePersonal) {
        this.cantidadDePersonal = cantidadDePersonal;
    }

    public double getVentaAnual() {
        return ventaAnual;
    }

    public void setVentaAnual(double ventaAnual) {
        this.ventaAnual = ventaAnual;
    }

    public TipoDeEmpresa getTipoDeEmpresa() {
        return tipoDeEmpresa;
    }

    public void setTipoDeEmpresa(TipoDeEmpresa tipoDeEmpresa) {
        this.tipoDeEmpresa = tipoDeEmpresa;
    }

    @Override
    public void calcularTipoEmpresa() {

    }


}
