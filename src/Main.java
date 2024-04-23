import jdk.jshell.spi.ExecutionControl;
import punto1.ClaseA;
import punto1.ClaseB;
import punto1.ClaseC;
import punto2.EAsalariado;
import punto2.EComision;
import punto2.Empleado;
import punto2.EmpresaXYZ;
import punto3.DiscoFlexible;
import punto3.Flujo;
import punto4.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Ingrese el ejercicio");
            switch(scanner.nextInt()){
                case 1:
                    punto1();
                    break;
                case 2:
                    punto2();
                    break;
                case 3:
                    punto3();
                    break;
                case 4:
                    punto4();
                    break;
                default:
                    System.out.println("flashaste wachin");
                    break;
            }
            System.out.println("n para cortar");
        }while(scanner.next().charAt(0)!='n');
    }
    public static void punto1(){
        ClaseA a;
        ClaseB b = new ClaseB();
        ClaseC c = new ClaseC();
        System.out.print( "Métodos llamados con objeto b desde");
        System.out.println("referencia de la clase A");
        a = b;
        a.dinamica();
        a.estatica();
        System.out.print( "Métodos llamados con objeto c desde");
        System.out.println(" referencia de la clase A");
        a = c;
        a.dinamica();
        a.estatica();
        //DINAMICA DESDE B,STATICA DE A.DINAMICA DE C, ESTATICA DE A
    }
    public static void punto2(){
        Empleado empleado=new EAsalariado("569587A","Javier","Gomez",2008,1225.0);
        Empleado empleado1=new EComision("695235B","Eva","Nieto",2010,179,8.1);
        EComision empleado2=new EComision();
        empleado2.setNombre("Jose");empleado2.setApellidos("Ruiz");empleado2.setAnioIngreso(2012);empleado2.setNumeroDeClientesCaptados(81);empleado2.setMontoPorCliente(7.9);empleado2.setDni("741258C");
        EAsalariado empleado3=new EAsalariado();
        empleado3.setDni("896325D");empleado3.setNombre("Maria");empleado3.setApellidos("Nuniez");empleado3.setAnioIngreso(2013);empleado3.setSueldoBasico(1155.0);
        EmpresaXYZ empresaXYZ=new EmpresaXYZ();
        empresaXYZ.agregarEmpleado(empleado);empresaXYZ.agregarEmpleado(empleado1);empresaXYZ.agregarEmpleado(empleado2);empresaXYZ.agregarEmpleado(empleado3);
        mostrarTodos(empresaXYZ.getEmpleadoList());
        mayorSueldo(empresaXYZ.getEmpleadoList());
    }
    public static void mayorSueldo(ArrayList<Empleado> empleados){
        Empleado empleado=empleados.stream().max(Comparator.comparing(Empleado::obtenerSalario)).orElse(null);
        System.out.println("El que mas cobra: ");
        empleado.imprimir();
    }
    public static void mostrarTodos(ArrayList<Empleado> empleados){empleados.forEach(Empleado::imprimir);}
    public static void punto3(){
        DiscoFlexible dc = new DiscoFlexible();
        Flujo f = dc;
        f.escribe("ab");
        //ESCRIBE DISCO FLEXIBLE ESCRIBE DE FLUJO AB
        //si pero escribe de flujo llama a escribir de disco, ya que este se Overridea en Disco porque es abstracto
    }
    public static void punto4(){
        Plantel plantel=new Plantel();
        Entrenador entrenador=new Entrenador("Entrenador","Entrenador","mar del tuyu", 25,3);
        Entrenador entrenador1=new Entrenador();
        SoporteTecnico soporteTecnico=new SoporteTecnico();
        SoporteTecnico soporteTecnico1=new SoporteTecnico("soporte","tecnico","mar de las pampas", 30,"mouse");
        SoporteTecnico soporteTecnico2=new SoporteTecnico();
        Jugadores jugadores=new Jugadores("ivi","maldivi","mardel",23,Posiciones.SOPORTE,"ivi",1);
        Jugadores jugadores1=new Jugadores("gordo", "regordo", "mardel", 23,Posiciones.TIRADOR,"lauGordo", 5);
        Jugadores jugadores2=new Jugadores("ivi","maldivi","mardel",23,Posiciones.SOPORTE,"ivi",1);
        plantel.agregarPersonal(entrenador);plantel.agregarPersonal(entrenador1);plantel.agregarPersonal(soporteTecnico);plantel.agregarPersonal(soporteTecnico1);plantel.agregarPersonal(soporteTecnico2);plantel.agregarPersonal(jugadores);plantel.agregarPersonal(jugadores1);plantel.agregarPersonal(jugadores2);plantel.agregarPersonal(new DiscoFlexible());
        System.out.println("Todo el personal");
        plantel.mostrarPersonal();
        System.out.println("Personal especifico");
        plantel.mostrarEspecifico(soporteTecnico.getClass());
        System.out.println("cantidad de victorias "+plantel.cantidadDeVictorias());
    }
}