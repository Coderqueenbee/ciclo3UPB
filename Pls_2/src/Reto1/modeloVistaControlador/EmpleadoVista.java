package Reto1.modeloVistaControlador;

import javax.swing.*;

public class EmpleadoVista {
    // método que permita al usuario ver los datos del empleado
    public void imprimirDatosEmpleado(String nombre, int edad, double salario, double incremento, double salarioNeto){


        JTextArea taDatos= new JTextArea(); // PARA ESCRIBIR TEXTO AMPLIO LO QUE YO QUIERA
        String PRINT = "Datos del Empleado\"\tNombre\tEdad\tSalario\tIncremento\tSalario Neto\n";

        PRINT +=nombre+" "+edad+" años "+salario+" "+incremento+" "+salarioNeto;

        taDatos.setText(PRINT);
        JScrollPane scrollPane= new JScrollPane(taDatos);
        JOptionPane.showMessageDialog(null, scrollPane,"datos", JOptionPane.INFORMATION_MESSAGE);


        String[] valoresDisponibles = {"Portero", "Defensa", "Mediocampista", "Delantero"};

        String demarcacion = "";
        //JOp..showInput(null,"Mensaje","tituloVentana",ModeloVentana,icono,objeto(arreglo),Valorpor defecto)
        demarcacion = (String)JOptionPane.showInputDialog(null,"Selecciona la posición en la que\njuega el Futbolista"
                ,"Posición de Juego",JOptionPane.INFORMATION_MESSAGE,null,
                valoresDisponibles,valoresDisponibles[1]);
        // Crear el objeto Futbolista


       /* JOptionPane.showMessageDialog(null,"***********************************" );
        JOptionPane.showMessageDialog(null,"        Datos del Empleado" );
        JOptionPane.showMessageDialog(null,"Nombre      : "+nombre);
        JOptionPane.showMessageDialog(null,"Edad        : "+edad+ " Años");
        JOptionPane.showMessageDialog(null,"Salario     : "+salario);
        JOptionPane.showMessageDialog(null,"Incremento  : "+incremento);
        JOptionPane.showMessageDialog(null,"Salario Neto: "+salarioNeto);
        JOptionPane.showMessageDialog(null,"***********************************");*/
        System.out.println("***********************************");
        System.out.println("        Datos del Empleado");
        System.out.println("***********************************");
        System.out.println("Nombre      : "+nombre);
        System.out.println("Edad        : "+edad+ " Años");
        System.out.println("Salario     : "+salario);
        System.out.println("Incremento  : "+incremento);
        System.out.println("Salario Neto: "+salarioNeto);
        System.out.println("***********************************");
    }
}



