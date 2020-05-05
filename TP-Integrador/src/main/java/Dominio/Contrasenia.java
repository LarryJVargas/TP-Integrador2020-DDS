package Dominio;

import java.util.Calendar;
import java.util.Date;

public class Contrasenia {

    private String contrasenia;
    private Date fechaAltaDeContrasenia;
    private Date fechaLimite;
    private int cantDiasParaRotacion;

   public void setFechaLimite(Date fechaAltaDeContrasenia , int cantDiasParaRotacion ){
     this.fechaLimite = sumarDiasAFecha(fechaAltaDeContrasenia , cantDiasParaRotacion);
   }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public static Date sumarDiasAFecha(Date fecha, int dias){
        if (dias==0) return fecha;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFechaAltaDeContrasenia() {
        return fechaAltaDeContrasenia;
    }

    public void setFechaAltaDeContrasenia() {
        this.fechaAltaDeContrasenia = new Date();
    }
}
