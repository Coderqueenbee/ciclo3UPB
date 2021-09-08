package Reto1;

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





}
