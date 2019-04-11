package Objetos;

import java.util.Date;

public class Cuenta {
    
    
    String nombreCuenta;
    String contraseña;
    Date fechaEntrada=new Date();
    Date HoraSalida=new Date();
    
    public String getNombreCuenta(){
        return nombreCuenta;
    }
    public void setNombreCuenta(String c){
        nombreCuenta=c;
    }
    public void setContraseñaCuenta(String c){
        contraseña=c;
    }
    
}
