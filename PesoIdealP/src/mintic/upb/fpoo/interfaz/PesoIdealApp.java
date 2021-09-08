package mintic.upb.fpoo.interfaz;

import java.util.Scanner;
import mintic.upb.fpoo.mundo.Persona;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fredy
 */
public class PesoIdealApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        // Declarar las variables a usar
        String nombre, cedula;
        int edad;
        char sexo;
        double peso, altura;
        // Captura de Datoscc
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Por favor escriba la cedula de la Persona ");
        cedula = sc.nextLine();
        System.out.print("Por favor escriba el nombre de la Persona ");
        nombre = sc.nextLine();
        System.out.print("Por favor escriba la edad de la Persona ");
        edad = sc.nextInt();
        System.out.print("Por favor escriba el sexo de la Persona usando la letra que lo representa H:Hombre Ã³ M:Mujer ");
        sexo = sc.next().charAt(0);
        System.out.print("Por favor escriba el peso en Kilogramos de la Persona ");
        peso = sc.nextDouble();
        System.out.print("Por favor escriba la estatura en Metros de la Persona ");
        altura = sc.nextDouble();
        // Crear el objeto Persona. TipodeDato variable = new Constructor
        Persona p = new Persona(cedula, nombre, sexo, edad, peso, altura);
        System.out.println(""+p.toString());*/
        String cedula1 = "63124512";
        String nombre1 = "Fernando Jose";
        int edad1 = 35;
        char sexo1 = 'H';
       Persona p1 = new Persona(cedula1, nombre1, sexo1, edad1);
       System.out.println(""+p1.toString());
        
        
        //ARRAYS
       // int [][] matriz= new int [4][5];
       // matriz[1][0]=15;
        int [][] matriz= {
                          {1,2,3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15}};
        for (int i = 0;i<3;i++){
            System.out.println();
             for (int j = 0;j<5;j++){
                 System.out.print(""+matriz[i][j]+" ");
                 }    
        }
             
        //bucle for each
        for (int fila[]:matriz){
             System.out.println();       
             for (int z: fila){
                 System.out.print(""+z+" ");
                 } 
        }
        
        
        
        
        
        
        
        
        
                // TODO code application logic here
    }
    
}
