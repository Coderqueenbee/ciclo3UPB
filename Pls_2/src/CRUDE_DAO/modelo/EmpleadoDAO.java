package CRUDE_DAO.modelo;
/*DAO OBJETO DE ACCESO DE DATOS
							encapsula el acceso a datos. lo vuelve transparente?
							 DTO OBJETO DE TRANSFERENCIA DE DATOS
Almacenamiento de datos se puede hacer: DAO
1 ArrayList    2-   Archivo de Texto Binario     3-  Base de datos
Capa de datos persistencia permite hacer operacione basicas con datos leer actualziar editar
capa logica
capa vista  presentacion*/

import CRUDE_DAO.modelo.Empleado;

import java.util.ArrayList;

/**
 *
 * @author Carlos Beltrán
 */
public class EmpleadoDAO {

    public EmpleadoDAO() {
    }
    /**
     * Regresa la lista de empleados
     * @param empleados
     * @return texto para imprimir
     */
//Recibo un arrayList tipo Empleado y llamo a este arrayList empleados
    public String verEmpleados(ArrayList<Empleado> empleados){
        String texto = "";
        for(int i = 0;i < empleados.size(); i++){
            // agrego al final del texto una secuencia de datos y "\n" para que salte una linea y ahi me imprime todos los datos

            texto = texto.concat(empleados.get(i) + "\n");
        }
        return texto;
    }

    /**
     * Método que retorna el objeto que contiene el correo de empresa
     * de lo contrario devuelve un nulo
     * @param correo
     * @param empleados
     * @return objeto empleado: encontrado
     */
//************************          LLAVE PRIMARIA ****************************
    // LA LLAVE PRIMARIA (CEDULA) PERMITE QUE NO SE CREEN OBJETOS QUEYA EXISTEN COMO LA CEDULA POR EJEMPLO
    // SE EVITA QUE SE CREE QUE OTRO OBJETO IGAUAL
    //Para buscar un empledo debo buscar con algo que sea unico como seria la cedula
    // en este metodo se va a buscar el empleado con el correo empresarial que se supone unico
    // se busca con ese metood y me deuelvo el objeto empleado encontrado
    // recibe correo de la empresa y me envia la lista de empleados
    public Empleado buscarEmpleado(String correo, ArrayList<Empleado> empleados){

        Empleado encontrado = null; //inicialmente no se ha encontrado el empleado
        //debo validar que no me entreguen lista vacia
        if(!empleados.isEmpty()){ // aqui se si viene vacia, sino viene vacia se busca al empleado
            for(int i = 0; i < empleados.size();i++){
                if(empleados.get(i).getCorreoEmpresa().equals(correo)){
                    // aqui de empleados capturo el empleado sub i cojo la fila y busco correo empresa
                    //  y miro si es igual al correo que me entro
                    encontrado = empleados.get(i); // si lo encuentro me guarda el empleado en: encontrado
                }
            }
        }
        return encontrado; // este dato es tipo Empleado
    }

    /**
     *
     * @param nombres
     * @param apellidos
     * @param fechaIngreso
     * @param correoEmpresa
     * @param correoPersonal
     * @param telefonoCelular
     * @param telefonoFijo
     * @param dependencia
     * @param empleados
     * @return boolean
     */

    //************************          LLAVE PRIMARIA ****************************
    // LA LLAVE PRIMARIA (CEDULA) PERMITE QUE NO SE CREEN OBJETOS QUEYA EXISTEN COMO LA CEDULA POR EJEMPLO
    // SE EVITA QUE SE CREE QUE OTRO OBJETO IGUAL
    // ANTES DE CREAR UN OBJETO MIRO SI YA EXISTE SINP LO PUEDO CREAR -> QUE NO COINCIDA LLAVE PRIMARIA
    // SE PARECE AL CONSTRUCTOR DE EMPLEADO DEBE RECIBIR LOS DATOS
    // PERO DEBO MIRAR QUE NO EXISTA
    // NECESITA TAMBIEN LA LISTA DONDE VA A METER AL EMPLEADO
    public boolean agregarEmpleado(String nombres, String apellidos,
                                   String fechaIngreso, String correoEmpresa, String correoPersonal,
                                   long telefonoCelular, long telefonoFijo, String dependencia,
                                   ArrayList<Empleado> empleados){
        // Creamos un objeto tipo empleado
        Empleado nuevo = new Empleado(nombres, apellidos, fechaIngreso, correoEmpresa,
                correoPersonal, telefonoCelular, telefonoFijo, dependencia);
        // Buscar si existe un objeto con el correo de la empresa
        if(buscarEmpleado(correoEmpresa, empleados) == null){
            // Agregamos el objeto al Arreglo
            empleados.add(nuevo);
            return true;
        }else {
            return false;
        }
    }

    /**
     * Método que elimina un objeto del ArrayList buscando por correo Empresa
     * @param correo
     * @param empleados
     * @return boolean
     */

    // RECIBO EL ARREGLO DE EMPLEADOS Y EL CORREO DEL EMPLEADO
    //PARA PODERLO ELIMINAR LO TENGO QUE ENCONTRAR
    public boolean eliminarEmpleado(String correo, ArrayList<Empleado> empleados){
        boolean resp = false;
        // Crear un objeto tipo empleado con el correo del empleado a eliminar
        Empleado e = buscarEmpleado(correo, empleados);
        if(e != null){
            empleados.remove(e);
            resp = true;
        }
        return resp;
    }

}
