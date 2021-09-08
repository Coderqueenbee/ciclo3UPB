package Reto1.partA;


import Reto1.Paseo;

import java.util.ArrayList;

public class Viaje {

    private int id;
    private int NumPersonas;
    private static final int VALORPASAJE=450000;


    public Viaje(int id, int numPersonas) {
        this.id = id;
        this.NumPersonas = numPersonas;

    }

    public int ObtenerNumeroPersonas(){
        return this.NumPersonas;


    }

    public double CalcularCosto(){
        double CostoViaje,subtotalViaje=0;
        subtotalViaje=this.NumPersonas*VALORPASAJE;
        if (this.NumPersonas<=0){
            CostoViaje=0;
        } else if(this.NumPersonas>0 &&this.NumPersonas<=3){
            CostoViaje=subtotalViaje-(subtotalViaje*3/100);
        }else if(this.NumPersonas>3 &&this.NumPersonas<=6){
            CostoViaje=subtotalViaje-(subtotalViaje*6/100);
        }else {
            CostoViaje=subtotalViaje-(subtotalViaje*10/100);
        }
        return CostoViaje;
    }


    public ArrayList<Globo> ObtenerGlobosRecomendados(){

/*Lo más rentable es que se priorice que los globos sean usados a máxima capacidad,
por lo que le piden que implemente la función ObtenerGlobosRecomendados que retorna un ArrayList de tipo Globo ordenado
 de mayor a menor con tan solo los globos suficientes para un viaje,
 le recomiendan seguir las siguientes instrucciones:
a. Si hay 12 o más personas sin asignar, debe agregar a la lista de globos recomendados un globo grande.
b. Si hay entre 8 y 11 personas sin asignar, debe agregar a la lista de globos recomendados un globo mediano.
c. Si hay menos de 8 personas sin asignar, debe agregar a la lista de globos recomendados globos pequeños hasta
 que todas las personas del viaje puedan tener asegurado un lugar en un globo.*/


        ArrayList<Globo> globosrecomedados=new ArrayList<>();

        int cantidadPersonasPaseo,cantidadGlobos,cantidadGlobosGrandes,cantidadGlobosMedianos,cantidadGlobosPequenos=0;

        Globo grande= new Globo("Globo Grande",12);
        Globo mediano= new Globo("Globo Mediano",8);
        Globo pequeño= new Globo("Globo Pequeño",4);

        cantidadPersonasPaseo=this.NumPersonas;

        while (cantidadPersonasPaseo!=0){

            if (cantidadPersonasPaseo>=12){
                cantidadPersonasPaseo-=12;
                globosrecomedados.add(grande);
            }else if (cantidadPersonasPaseo<12&&cantidadPersonasPaseo>=8){
                cantidadPersonasPaseo-=8;
                globosrecomedados.add(mediano);
            }else if (cantidadPersonasPaseo<8&&cantidadPersonasPaseo>=4){
                cantidadPersonasPaseo-=4;
                globosrecomedados.add(pequeño);
            }else {
                cantidadPersonasPaseo=0;
                globosrecomedados.add(pequeño);
            }
        }
        return globosrecomedados;

    }



}
