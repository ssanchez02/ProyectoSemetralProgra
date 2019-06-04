package Menu;

import Objetos.Administrador;
import Objetos.Trabajador;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static ArrayList<Administrador> adm = new ArrayList();
    private static ArrayList<Trabajador> trab = new ArrayList();

    public void inicio() {
        boolean estado = true;
        while (estado) {
            System.out.println("Inicio de sesión");
            System.out.println("1. Administrador");
            System.out.println("2. Empleado");
            System.out.println("3. Salir");
            int opcion = recibirValidarNumero();
            switch (opcion) {
                case 1:
                    menuAdministrador();
                    break;
                case 2:
                    menuEmpleado();
                    break;

                case 3:
                    estado = false;
                    break;

            }
        }
    }

    private static int recibirValidarNumero() {
        int num = 0;
        boolean estado = true;

        while (estado) {

            try {
                Scanner sc = new Scanner(System.in);

                num = sc.nextInt();
                estado = false;

            } catch (InputMismatchException e) {
                System.out.println("El caracter ingresado no es numerico o se encuentra fuera del rango establecido, intentelo nuevamente.");
                estado = true;
            }

        }
        return num;
    }

    private void menuAdministrador() {
        boolean estado = true;
        while (estado) {
            System.out.println("1. Crear cuenta de administrador");
            System.out.println("2. iniciar sesión de Administrador");
            System.out.println("3. atrás");
            int opcion = recibirValidarNumero();
            switch (opcion) {
                case 1:
                    crearCuentaA(adm);
                    break;
                case 2:
                    System.out.println("Ingrese nombre de cuenta");
                    String nombre = recibirPalabra();
                    System.out.println("Ingrese contraseña");
                    String contra = recibirPalabra();
                    int a = comprobarUsuarioConA(nombre, contra, adm);
                    if(a==-1){
                        System.out.println("Intente nuevamente");
                    }else{
                    menuAdministracion(a, adm);
                    }
                    break;
                case 3:
                    estado = false;
                    break;

            }
        }

    }

    private void crearCuentaA(ArrayList<Administrador> m) {
        String n = "1234";
        System.out.println("Ingrese la contraseña de super administrador");
        String contra = recibirPalabra();
        if (contra.equals(n)) {
            System.out.println("ingrese el nombre de la nueva cuenta");
            String nombre = recibirPalabra();
            System.out.println("Ingrese la contraseña de la nueva cuenta");
            String contraseña = recibirPalabra();
            Administrador a = new Administrador(nombre, contraseña);
            m.add(a);
            System.out.println("Cuenta creada con exito");
        } else {
            System.out.println("contraseña incorrecta");
        }
    }

    private static String recibirPalabra() {
        String num = " ";
        boolean estado = true;

        while (estado) {

            try {
                Scanner sc = new Scanner(System.in);

                num = sc.nextLine();
                estado = false;

            } catch (InputMismatchException e) {
                System.out.println("El caracter ingresado no es una palabra, intentelo nuevamente.");
                estado = true;
            }

        }
        return num;
    }

    private void menuEmpleado() {
        boolean estado = true;
        while (estado) {
            System.out.println("1. iniciar sesión de Empleado");
            System.out.println("2. atrás");
            int opcion = recibirValidarNumero();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre de cuenta");
                    String nombre = recibirPalabra();
                    System.out.println("Ingrese contraseña");
                    String contra = recibirPalabra();
                    int a = comprobarUsuarioConT(nombre, contra, trab);
                    if (a == -1) {
                        System.out.println("intente nuevamente");
                    } else {
                        menuRegistroES(a, trab);
                    }
                    break;
                case 2:
                    estado = false;
                    break;

            }
        }
    }

    private static int comprobarUsuarioConT(String nombre, String contra, ArrayList<Trabajador> m) {
        int posicion = -1;
        try{
        for (int i = 0; i < m.size(); i++) {
            if (nombre.equals(m.get(i).getNombreCuenta())) {
                if (contra.equals(m.get(i).getContraseña())) {
                    System.out.println("Sesion iniciada");
                    posicion = i;
                }
            }
        }
        if(posicion==-1){
        System.out.println("usuario o contraseña incorrecta");
        }
        }catch(IndexOutOfBoundsException e){
            System.out.println("no hay cuentas registras problablemente");
        }
        return posicion;

    }

    private static int comprobarUsuarioConA(String nombre, String contra, ArrayList<Administrador> m) {
        int posicion = -1;
        try{
        for (int i = 0; i < m.size(); i++) {
            if (nombre.equals(m.get(i).getNombreCuenta())) {
                if (contra.equals(m.get(i).getContraseña())) {
                    System.out.println("Sesion iniciada");
                    posicion = i;
                }
            }
        }
        if (posicion == -1) {
            System.out.println("usuario o contraseña incorrecta");
        }
        }catch(IndexOutOfBoundsException e){
            System.out.println("no hay cuentas registras problablemente");
        }
        return posicion;
    }

    private void menuRegistroES(int n, ArrayList<Trabajador> a) {
        boolean estado = true;
        while (estado) {
            System.out.println("1. Registrar entrada");
            System.out.println("2. Registrar salida");
            System.out.println("3. Cerrar sesión");
            int opcion = recibirValidarNumero();
            switch (opcion) {
                case 1:
                    a.get(n).registrarEntrada();
                    break;
                case 2:
                    a.get(n).registrarSalida();
                    break;
                case 3:
                    estado = false;
                    break;

            }
        }

    }

    private void menuAdministracion(int n, ArrayList<Administrador> m) {
        boolean estado = true;
        while (estado) {
            System.out.println("1. Administrar cuenta de empleado");
            System.out.println("2. Crear cuenta empleado");
            System.out.println("3. Ver registros");
            System.out.println("4. Administrar cuenta propia");
            System.out.println("5. Establecer horarios");
            System.out.println("6. Eliminar cuenta de empleado");
            System.out.println("7. Cerrar sesión");
            int opcion = recibirValidarNumero();
            switch (opcion) {
                case 1:
                    administrarCuentaE(trab);
                    break;
                case 2:
                    crearCuentaEmpleado(trab);
                    break;
                case 3:
                    verRegistros(trab);
                    break;
                case 4:
                    administrarCuentaA(n, m);
                    break;
                case 5:
                    establecerH(n, m);
                    break;
                case 6:
                    eliminarCuentaE(trab);
                    break;
                case 7:
                    estado = false;
                    break;

            }
        }
    }

    private void administrarCuentaA(int n, ArrayList<Administrador> m) {
        System.out.println("¿que desea cambiar?");
        System.out.println("1. Cambiar nombre de la cuenta");
        System.out.println("2. Cambiar contraseña de la cuenta");
        System.out.println("3. atrás");
        int j = recibirValidarNumero();
        switch (j) {
            case 1:
                System.out.println("Ingrese el nuevo nombre");
                String nombre = recibirPalabra();
                m.get(n).setNombreCuenta(nombre);
                break;
            case 2:
                System.out.println("Ingrese la nueva contraseña");
                String contra = recibirPalabra();
                m.get(n).setContraseña(contra);
            case 3:
                break;
        }

    }

    private void crearCuentaEmpleado(ArrayList<Trabajador> b) {
        System.out.println("Ingrese el nombre de la nueva cuenta");
        String nombre = recibirPalabra();
        System.out.println("Ingrese la contraseña de la nueva cuenta");
        String contra = recibirPalabra();
        Trabajador t = new Trabajador(nombre, contra);
        b.add(t);
    }

    private void verRegistros(ArrayList<Trabajador> b) {
        verEmpleados(b);
        System.out.println("¿De que empleado desea ver el registro? (ingrese su numero)");
        int n = recibirValidarNumero();
        try {
            System.out.println("Sus atrasos:");
            System.out.println(b.get(n).verAtrazos());
            System.out.println("Sus salidas anticipadas:");
            System.out.println(b.get(n).verSalidasA());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El empleado seleccionado no esta en la lista");
        }
    }

    private void administrarCuentaE(ArrayList<Trabajador> b) {
        verEmpleados(b);
        System.out.println("¿Que cuenta de empleado desea administrar? (ingrese su numero)");
        int n = recibirValidarNumero();
        try {
            System.out.println("¿Que desea cambiar?");
            System.out.println("1. Nombre cuenta");
            System.out.println("2. Contraseña cuenta");
            System.out.println("3. atrás");
            int m = recibirValidarNumero();
            switch (m) {
                case 1:
                    System.out.println("Ingrese nuevo nombre");
                    String nombre = recibirPalabra();
                    b.get(n).setNombreCuenta(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese nueva contraseña");
                    String contra = recibirPalabra();
                    b.get(n).setContraseña(contra);
                    break;
                case 3:
                    break;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El empleado seleccionado no esta en la lista");
        }
    }

    private void establecerH(int n, ArrayList<Administrador> b) {
        System.out.println("Ingrese el horario de entrada");
        System.out.println("La hora");
        int he = recibirValidarNumero();
        System.out.println("Los minutos");
        int me = recibirValidarNumero();
        b.get(n).establecerHoraEntrada(he, me);
        System.out.println("Ingrese el horario de salida");
        System.out.println("La hora");
        int hs = recibirValidarNumero();
        System.out.println("Los minutos");
        int ms = recibirValidarNumero();
        b.get(n).establecerHoraSalida(hs, ms);
    }

    private void verEmpleados(ArrayList<Trabajador> m) {
        for (int i = 0; i < m.size(); i++) {
            System.out.println(i + ". " + m.get(i).getNombreCuenta());
        }
    }

    private void eliminarCuentaE(ArrayList<Trabajador> b) {
        verEmpleados(b);
        System.out.println("Ingrese el numero de cuenta que desea eliminar");
        int n = recibirValidarNumero();
        try {
            b.remove(n);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El empleado seleccionado no esta en la lista");
        }
    }
}
