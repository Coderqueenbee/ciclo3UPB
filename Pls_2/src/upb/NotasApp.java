package upb;

import java.math.BigInteger;
import javax.swing.*;
//import mintic.edu.upb.mundo.Estudiante;

/**
 *
 * @author Carlos Beltrán
 */
public class NotasApp {

    // Declarar las variables globales
    int contEstudiantes = 0;
    // Crear un arreglo tipo Estudiante
    Estudiante estudiante [] = new Estudiante[10];


    public NotasApp() {
        // Crear un menú para gestionar las opciones del programa
        // Ingresar los datos
        // Mostrar los datps
        String opcion = "";
        int n = 0;
        do{
            opcion = JOptionPane.showInputDialog(null,"1. Ingresar Datos\n" +
                    "2.Mostrar Datos\n" +
                    "0.Salir\n" );
            if(opcion != null && !opcion.equals("")){
                n = Integer.parseInt(opcion);
                switch(n){
                    case 1:
                        ingresarDatos();
                        break;
                    case 2:
                        mostrarDatos();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opción No Valida","ERROR",JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
        }while (n!=0);
    }

    // Función para capturar los datos
    public void ingresarDatos(){
        // Declarar variables
        String nombre;
        String correo;
        String direccion;
        BigInteger telefono;
        double notaParcial = 0;
        double notaOtros = 0;
        nombre = JOptionPane.showInputDialog("Por favor escriba el nombre del Estudiante: ");
        correo = JOptionPane.showInputDialog("Por favor escriba el correo del Estudiante: ");
        direccion = JOptionPane.showInputDialog("Por favor escriba la dirección del Estudiante: ");
        telefono = new BigInteger(JOptionPane.showInputDialog("Por favor escriba el teléfono del Estudiante: "));
        while(true){
            try {
                notaParcial = Double.parseDouble(JOptionPane.showInputDialog("Por favor escriba la nota del parcial del Estudiante: "));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Solo Datos numéricos..","ERROR",JOptionPane.ERROR_MESSAGE);
                continue;
            }
        }
        try {
            notaOtros = Double.parseDouble(JOptionPane.showInputDialog("Por favor escriba la nota del Otros del Estudiante: "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Solo Datos numéricos..","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        // Instanciar un Objeto tipo Estudiante
        Estudiante temp = new Estudiante(nombre, correo, direccion, telefono, notaParcial, notaOtros);
        // Guardar el objeto en el arreglo
        estudiante[contEstudiantes] = temp;
        contEstudiantes++;
        JOptionPane.showMessageDialog(null, temp.toString());
    }

    // Función mostrarDatos()
    public void mostrarDatos(){
        //Mostrar los datos en un area de texto
        //Declarar un objeto de tipo JtextArea
        JTextArea taNotas= new JTextArea(); // PARA ESCRIBIR TEXTO AMPLIO LO QUE YO QUIERA
        String PRINT = "Nombre\tNota Otros\tNota Parcial\tDefinitiva\tMensaje\n";
        for (int i = 0;i < contEstudiantes;i++){
            PRINT += estudiante[i].getNombre() + " "
                    + estudiante[i].getNotaOtros() + " "
                    + estudiante[i].getNotaParcial()+ " "
                    + estudiante[i].calcularNotaFinal() + " "
                    + estudiante[i].mensajeNota()+"\n";
        }

        //Agregar el texto a mostrar en el JTextArea
        taNotas.setText(PRINT); // CON ESTE METODO AÑADO EL TEXTO
        //LOS COMPONENTES DEL SWING LO DEBO METER DENTRO DE FRAME O VENTANA-> JOPTIONPANEL
        // se crea objeto tipo JScrollPane para añadir el JTextArea
        JScrollPane scrollPane= new JScrollPane(taNotas);
        JOptionPane.showMessageDialog(null, scrollPane,"NOTAS", JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null, PRINT);
    }

    public static void main(String[] args) {
        // Llamamos al constructor para iniciar el proyecto con su código
        NotasApp notasApp = new NotasApp();
    }

}
