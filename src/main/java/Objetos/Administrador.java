package Objetos;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends Cuenta {
    
    public int VerAtrazos(Date[] entrada,Date[] salida){
        int contador=0;
        for(int i=0;i<entrada.length;i++){
            if(entrada[i].getTime()>super.fechaEntrada.getTime()){
                contador=contador+1;
            }
        }
        return contador;
    }
    
    public void establecerFechaEntrada(){
    
    }
}
