package min.tic.edu.upb.interfaz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploMenuConsola {

    public static void main(String[] args) {
        // Declarar las variables
        boolean centinela = true; // Usar dentro del whilw
        int opcion = 0;
        // Declara la variable para hacer la captura de datos
        Scanner sn = new Scanner(System.in);
        // Dentro del ciclo imprimo el menÃº y captura las opciones del menÃº
        while(centinela){
            System.out.println("\t*****************************************");
            System.out.println("\t           MENU PRINCIPAL");
            System.out.println("\t*****************************************");
            System.out.println("\t1. Cabana");
            System.out.println("\t2. Suite");
            System.out.println("\t3. De Lujo");
            System.out.println("\t4. Salir");
            System.out.println("\t*****************************************");
            try {
                System.out.print("\tSeleccione la Opcion: ");
                opcion = sn.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("\t Seleccionaste la habitaciÃ³n tipo CabaÃ±a..");
                        System.out.print("\tPresione una tecla para continuar..");
                        sn.nextLine();
                        sn.nextLine();
                        break;
                    case 2:
                        System.out.println("\t Seleccionaste la habitaciÃ³n tipo Suite..");
                        System.out.print("\tPresione una tecla para continuar..");
                        sn.nextLine();
                        sn.nextLine();
                        break;
                    case 3:
                        System.out.println("\t Seleccionaste la habitaciÃ³n tipo De Lujo..");
                        System.out.print("\tPresione una tecla para continuar..");
                        sn.nextLine();
                        sn.nextLine();
                        break;
                    case 4:
                        System.out.println("\t Vamos a salir del Programa..");
                        System.exit(0);
                    default:
                        System.out.println("\t Escribiste una opciÃ³n equivocada..");
                        System.out.print("\tPresione una tecla para continuar..");
                        sn.nextLine();
                        sn.nextLine();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\tOpcion incorercta...Reintenta");
                System.out.print("\tPresione una tecla para continuar..");
                sn.nextLine();
                sn.nextLine();
            }
        }
    }
}
