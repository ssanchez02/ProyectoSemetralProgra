package Objetos;

public class Administrador extends Cuenta {
    
    public Administrador(String NombreCuenta,String Contraseña){
            this.nombreCuenta=NombreCuenta;
            this.contraseña=Contraseña;
    }
    
    public int verAtrazos(Trabajador n){
        return n.verAtrazos();
    }
    
    public int verSalidasA(Trabajador n){
        return n.verSalidasA();
    }
    
    public void establecerHoraEntrada(int h,int m){
        setHoraEntrada(h);
        setMinutosEntrada(m);
    }
    
    public void establecerHoraSalida(int h,int m){
        setHoraESalida(h);
        setMinutosSalida(m);
    }
    
    public void verHorasEntradaSalida(){
        System.out.println("La hora de entrada es: "+super.horaEntrada+":"+super.minutosEntrada);
        System.out.println("La hora de salida es: "+super.horaSalida+":"+super.minutosSalida);
    }
    
    public void setHoraEntrada(int n){
        super.horaEntrada=n;
    }
    public void setMinutosEntrada(int n){
        super.minutosEntrada=n;
    }
    public int getHoraEntrada(){
        return super.horaEntrada;
    }
    public int getMinutosEntrada(){
        return super.minutosEntrada;
    }
    public void setHoraESalida(int n){
        super.horaSalida=n;
    }
    public void setMinutosSalida(int n){
        super.minutosSalida=n;
    }
    public int getHoraSalida(){
        return super.horaSalida;
    }
    public int getMinutosSalida(){
        return super.minutosSalida;
    }
    
    public void setNombreCuenta(String nombre){
        this.nombreCuenta=nombre;
    }
    public void setContraseña(String contra){
        this.contraseña=contra;
    }
}
