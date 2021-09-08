/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //private List<String> lista =new ArrayList<String>();
   // private List<String> lista =new ArrayList<String>();
    private List<Client> lista =new ArrayList<Client>();

    public static void main(String[] args) throws IOException {


        boolean flag= true;

        while (flag){

            int vector[] = new int[ 3];

            int i;
            for (i=0;i<3; i += 1){
                System.out.println("Give number:"+(i+1));
                vector[i]=readNumber();
            }

            System.out.println("vector es: " + vector[0]+"y "+vector[1]+"y"+vector[2]);
            Scanner keyboard= new Scanner(System.in);
            System.out.println("Meta un numero:");
            int numeroN= keyboard.nextInt();
            System.out.println(numeroN);


            System.out.println("Give me the first number:");
                Integer numero1 = readNumber();
                System.out.println("Give me the second number:");
                Integer numero2 = readNumber();
                System.out.println("Give me the third number:");
                Integer numero3 = readNumber();

            // Con este codigo calculamos el numero mayor y el nnumero menor
            calcularNumeroMayor(numero1, numero2, numero3);
            //calcularNumeroMenor(numero1, numero2, numero3);
            smallestnumber(numero1, numero2, numero3);
            if (numero1==0 || numero2==0 ||  numero3==0) flag = false;

            Client a= new Client();
            //a.email="abc@gmail.com"; si fuera variable publica.
            a.setName("Paola");
            a.setLastName("Cardona");
            System.out.println(a.getFullname());



        }


    }

     private static Integer readNumber() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumber = buffer.readLine();
        Integer number=Integer.parseInt(strNumber);
        return number;

     }
    /**
     * Function that finds the biggest number
     * @param number1 numero 1
     * @param number2 numero 2
     * @param number3 numero 3
     */
    private static void calcularNumeroMayor(Integer number1, Integer number2, Integer number3)
    {
        Integer max_a_b=Integer.max(number1,number2);
        Integer max_all= Integer.max(max_a_b,number3 );
        System.out.println("Number" + max_all+" is the biggest");
    }


    private static void smallestnumber(Integer number1, Integer number2, Integer number3) {
        Integer menor = number1;
        if (number2 < menor) menor = number2;
        if (number3 < menor) menor = number3;
        System.out.println(menor + "is the smallest number among" + number1+"and"+number2+"and"+number3+".");

    }




}




/*


public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Number1:");
        String strNumber1 = buffer.readLine();

        System.out.println("Number2:");
        String strNumber2 = buffer.readLine();

        System.out.println("Number3:");
        String strNumber3 = buffer.readLine();

        Integer number1= Integer.valueOf(strNumber1);
        Integer number2= Integer.valueOf(strNumber2);
        Integer number3= Integer.parseInt(strNumber3);

        maxNumber(number1, number2, number3);
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);


        //System.out.println("Number" + max_all+" is the biggest");


        /* "%d        ?  %d       and     %d     %n" */
        /*System.out.printf("%d?%dand%d%n", number1, number2, number3);


    }

}


   // private static void maxNumber() {
   //     maxNumber(5, 5, 4);    }





    */