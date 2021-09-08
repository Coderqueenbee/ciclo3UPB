package Reto1.partA;


import java.util.ArrayList;

public class ViajeApp {

    public static void main(String[]args){





        Viaje lunaMiel1= new Viaje(213,45);
        Viaje lunaMiel2= new Viaje(3,-8);
        Viaje lunaMiel3= new Viaje(8,2);
        Viaje lunaMiel4= new Viaje(76,4);
        Viaje lunaMiel5= new Viaje(99,9);


//SALIDA RETO 1
       System.out.println("Numero de personas:"+lunaMiel1.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel1.CalcularCosto());
       System.out.println("Numero de personas:"+lunaMiel2.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel2.CalcularCosto());
       System.out.println("Numero de personas:"+lunaMiel3.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel3.CalcularCosto());
       System.out.println("Numero de personas:"+lunaMiel4.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel4.CalcularCosto());
       System.out.println("Numero de personas:"+lunaMiel5.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel5.CalcularCosto());

//SALIDA RETO 2
        ArrayList<Globo> globosrecomedadospaseoEmpresa=new ArrayList<>();
        ArrayList<Globo> globosrecomedadospaseoFamilia=new ArrayList<>();
        ArrayList<Globo> globosrecomedadospaseoColegio=new ArrayList<>();

        Viaje paseoEmpresa= new Viaje(23,13);
        Viaje paseoFamilia= new Viaje(4,8);
        Viaje paseoColegio= new Viaje(33,22);

        globosrecomedadospaseoEmpresa=paseoEmpresa.ObtenerGlobosRecomendados();
        System.out.println(globosrecomedadospaseoEmpresa);
        globosrecomedadospaseoFamilia=paseoFamilia.ObtenerGlobosRecomendados();
        System.out.println(globosrecomedadospaseoFamilia);
        globosrecomedadospaseoColegio=paseoColegio.ObtenerGlobosRecomendados();
        System.out.println(globosrecomedadospaseoColegio);

        System.out.println("Viaje1 : Numero personas"+ paseoEmpresa.ObtenerNumeroPersonas());
        for (int i=0; i<globosrecomedadospaseoEmpresa.size();i++){
            System.out.println(""+globosrecomedadospaseoEmpresa.get(i).getIdentificador()+" "+ globosrecomedadospaseoEmpresa.get(i).getCapacidad());
        }
        System.out.println("Viaje2 : Numero personas"+ paseoFamilia.ObtenerNumeroPersonas());
        for (int i=0; i<globosrecomedadospaseoFamilia.size();i++){
           System.out.println(""+globosrecomedadospaseoFamilia.get(i).getIdentificador()+" "+ globosrecomedadospaseoFamilia.get(i).getCapacidad());
        }
        System.out.println("Viaje3 : Numero personas"+ paseoColegio.ObtenerNumeroPersonas());
        for (int i=0; i<globosrecomedadospaseoColegio.size();i++){
            System.out.println(""+globosrecomedadospaseoColegio.get(i).getIdentificador()+" "+ globosrecomedadospaseoColegio.get(i).getCapacidad());
        }



    }
}