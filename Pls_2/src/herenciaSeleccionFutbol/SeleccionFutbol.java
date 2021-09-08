package herenciaSeleccionFutbol;


/**
 *
 * @author Carlos Beltrán
 */
public class SeleccionFutbol {

    /**
     * Atributos de la Clase Padre
     */
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param apellidos
     * @param edad
     */
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String concentrarse(){
        String mensaje = "Concentrarse";
        return mensaje;
    }

    public String viajar(){
        String mensaje = "Viajar";
        return mensaje;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol" +
                "\nId           : " + id +
                "\nNombre       : " + nombre +
                "\nApellidos    : " + apellidos +
                "\nEdad         : " + edad + "\n";
    }




}
