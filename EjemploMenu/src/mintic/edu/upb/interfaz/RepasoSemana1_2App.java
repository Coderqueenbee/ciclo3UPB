package mintic.edu.upb.interfaz;

import java.util.Scanner;
import mintic.edu.upb.mundo.Cliente;

public class RepasoSemana1_2App {

    public static void main(String[] args) {
        
        
       
    private static void ingresaDatos(int ntipo){
        long cedula;
        String nombre;
        int dias, tiempoCasados;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("cedula cliente");
        cedula= sc.nextLong();
        System.out.print("nombre cliente");
        nombre= sc.nextLine();
        System.out.print("numero dias de hospedaje cliente");
        dias= sc.nextInt();
        System.out.print("años casados");
       // tiempoCasados= sc.nextInt();
        
        //cl.setTipo(ntipo);
        Cliente cl= new  Cliente(cedula, nombre, ntipo,tiempoCasados, dias);
        System.out.println(cl.toString());
        
        
      //  catch(inputMissMatch e){
     //           System.out.print("Ingrese");
     //           }
        
        
    }

    }
    
    
    
}
