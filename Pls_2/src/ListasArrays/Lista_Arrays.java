package ListasArrays;

import java.util.ArrayList;
import java.util.Collections;

public class Lista_Arrays {

    public static void main(String[] args) {

       int []  datos= {1,2,3,4,5};
       String dias[]= {"Lunes", "martes","miercoles"};
       double data[];
       data= new double[10];
       data[1]=35;

       double sum=0;
       for (double element: data){
           sum= sum+element;

       }


        ArrayList lista= new ArrayList();
        lista.add(3);

        lista.add(true);
       // lista.remove(true);
       Collections.reverse(lista);

        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        Collections.shuffle(lista);// permutes the specified list


        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }

        Collections.sort(lista);// permutes the specified list

    }
}
