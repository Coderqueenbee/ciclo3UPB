package herenciaSeleccionFutbol;


/**
 *
 * @author Carlos Beltrán
 */
public class Masajista extends SeleccionFutbol{


    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String darMasaje(){
        String mensaje = "Dar Masaje";
        return mensaje;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Datos del Masajista" +
                "\nTitulo Profesional : " + titulacion +
                "\nAños de Experiencia: " + aniosExperiencia + "\n";
    }

}
