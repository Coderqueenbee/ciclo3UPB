/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.upb.fpoo.interfaz;
import java.util.Scanner;
import mintic.upb.fpoo.mundo.Empleado;

/**
 *
 * @author QueenBee
 */
public class EmpleadoApp {     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc= new Scanner(System.in);
    String inombre;
    int iedad,tiempocasados;
    char sexo;
    double isalario, iincremento,isalarioNeto;
    
    System.out.println("Introduzca nombre: ");
    inombre= sc.nextLine();
    System.out.println("Introduzca la edad: ");
    iedad= sc.nextInt();
    System.out.println("Introduzca valor del salario: ");
    isalario= sc.nextDouble();
    System.out.println("Introduzca genero: ");
    sexo= sc.next().charAt(0);
    System.out.println("Introduzca tiempo de casados: ");
    tiempocasados=Integer.parseInt(sc.next()) ;
    
    

    

    //sexo= sc.next().charAt(0));

    
    Empleado emp= new Empleado(inombre, iedad, isalario);
    emp.setNombre(inombre);
    emp.setEdad(iedad);
    emp.setSalario(isalario);
    
    
    if (emp.esMenorEdad()){
        System.out.println("El empleado " +inombre +" es menor de edad. No se manda: ");
    }else{
       iincremento=emp.calcularIncremento();
       isalarioNeto=emp.getSalario()+emp.calcularIncremento();
       System.out.println("  "+emp.toString() +"\n El nuevo salario es " +isalarioNeto);
       //control barra espaciadora
       
       
    }
    Empleado emp2= new Empleado(inombre, iedad, isalario);
    boolean esEmp1_2ig= emp2.equals(emp2);
    if (esEmp1_2ig){
      System.out.println(" Son el mismo empleado  "+emp.toString() +"\n y " +emp2.toString());}

         
    
    }//cierra main
    

    
}
