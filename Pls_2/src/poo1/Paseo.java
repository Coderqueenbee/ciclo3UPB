package poo1;

import java.util.ArrayList;

public class Paseo {

    private int Id;
    private int DistanciaMetros;
    private String nombre;

    public Paseo(int _Id, String _nombre,int _DistanciaMetros){
        this.Id=_Id;
        this.DistanciaMetros=_DistanciaMetros;
        this.nombre=_nombre;
    }
    public Paseo (){
    }
    public int getId() {
        return Id;
    }

    public int getDistanciaMetros() {
        return DistanciaMetros;
    }

    public String getNombre() {
        return nombre;
    }

    public static ArrayList<Paseo> VerPaseosDisponibles(Paseo[] paseos, double presupuesto){

        ArrayList<Paseo> paseosDisponibles= new ArrayList();
        Double costopaseo;

        for (int m=0; m<paseos.length;m++){
            if (paseos[m]==null){
                return new ArrayList();
            }
            costopaseo= Double.valueOf(paseos[m].getDistanciaMetros()/1000*375000);
            if (presupuesto>=costopaseo && (paseos[m].getDistanciaMetros()>0)){
                paseosDisponibles.add(paseos[m]);
            }
        }
        return paseosDisponibles;
    }

    @Override
    public String toString() {
        return "Paseo{" +
                "Id=" + Id +
                ", DistanciaMetros=" + DistanciaMetros +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
