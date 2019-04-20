/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Objetos.Administrador;
import Objetos.Cuenta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author envergador
 */
public class AdministradorTest {
    
    @Test
    public void setHorarioE(){
        boolean esperado=true;
        boolean resultado=true;
        Administrador.establecerHoraEntrada(4,20);
        if(Administrador.getHoraEntrada()!=4){
            resultado=false;
        } 
        if(Administrador.getMinutosEntrada()!=20){
            resultado=false;
        }
        assertEquals(esperado,resultado);
    
    }
    @Test
    public void setHorarioS(){
        boolean esperado=true;
        boolean resultado=true;
        Administrador.establecerHoraSalida(4,20);
        if(Administrador.getHoraSalida()!=4){
            resultado=false;
        } 
        if(Administrador.getMinutosSalida()!=20){
            resultado=false;
        }
        assertEquals(esperado,resultado);
    }
    
}
