package Objetos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Trabajador extends Cuenta {
   DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
   Date date = new Date();
   Date[] entradas=new Date[100];
   Date[] salidas=new Date[100];
   int atrazos=0;
   int contador=0;
    public Trabajador(String nombre,String contraseña) {
        super.nombreCuenta=nombre;
        super.contraseña=contraseña;
        
    }
    
    
    public void registrarEntrada(){
        entradas[contador]=date;
        contador=contador+1;
    }
    
    public void registrarSalida(){
        salidas[contador]=date;
        contador=contador+1;
    }
    
    public int verAtrazos(){
    return atrazos;
    }
    
    public void atrazo(){
        atrazos=atrazos+1;
    }
    
}
