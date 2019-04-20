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
    
    public static void establecerHoraEntrada(int h,int m){
        setHoraEntrada(h);
        setMinutosEntrada(m);
    }
    
    public static void establecerHoraSalida(int h,int m){
        setHoraESalida(h);
        setMinutosSalida(m);
    }
    
    public void verHorasEntradaSalida(){
        System.out.println("La hora de entrada es: "+Cuenta.horaEntrada+":"+Cuenta.minutosEntrada);
        System.out.println("La hora de salida es: "+Cuenta.horaSalida+":"+Cuenta.minutosSalida);
    }
    
    public static void setHoraEntrada(int n){
        Cuenta.horaEntrada=n;
    }
    public static void setMinutosEntrada(int n){
        Cuenta.minutosEntrada=n;
    }
    public static  int getHoraEntrada(){
        return Cuenta.horaEntrada;
    }
    public static int getMinutosEntrada(){
        return Cuenta.minutosEntrada;
    }
    public static void setHoraESalida(int n){
        Cuenta.horaSalida=n;
    }
    public static void setMinutosSalida(int n){
        Cuenta.minutosSalida=n;
    }
    public static int getHoraSalida(){
        return Cuenta.horaSalida;
    }
    public static int getMinutosSalida(){
        return Cuenta.minutosSalida;
    }
    
    public void setNombreCuenta(String nombre){
        this.nombreCuenta=nombre;
    }
    public void setContraseña(String contra){
        this.contraseña=contra;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public String getContraseña() {
        return contraseña;
    }
    
}
