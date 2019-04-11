package Objetos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Trabajador extends Cuenta {
   DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
   Date date = new Date();
   ArrayList<String> entradas=new ArrayList();
   ArrayList<String> salidas=new ArrayList();
   int atrazos=0;
   
    public Trabajador(String nombre,String contraseña) {
        super.nombreCuenta=nombre;
        super.contraseña=contraseña;
        
    }
    
    
    public void registrarEntrada(){
        entradas.add(date.toString());
    }
    
    public void registrarSalida(){
        salidas.add(date.toString());
    }
    
    public int verAtrazos(){
    return atrazos;
    }
    
}
