package Reto1.modeloVistaControlador;


import javax.swing.*;
import java.util.Scanner;
public class SalarioNetoApp {

    public static void main(String[] args) {

        Empleado modelo= ingresarDatosEmpleado();
        EmpleadoVista vista= new EmpleadoVista();
        EmpleadoControlador controlador= new EmpleadoControlador(modelo, vista);

        controlador.actualizarVista();

    }

    private static Empleado ingresarDatosEmpleado() {
        //retorna  un objeto tipo empleado
        String inombre;
        int iedad;
        double isalario, iIncremento, iSalarioNeto;

       // Scanner sc= new Scanner(System.in);
       // System.out.print("Por favor escriba el nombre del Empleado");
       // inombre=sc.nextLine();
        //otra manera de hacer lo mismo

                                                                                                                                                                inombre="Miss ";
        inombre=inombre.concat(JOptionPane.showInputDialog("Por favor escriba el nombre del Empleado"));
        inombre=inombre.toUpperCase();
        boolean igual_al_mio="Paola".equalsIgnoreCase(inombre);


        //System.out.print("Por favor escriba la edad del Empleado");
        //iedad=sc.nextInt();
        iedad=Integer.parseInt(JOptionPane.showInputDialog("Por favor escriba la edad del Empleado"));

        isalario=Double.parseDouble(JOptionPane.showInputDialog("Por favor escriba el salario del Empleado"));

        Empleado emp= new Empleado(inombre,iedad,isalario);

        return emp;
    }
}
