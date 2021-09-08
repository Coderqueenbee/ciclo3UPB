package poo;

public class UsoApp {

    public static void main(String[] args) {

        Huesped[] h1 = new Huesped[3];

        h1[0]= new Huesped(0,70000,"Juan","1001687262");
        h1[1]= new Huesped(1,80000,"Pedro","1004578231");
        h1[2]= new Huesped(2,70000,"Helena","1002578234");

        System.out.println(Huesped.verificarDigito(h1));
        //System.out.println(Bicicleta.BicicletasenServicio(h1));

        Huesped[] h2 = new Huesped[3];

        h2[0]= new Huesped(0,60000,"Juan","1001677263");
        h2[1]= new Huesped(1,90000,"Pedro","1009528236");
        h2[2]= new Huesped(2,70000,"Helena","1008878231");

        System.out.println(Huesped.verificarDigito(h2));

        Huesped[] h3 = new Huesped[3];

        h3[0]= new Huesped(0,40000,"Juan","1001687265");
        h3[1]= new Huesped(1,60000,"Pedro","1004578237");
        h3[2]= new Huesped(2,70000,"Helena","1002578239");

        System.out.println(Huesped.verificarDigito(h3));





    }


}
