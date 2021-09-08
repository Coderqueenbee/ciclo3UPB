package poo1;

public class PaseoApp {

    public static void main(String[] args) {

        Paseo[] h1= new Paseo[1];
        System.out.println(Paseo.VerPaseosDisponibles(h1,0));

        Paseo[] h2= new Paseo[1];
        h2[0]=new Paseo(1,"Amazonas Magico",10000);
        System.out.println(Paseo.VerPaseosDisponibles(h2,2500000));

        Paseo[] h3= new Paseo[2];
        h3[0]=new Paseo(1,"Amazonas Magico",10000);
        h3[1]=new Paseo(2,"Orinoco Fantastico",1500);
        System.out.println(Paseo.VerPaseosDisponibles(h3,3750000));

        Paseo[] h4= new Paseo[3];

        h4[0]=new Paseo(1,"Amazonas Magico",10000);
        h4[1]=new Paseo(2,"Orinoco Fantastico",1500);
        h4[2]=new Paseo(3,"Guajira Magnifica",0);
        System.out.println(Paseo.VerPaseosDisponibles(h4,3000000));

    }
}
