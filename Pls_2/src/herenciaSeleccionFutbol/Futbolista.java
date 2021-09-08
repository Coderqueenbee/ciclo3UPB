package herenciaSeleccionFutbol;


public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;

    //cambio2

    public Futbolista() {
        super();
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String jugarPartido(){
        String mensaje = "Jugar Partido";
        return mensaje;
    }

    public String entrenar(){
        String mensaje = "Entrena";
        return mensaje;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Datos Jugador" +
                "\nNúmero Camistea         : " + dorsal +
                "\nPosición en la que juega: " + demarcacion + "\n";
    }


}