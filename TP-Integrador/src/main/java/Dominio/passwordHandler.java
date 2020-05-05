package Dominio;

import sun.security.util.Password;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class passwordHandler {

    private Contrasenia contrasenia = new Contrasenia();
    private File archivoTopContraseniasMasUsadas; //"D:\\SecLists-master\\SecLists-master\\Passwords\\darkweb2017-top10000.txt"
    private int minimoDeNumerosContrasenia;
    private int longitudAceptableContrasenia;
    private int minimoDeMayusculasContrasenia;


    public static boolean validarContrasenia(Contrasenia contrasenia, File archivoTopContraseniasMasUsadas, int longitudAceptableContrasenia,int minimoDeNumerosContrasenia, int minimoDeMayusculasContrasenia){
        if(estaVigente(contrasenia) && noEstaEnArchivoContraseniasUsadas(archivoTopContraseniasMasUsadas,contrasenia.getContrasenia()) && esCompleja(longitudAceptableContrasenia,minimoDeNumerosContrasenia,minimoDeMayusculasContrasenia,contrasenia.getContrasenia())){
            return true;
            //System.out.println("La contraseña es valida");

        }else{
            return false;
            //System.out.println("La contraseña NO es valida");
        }
    }

    public static boolean noEstaEnArchivoContraseniasUsadas(File unArchivo, String password){
        unArchivo = new File(String.valueOf(unArchivo));
        password = password;

        try{
            if (unArchivo.exists()){
                BufferedReader leerArchivo = new BufferedReader(new FileReader(unArchivo));
                String lineaLeida;
                while ((lineaLeida = leerArchivo.readLine()) != null){

                    String[] palabras = lineaLeida.split(" ");

                    for (int i = 0 ;i < palabras.length ; i++){

                        if (palabras[i].equals(password)){
                            return false;
                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }


    public static boolean esCompleja(int unaLongitud, int unMinimoDeNumeros, int unMinimoDeMayusculas,String password){
         if(tieneLargoAceptable(unaLongitud,password) &&
         tieneMinimoDeNumeros(unMinimoDeNumeros,password) &&
         tieneMinimoDeMayusculas(unMinimoDeMayusculas,password)){
             return true;
         }else {
             return false;
         }
    }


    public static boolean tieneLargoAceptable(int unaLongitud, String password){
        if(password.length() >= unaLongitud){
            return true;
        }else{
            return false;
        }
    }


    public static boolean tieneMinimoDeNumeros(int unMinimoDeNumeros,String password){
        int cantidadNumeros = 0;
        char caracter;

        for(int i = 0 ; i < password.length() ; i++){
            caracter = password.charAt(i);
            String caracterValue = String.valueOf(caracter);
            if(caracterValue.matches("[0-9]")) {
                cantidadNumeros++;
            }
        }
        if (cantidadNumeros >= unMinimoDeNumeros){
            return true;
        }else {
            return false;
        }
    }


    public static boolean tieneMinimoDeMayusculas(int unMinimoDeMayusculas, String password){
        int cantidadMayusculas = 0;
        char caracter;

        for(int i = 0 ; i < password.length() ; i++){
            caracter = password.charAt(i);
            String caracterValue = String.valueOf(caracter);
            if (caracterValue.matches("[A-Z]")){
                cantidadMayusculas++;
            }
        }
        if (cantidadMayusculas >= unMinimoDeMayusculas){
            return true;
        }else {
            return false;
        }
    }

    public static boolean estaVigente(Contrasenia contrasenia){

        if(contrasenia.getFechaAltaDeContrasenia().before(contrasenia.getFechaLimite())){
            return true;
        }else {
            if(contrasenia.getFechaAltaDeContrasenia().after(contrasenia.getFechaLimite())){
                return false;
            }else {
                return false;
            }

        }

    }

}
