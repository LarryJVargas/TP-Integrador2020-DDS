package Dominio;

public class Item {

    private double codigoItem;
    private String descripcion;
    private TipoItem tipo;
    private long valorTotal;





    public double getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(double codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    public long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }
}
