package herenciaSeleccionFutbol;


/**
 *
 * @author Carlos Beltrán
 */
public class Entrenador extends SeleccionFutbol{

    private String idFederacion;




    public Entrenador() {
        super();
    }

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public String dirigirEntrenamiento(){
        String mensaje = "Dirigir Entrenamiento";
        return mensaje;
    }

    public String dirigirPartido(){
        String mensaje = "Dirigir Partido";
        return mensaje;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nId Federacion : " + idFederacion + "\n";
    }



}
