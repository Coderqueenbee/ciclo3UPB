package Reto1;

import java.util.ArrayList;

public class Paseo {

    private int Id, DistanciaMetros;
    private String Nombre;

    public Paseo() {
    }

    public Paseo(int Id, String nombre, int distanciaMetros) {
        this.Id = Id;
        this.Nombre = nombre;
        this.DistanciaMetros = distanciaMetros;
    }

    public int getId() {
        return Id;
    }

    public int getDistanciaMetros() {
        return DistanciaMetros;
    }

    public String getNombre() {
        return Nombre;
    }

    //La función VerPaseosDisponibles retorna un ArrayList de tipo Paseo con todos los
    //paseos a los que puede acceder con el presupuesto dado, es decir, que el costo del
    //paseo es menor al presupuesto dado.
    //Para calcular el costo de un paseo se utiliza la siguiente fórmula:
    //𝐶𝑜𝑠𝑡𝑜𝑃𝑎𝑠𝑒𝑜 = 𝐷𝑖𝑠𝑡𝑎𝑛𝑐𝑖𝑎(𝒌𝒎) × 375.000

    public ArrayList<Paseo> VerPaseosDisponibles(Paseo[] paseos, double presupuesto){

        double CostoPaseo;
        ArrayList<Paseo> paseosDisponibles= new ArrayList<>();


        for (int m=0; m<paseos.length; m++){
            CostoPaseo=paseos[m].getDistanciaMetros()/1000*375000;
            if (presupuesto>=CostoPaseo){
                paseosDisponibles.add(paseos[m]);
            }
        }
        /*for (Paseo e:paseos){
            CostoPaseo=e.getDistanciaMetros()/1000*375000D;
            if (presupuesto>=CostoPaseo){
                paseosDisponibles.add(e);
            }
        }*/

       return paseosDisponibles;

       /*for (Paseo e:paseos){
            CostoPaseo=e.getDistanciaMetros()/1000*375000D;
            if (presupuesto<CostoPaseo){
                paseosDisponibles= new ArrayList<>();
                break;
             }else {
                paseosDisponibles.add(e);
               }
          }
       return paseosDisponibles;*/
    }

    @Override
    public String toString() {
        return   Id + "\t"+
                 Nombre + "\t" +
                 DistanciaMetros ;
    }


}



