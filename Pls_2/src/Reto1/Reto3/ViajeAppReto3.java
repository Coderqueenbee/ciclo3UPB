package Reto1.Reto3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ViajeAppReto3 {

    public static void main(String[]args){

        String frase= "hoy es un buen dia";
        System.out.println(frase.substring(10,14));

        //SALIDA RETO 1

        Persona personas1[] =new Persona[6]; // Viaje lunaMiel1= new Viaje(213,45);
        Viaje lunaMiel1= new Viaje(213,personas1);

        Persona personas2[] =new Persona[0]; //Viaje lunaMiel2= new Viaje(3,-8);
        Viaje lunaMiel2= new Viaje(3,personas2);

        Persona personas3[] =new Persona[2]; //Viaje lunaMiel3= new Viaje(8,2);
        Viaje lunaMiel3= new Viaje(3,personas3);

        Persona personas4[] =new Persona[4];//Viaje lunaMiel4= new Viaje(76,4);
        Viaje lunaMiel4= new Viaje(3,personas4);

        Persona personas5[] =new Persona[9];// Viaje lunaMiel5= new Viaje(99,9);
        Viaje lunaMiel5= new Viaje(3,personas5);

        System.out.println("Numero de personas:"+lunaMiel1.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel1.CalcularCosto());
        System.out.println("Numero de personas:"+lunaMiel2.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel2.CalcularCosto());
        System.out.println("Numero de personas:"+lunaMiel3.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel3.CalcularCosto());
        System.out.println("Numero de personas:"+lunaMiel4.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel4.CalcularCosto());
        System.out.println("Numero de personas:"+lunaMiel5.ObtenerNumeroPersonas()+"  Costo paseo"+lunaMiel5.CalcularCosto());

        //SALIDA RETO 2
        Persona personasEmpresa[] =new Persona[13];
        Persona personasFamilia[] =new Persona[8];
        Persona personasColegio[] =new Persona[22];

        Viaje paseoEmpresa= new Viaje(23,personasEmpresa); //Viaje paseoEmpresa= new Viaje(23,13);
        Viaje paseoFamilia= new Viaje(4,personasFamilia); // Viaje paseoFamilia= new Viaje(4,8);
        Viaje paseoColegio= new Viaje(33,personasColegio); // Viaje paseoColegio= new Viaje(33,22);

        ArrayList<Globo> globosrecomedadospaseoEmpresa=new ArrayList<>();
        ArrayList<Globo> globosrecomedadospaseoFamilia=new ArrayList<>();
        ArrayList<Globo> globosrecomedadospaseoColegio=new ArrayList<>();

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

        //SALIDA RETO 3

        Persona personaspaseopara3[] =new Persona[3];
        personaspaseopara3[0]=new Persona("743265516",65,"Josh");
        personaspaseopara3[1]=new Persona("1242536",23,"Drake");
        personaspaseopara3[2]=new Persona("634256",13,"Megan");

        Persona personaspaseopara8[] =new Persona[8];
        Persona personaspaseopara9[] =new Persona[9];

        Viaje paseopara3= new Viaje(1,personaspaseopara3);
        System.out.println("PARTICIPAN MENORES"+paseopara3.ParticipanMenoresDeEdad());
        System.out.println("Obtener personas"+paseopara3.getPersonas());

        Viaje paseopara8= new Viaje(1,personaspaseopara8);
        System.out.println("GLOBOS RECOMENDADOS"+paseopara8.ObtenerGlobosRecomendados());

        Viaje paseopara9= new Viaje(1,personaspaseopara9);
        System.out.println("Calcular costo"+paseopara9.CalcularCosto());

        //JOptionPane.showMessageDialog(null,"Solo Datos numéricos..","ERROR",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Mensaje de error..","ERROR",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"QUESTION_MESSAGE..","ERROR",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"OK_OPTION..","ERROR",JOptionPane.OK_OPTION);
        JOptionPane.showMessageDialog(null,"WARNING_MESSAGE..","ERROR",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"DEFAULT_OPTION..","ERROR",JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null,"PLAIN_MESSAGE..","ERROR",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"YES_OPTION..","ERROR",JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,"UNDEFINED_CONDITION..","ERROR",JOptionPane.UNDEFINED_CONDITION);
    }


}
