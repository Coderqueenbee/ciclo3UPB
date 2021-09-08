package CRUDE_DAO.modelo;

/**
 * Documentación del Código
 * Con Javadoc se puede obtener unas páginas html en
 * donde esté la documentación
 * si le pongo /** y le doy enter y toma las caracteristicas delmetodo que este debajo y ahi lo comento y ya puedo escribir documentacion
 * * @version 1.0
 * @author Carlos Beltrán
 */
public class Empleado {

    private String nombres;
    private String apellidos;
    private String fechaIngreso;
    private String correoEmpresa;
    private String correoPersonal;
    private long telefonoCelular;
    private long telefonoFijo;
    private String dependencia;

    public Empleado() {
    }

    /**
     * Constructor de Clase Empleado
     * @param nombres
     * @param apellidos
     * @param fechaIngreso
     * @param correoEmpresa
     * @param correoPersonal
     * @param telefonoCelular
     * @param telefonoFijo
     * @param dependencia
     */

    public Empleado(String nombres, String apellidos, String fechaIngreso, String correoEmpresa, String correoPersonal, long telefonoCelular, long telefonoFijo, String dependencia) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
        this.correoEmpresa = correoEmpresa;
        this.correoPersonal = correoPersonal;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
        this.dependencia = dependencia;
    }

    /**
     * Método get de atributo nombres
     * @return nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Actualiza el valor del nombre
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     *
     * @return apellidos
     */

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public long getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(long telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public long getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(long telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    /**
     *
     * @return datos del Objeto Empleado
     */
    @Override
    public String toString() {
        return "Nnombres           : " + nombres +
                "\nApellidos       : " + apellidos +
                "\nFecha de Ingreso: " + fechaIngreso +
                "\nCorreo Empresa  : " + correoEmpresa +
                "\nCorreo Personal : " + correoPersonal +
                "\nTeléfono Celular: " + telefonoCelular +
                "\nTeléfono Fijo   : " + telefonoFijo +
                "\nDependencia     : " + dependencia + "\n";
    }

}