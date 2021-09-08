package Reto1;

public class PaseoProf {

    private int id;
    private int NumPersonas;
    private static final int VALORPASAJEPASEO=450000;
    private String origen;
    private String destino;

    /*public Viaje(){

    }*/

    public PaseoProf(int id, int numPersonas, String origen, String destino) {
        this.id = id;
        NumPersonas = numPersonas;
        this.origen = origen;
        this.destino = destino;
    }
    
    
    
    
    

    public int ObtenerNumeroPersonas(){
        return NumPersonas;

    }
    public double CalcularCosto(){
        //double CostoViaje = NumPersonas*VALORPASAJE;
        double subtotal, CostoViaje=0;
        subtotal=this.NumPersonas* PaseoProf.VALORPASAJEPASEO;
        if (this.NumPersonas<0){
            CostoViaje=0;
        }else if (NumPersonas<=5 && NumPersonas>0)  {
            CostoViaje=(subtotal)*3/100;
        }else if (NumPersonas<3 & NumPersonas>0)  {
            CostoViaje=(subtotal)*3/100;
        }
        return CostoViaje;
    }
}
