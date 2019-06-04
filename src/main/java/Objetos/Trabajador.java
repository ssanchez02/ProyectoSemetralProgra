package Objetos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Trabajador extends Cuenta {

    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    Date date = new Date();
    private Date[] entradas = new Date[100];
    private Date[] salidas = new Date[100];
    private int atrazos = 0;
    private int contador = 0;
    private int salidaAnticipada=0;

    public Trabajador(String nombre, String contraseña) {
        super.nombreCuenta = nombre;
        super.contraseña = contraseña;

    }

    public void registrarEntrada() {
        LocalDateTime ahora = LocalDateTime.now();
        entradas[contador] = date;
        contador = contador + 1;
        if (super.horaEntrada < ahora.getHour()) {
            atrazo();
        } else if (super.horaEntrada == ahora.getHour()) {
            if (super.minutosEntrada < ahora.getMinute()) {
                atrazo();
            } 
        }
    }

    public void registrarSalida() {
        LocalDateTime ahora = LocalDateTime.now();
        salidas[contador] = date;
        contador = contador + 1;
        if (super.horaSalida > ahora.getHour()) {
            salidaA();
        } else if (super.horaSalida == ahora.getHour()) {
            if (super.minutosSalida > ahora.getMinute()) {
                salidaA();
            } 
        }
    }

    public int verAtrazos() {
        return atrazos;
    }
    
    public int verSalidasA() {
        return salidaAnticipada;
    }

    public void atrazo() {
        atrazos = atrazos + 1;
    }
    public void salidaA() {
        salidaAnticipada = salidaAnticipada + 1;
    }
    public String getNombreCuenta() {
        return this.nombreCuenta;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    

}
