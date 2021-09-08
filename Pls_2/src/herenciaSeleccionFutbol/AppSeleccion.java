package herenciaSeleccionFutbol;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AppSeleccion {

    // Atributos globales
    // Declaramos y Creamos la lista dinámica que nos permite almacenar los objetos tipo SeleccionFutbol
    ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public AppSeleccion() {
        // Construir el menú
        String opcion = "";
        int n = 0;
        do{
            opcion = JOptionPane.showInputDialog(null,
                    "1. Ingresar Datos del Entrenador\n" +
                            "2. Ingresar Datos del Futbolista\n" +
                            "3. Ingresar Datos del Masajista\n" +
                            "4. Comenzar Concentración\n" +
                            "5. Ver Datos de Selecccion\n" +
                            "0. Salir\n");
            if(opcion != null && !opcion.equals("")){
                n = Integer.parseInt(opcion);
                switch(n){
                    case 1:
                        ingresarTecnico();
                        break;
                    case 2:
                        ingresarFutbbolista();
                        break;
                    case 3:
                        ingresarMasajista();
                        break;
                    case 4:
                        iniciaConcentracion();
                        break;
                    case 5:
                        verSeleccion();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"No es una Opción Válida..\nReintente","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }while ( n != 0);
    }

    public static void main(String[] args) {
        AppSeleccion appSeleccion = new AppSeleccion();
    }

    private void ingresarTecnico() {
        // 1. Declarar Variables
        int id = 0, edad = 0;
        String nombre = "", apellidos = "",idFederacion = "";
        // Captura de Datos
        id = Integer.parseInt(JOptionPane.showInputDialog("Escriba el Id del Técnico"));
        nombre = JOptionPane.showInputDialog("Escriba el nombre del Técnico");
        apellidos = JOptionPane.showInputDialog("Escriba los Apellidos del Técnico");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba la Edad del Técnico"));
        idFederacion = JOptionPane.showInputDialog("Escriba el Id de la Federación a la que pertenece el Técnico");
        // Construir un objeto Entrenador
        Entrenador temp = new Entrenador(idFederacion, id, nombre, apellidos, edad);
        // Grabar el dato en el ArrayList
        // nombrearreglo.add(objeto)
        integrantes.add(temp);
        JOptionPane.showMessageDialog(null,temp.toString(),"Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE);
    }

    private void ingresarFutbbolista() {
        // 1. Declarar Variables
        int id = 0, edad = 0, dorsal = 0;
        String nombre = "", apellidos = "",demarcacion = "";
        // Captura de Datos
        id = Integer.parseInt(JOptionPane.showInputDialog("Escriba el Id del Futbolista"));
        nombre = JOptionPane.showInputDialog("Escriba el nombre del Futbolista");
        apellidos = JOptionPane.showInputDialog("Escriba los Apellidos del Futbolista");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba la Edad del Futbolista"));
        dorsal = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número de la camiseta del Futbolista"));
        // Captura de un valor String usando un arreglo en JOptionPane
        // Declarar e inicializar el arreglo
        String[] valoresDisponibles = {"Portero", "Defensa", "Mediocampista", "Delantero"};
        //JOp..showInput(null,"Mensaje","tituloVentana",ModeloVentana,icono,objeto(arreglo),Valorpor defecto)
        demarcacion = (String)JOptionPane.showInputDialog(null,"Selecciona la posición en la que\njuega el Futbolista"
                ,"Posición de Juego",JOptionPane.INFORMATION_MESSAGE,null,
                valoresDisponibles,valoresDisponibles[1]);
        //ventana desplegable   von los valores que van a salir, valor que sale por defecto

        // Crear el objeto Futbolista
        Futbolista temp = new Futbolista(dorsal, demarcacion, id, nombre, apellidos, edad);
        // Añadirlo al ArrayList
        integrantes.add(temp);
        JOptionPane.showMessageDialog(null,temp.toString(),"Datos del Futbolista",JOptionPane.INFORMATION_MESSAGE);
    }

    private void ingresarMasajista() {
        // 1. Declarar Variables
        int id = 0, edad = 0, aniosExperiencia = 0;
        String nombre = "", apellidos = "",titulacion = "";
        // Captura de Datos
        id = Integer.parseInt(JOptionPane.showInputDialog("Escriba el Id del Masajista"));
        nombre = JOptionPane.showInputDialog("Escriba el nombre del Masajista");
        apellidos = JOptionPane.showInputDialog("Escriba los Apellidos del Masajista");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba la Edad del Masajista"));
        titulacion = JOptionPane.showInputDialog("Escriba el Título Académico del Masajista");
        aniosExperiencia = Integer.parseInt(JOptionPane.showInputDialog("Escriba los años de Experiencia profesional del Masajista"));
        // Crear el objeto
        Masajista temp = new Masajista(titulacion, aniosExperiencia, id, nombre, apellidos, edad);
        // Añadimos al Array el objeto Masajista
        integrantes.add(temp);
        JOptionPane.showMessageDialog(null,temp.toString(),"Datos del Masajista",JOptionPane.INFORMATION_MESSAGE);
    }

    private void iniciaConcentracion() {
        String print = "Todos los integrantes se Concentran (Mismo Método)\n";
        // for each
        for (SeleccionFutbol integrante :integrantes){
            print += integrante.getNombre() + " " + integrante.getApellidos();
            print += " ---> " + integrante.concentrarse()+"\n";
        }

        // for normal
//        for(int i = 0; i < integrantes.size();i++){
//            print += integrantes.get(i).getApellidos() + " " + integrantes.get(i).getNombre();
//            print += " ---> " + integrantes.get(i).concentrarse()+"\n";
//        }
        JOptionPane.showMessageDialog(null,print,"Datos de la Selección",JOptionPane.INFORMATION_MESSAGE);
    }

    private void verSeleccion() {
        String print = "Listado de Datos de Selección\n";
        // for each
        int ubicacion = 1;
        for (SeleccionFutbol integrante :integrantes){
            String tempo = "" + ubicacion++ + "-" + integrante.getId() + " " +
                    integrante.getNombre() + " " + integrante.getApellidos() + "\n";
            if(tempo.length()>= 25){
                tempo = tempo.substring(0, 25);
            }
            print += tempo;
        }
        JOptionPane.showMessageDialog(null,print,"Datos de la Selección",JOptionPane.INFORMATION_MESSAGE);

    }

}
