package InfPls;

public class Furgoneta extends Coche {  //Coche es superclase y a Furgoneta en subclase
    //Clase padre es superclase

    private int capacidad_carga,plazas_extra;



    public Furgoneta(int plazas_extra, int capacidad_carga){

        super();// llamar al constructor de la clase padre para darle un estado inicial a furgoneta, se debe inicializar antes de las demas atributos que no pertenecen a la clase padre
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;

    }


    public String dimeDatosFurgoneta() { //metodo getter
        return "Furgoneta{" + "capacidad_carga=" + capacidad_carga + ", plazas_extra=" + plazas_extra + '}';
    }


}