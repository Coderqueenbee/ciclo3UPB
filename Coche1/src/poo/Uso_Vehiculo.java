package poo;

//@author QueenBee

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

    public static void main(String[] args) {
        
            Coche Renault= new Coche();//con esta instruccion ya le he dado un estado inicial
            Renault.estableceColor(JOptionPane.showInputDialog("Introduce color para tu carro"));
            System.out.println(Renault.dime_datos_generales()); 
            Renault.configuraAsientosCuero(JOptionPane.showInputDialog("Tiene asientos de cuero? "));
            System.out.println(Renault.dimeColor()+" . "+Renault.dime_asientos()+" . "+Renault.dime_peso());
            
            
            Coche micoche1= new Coche();
            micoche1.estableceColor("blue");
            Furgoneta mifurgoneta1= new Furgoneta(7,500);
            mifurgoneta1.estableceColor("rojo");
            mifurgoneta1.configuraAsientosCuero("si");
            System.out.println(mifurgoneta1.dimeDatosFurgoneta());
            
            
            

            

    }
        
}
