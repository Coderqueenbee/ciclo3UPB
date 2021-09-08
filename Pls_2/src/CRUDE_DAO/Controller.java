package CRUDE_DAO;


import CRUDE_DAO.modelo.Empleado;
import CRUDE_DAO.modelo.EmpleadoDTO;

/** controller lleva el control del programa
 *
 * @author Carlos Beltrán
 */
public class Controller {

    // Variables Globales
    private VistaConsola vista;
    private EmpleadoDTO instituto;

    public Controller() {
        // CREO LOS OBJETOS
        vista = new VistaConsola();
        // El instituto es el DTO en instituto se crea el enlace entre LA VISTA O INTERFAZ Y EL DAO BASE DE DATOS
        instituto = new EmpleadoDTO();
        // LLAMAMOS AL MENU PRINCIPLA EN EL CONSTRUCTOR
        menuPrincipal();
    }

    private void menuPrincipal() {

        int opcion = 0;
        // EN UNA VARIABLE PONGO TODO EL TEXTO QUE QUIERO QUE APAREZCA
        //RETO NUMERO DOS DE LA UNIVERSIDAD DEL BOSQUE
        String menu = "INSTITUTO LA FLORESTA" + "\n" +
                "Seleccione la tarea a realizar:" + "\n" +
                "1. Ingresar empleado" + "\n" +
                "2. Buscar empleado" + "\n" +
                "3. Modificar empleado" + "\n" +
                "4. Eliminar empleado" + "\n" +
                "5. Ver directorio de empleados" + "\n" +
                "6. Salir" + "\n" +
                "Opción: ";
        do{
            opcion = vista.leerDatoEntero(menu);
            switch(opcion){
                case 1:
                    ingresarEmpleado();
                    break;
                case 2:
                    buscarEmpleado();
                    break;
                case 3:
//                    modificarEmpleado();
                    break;
                case 4:
                    eliminarEmpleado();
                    break;
                case 5:
                    mostrarDirectorio();
                    break;
                case 6:
                    vista.mostrarInformacion("\nHasta Pronto");
                    break;
                default:
                    vista.mostrarInformacion("\nError: Opción No Válida...");
            }
        }while( opcion != 6);
    }

    private void ingresarEmpleado() {
        String nombres, apellidos, fechaIngreso, correoEmpresa, correoPersonal, dependencia;
        long telefonoCelular, telefonoFijo;
        vista.mostrarInformacion("\nIngresar Empleado");
        nombres = vista.leerDatoString("Ingresar Nombres: ");
        apellidos = vista.leerDatoString("Ingresar Apellidos: ");
        fechaIngreso = vista.leerDatoString("Ingresar Fecha de Ingreso (YYYY-MM-DD): ");
        correoEmpresa = vista.leerDatoString("Ingresar Correo de la Empresa: ");
        correoPersonal = vista.leerDatoString("Ingresar Correo Personal: ");
        telefonoCelular = vista.leerDatoLong("Ingresar Número de Celular: ");
        telefonoFijo = vista.leerDatoLong("Ingresar Número Fijo: ");
        dependencia = vista.leerDatoString("Ingresar dependencia: ");

        if(instituto.getEmpleadoDAO().agregarEmpleado(nombres, apellidos, fechaIngreso,
                correoEmpresa, correoPersonal, telefonoCelular, telefonoFijo, dependencia,
                instituto.getEmpleados())){
            vista.mostrarInformacion("Empleado creado con éxito..");
        }else {
            vista.mostrarInformacion("No fue posible crear el empleado");
        }

    }

    private void mostrarDirectorio() {
        vista.mostrarInformacion("\nEl directorio de los Empleados");
        vista.mostrarInformacion(instituto.getEmpleadoDAO().verEmpleados(instituto.getEmpleados()));
    }

    private void buscarEmpleado() {
        String correoEmpesa="";
        vista.mostrarInformacion("\nBuscar Empleado");
        correoEmpesa = vista.leerDatoString("Ingresar Correo Empresa: ");
        Empleado rta = instituto.getEmpleadoDAO().buscarEmpleado(correoEmpesa, instituto.getEmpleados());
        if(rta != null){
            vista.mostrarInformacion(rta.toString());
        }else{
            vista.mostrarInformacion("El empleado no se encunra registrado en el Instituto..");
        }

    }

    private void eliminarEmpleado() {
        String correoEmpresa = "";
        vista.mostrarInformacion("\nEliminar Empleado");
        correoEmpresa = vista.leerDatoString("Ingresar Correo Empresa: ");
        if(instituto.getEmpleadoDAO().eliminarEmpleado(correoEmpresa, instituto.getEmpleados())){
            vista.mostrarInformacion("El empleado fue eliminado con éxito..");
        }else {
            vista.mostrarInformacion("El empleado no se encunra registrado en el Instituto..");
        }
    }

}