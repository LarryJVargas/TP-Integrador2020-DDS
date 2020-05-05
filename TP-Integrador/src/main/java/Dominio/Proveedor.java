package Dominio;

public class Proveedor {

    private String nombreDeProveedor;
    private String apellidoDeProveedor;
    private String razonSocial;
    private long dni;
    private String direccionPostal;


    public String getNombreDeProveedor() {
        return nombreDeProveedor;
    }

    public void setNombreDeProveedor(String nombreDeProveedor) {
        this.nombreDeProveedor = nombreDeProveedor;
    }

    public String getApellidoDeProveedor() {
        return apellidoDeProveedor;
    }

    public void setApellidoDeProveedor(String apellidoDeProveedor) {
        this.apellidoDeProveedor = apellidoDeProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }
}
