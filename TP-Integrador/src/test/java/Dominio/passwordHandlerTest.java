package Dominio;

import org.junit.Test;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.*;

public class passwordHandlerTest {


    //private String contrasenia;
    //private File archivoTopContraseniasMasUsadas; //"D:\\SecLists-master\\SecLists-master\\Passwords\\darkweb2017-top10000.txt"
    //private Date fechaAltaDeContrasenia;
    //private int minimoDeNumerosContrasenia;
    //private int longitudAceptableContrasenia;
    //private int minimoDeMayusculasContrasenia;

    @Test
    public void validarContrasenia() {
        Contrasenia contrasenia = new Contrasenia();
        contrasenia.setContrasenia("L1ar2ryj");
        contrasenia.setFechaAltaDeContrasenia();
        contrasenia.setFechaLimite(new Date(), 180);
        File archivo = new File("    D:\\\\SecLists-master\\\\SecLists-master\\\\Passwords\\\\darkweb2017-top10000.txt\"\n");
        int minimoDeNumerosContrasenia = 2;
        int longitudAceptableContrasenia = 8;
        int minimoDeMayusculasContrasenia = 1;
        assertTrue(passwordHandler.validarContrasenia(contrasenia,archivo,longitudAceptableContrasenia,minimoDeNumerosContrasenia,minimoDeMayusculasContrasenia));

    }

    @Test
    public void noEstaEnArchivoContraseniasUsadasTest () {
        Contrasenia contrasenia = new Contrasenia();
        contrasenia.setContrasenia("L1ar2ryj");
        File archivo = new File("    D:\\\\SecLists-master\\\\SecLists-master\\\\Passwords\\\\darkweb2017-top10000.txt\"\n");
        assertTrue(passwordHandler.noEstaEnArchivoContraseniasUsadas(archivo,contrasenia.getContrasenia()));
    }

    @Test
    public void esCompleja() {
        Contrasenia contrasenia = new Contrasenia();
        contrasenia.setContrasenia("L1ar2ryj");
        int minimoDeNumerosContrasenia = 2;
        int longitudAceptableContrasenia = 8;
        int minimoDeMayusculasContrasenia = 1;
        assertTrue(passwordHandler.esCompleja(longitudAceptableContrasenia,minimoDeNumerosContrasenia,minimoDeMayusculasContrasenia,contrasenia.getContrasenia()));
    }

    @Test
    public void tieneLargoAceptable() {
        Contrasenia contrasenia = new Contrasenia();
        contrasenia.setContrasenia("L1ar2ryj");
        int longitudAceptableContrasenia = 8;
        assertTrue(passwordHandler.tieneLargoAceptable(longitudAceptableContrasenia,contrasenia.getContrasenia()));
    }

    @Test
    public void tieneMinimoDeNumeros() {
        Contrasenia contrasenia = new Contrasenia();
        contrasenia.setContrasenia("L1ar2ryj");
        int minimoDeNumerosContrasenia = 2;
        assertTrue(passwordHandler.tieneMinimoDeNumeros(minimoDeNumerosContrasenia,contrasenia.getContrasenia()));

    }

    @Test
    public void tieneMinimoDeMayusculas() {
        Contrasenia contrasenia = new Contrasenia();
        contrasenia.setContrasenia("L1ar2ryj");
        int minimoDeMayusculasContrasenia = 1;
        assertTrue(passwordHandler.tieneMinimoDeMayusculas(minimoDeMayusculasContrasenia,contrasenia.getContrasenia()));

    }
}