package CRUDE_DAO.modelo;

/*La última parte del modelo es la clase DTO, Se utiliza para transferir varios atributos
entre el cliente y el servidor o viceversa, básicamente consta de 2 clases:
La primera es una clase java conocida como Value Object que únicamente contiene
sus atributos, constructor, getters y setters, esta clase no tiene comportamiento.
La segunda es una clase del lado del servidor conocida como clase de negocio (en la
implementación también se conoce como Business Object) es la que se encarga de
obtener datos desde la base de datos y llenar la clase Value Object y enviarla al cliente,
o a su vez recibir la clase desde el cliente y enviar los datos al servidor, por lo general
tiene todos los métodos CRUD (create, read, update y delete) (Clase DAO).*/
import CRUDE_DAO.modelo.Empleado;
import CRUDE_DAO.modelo.EmpleadoDAO;

import java.util.ArrayList;
/**
 *
 * @author Carlos Beltrán
 */
public class EmpleadoDTO {

    /**
     * Atributos
     */
    private ArrayList<Empleado> empleados;
    private EmpleadoDAO empleadoDAO;


    /**
     * Constructor
     * @param empleados
     * @param empleadoDAO
     */
    public EmpleadoDTO() {

        // como dentro constructor no recibo parametros entonces debo construirlos con new
        //debo construirlo el arreglo y el dao para poder comunicarme con ellos
      empleados = new ArrayList<Empleado>();
      empleadoDAO = new EmpleadoDAO();
    }

  //  public EmpleadoDTO(ArrayList<Empleado> empleados, EmpleadoDAO empleadoDAO) {
 //       this.empleados = empleados;
  //      this.empleadoDAO = empleadoDAO;
  //  }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public EmpleadoDAO getEmpleadoDAO() {
        return empleadoDAO;
    }

    public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

}
