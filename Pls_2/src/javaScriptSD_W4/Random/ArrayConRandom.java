package javaScriptSD_W4.Random;

//json placejoder jsonplaceholder.typecode.com
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayConRandom {


     public Scanner ensayo= new Scanner(System.in);
    //private static Scanner ensayo;
    //ensayo= new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\n");
        int array3D[][][];


        int x = pedirNumeroEntero("Por favor introduce la primera dimensión: ");
        int y = pedirNumeroEntero("Por favor introduce la segunda dimensión: ");
        int z = pedirNumeroEntero("Por favor introduce la tercera dimensión: ");
        array3D = new int[x][y][z];
        inicializarArray3D(array3D);
        visualizar(array3D);


        Integer [] numeros = {564, 45, 4, 8, 54, 7, 9};

        for (int numero:numeros) {
            int pos = Arrays.asList(numeros).indexOf(numero);
            System.out.println("Posición " + pos + ": " + numero);
        }

        System.out.println();

        int [] numbers = {8, 5, 18, 13, 10, 20, 50, 11, 30};

        for (int n:numbers) {
            int pos = IntStream.range(0, numbers.length).filter(i -> n == numbers[i]).findFirst().orElse(-1);
            System.out.println("Posición " + pos + ": " + n);
        }
    }

    static int pedirNumeroEntero(String s) {

        int num;

         Scanner entrada=new Scanner(System.in);
        do {
            System.out.println(s);
            num = entrada.nextInt();
            if (num <= 0) {
                System.out.println("La dimension de la matriz debe ser mayor a cero(0)");
            }
        } while (num <= 0);

        return num;
    }

    static void inicializarArray3D(int[][][] pArray) {
        Random aleatorio = new Random();
        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < pArray[i].length; j++) {
                for (int k = 0; k < pArray[i][j].length; k++) {
                    pArray[i][j][k] = aleatorio.nextInt(11);
                    // genera aleatorios entre 0 y 10
                }
            }
        }
    }

    static void visualizar(int[][][] pArray) {
        int numElementos = 0, sumaElementos = 0;

        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < pArray[i].length; j++) {
                for (int k = 0; k < pArray[i][j].length; k++) {
                    System.out.print("\t" + pArray[i][j][k]);
                    numElementos++;
                    sumaElementos += pArray[i][j][k];
                }
                System.out.println();
            }
            System.out.println("\n");
        }
        System.out.println("El promedio de los elementos es: " + sumaElementos / numElementos);
    }
}
