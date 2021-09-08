package CRUDE_DAO;


import java.util.Scanner;

/**
 *
 * @author Carlos Beltrán
 */
public class VistaConsola {
    /**
     * Atributo tipo Scanner
     */
    private Scanner leer;

    /**
     * Constructor del objeto leer
     */
    public VistaConsola() {
        leer = new Scanner(System.in);
    }
    /**
     *
     * @param mensaje
     * @return
     */
    public String leerDatoString(String mensaje){
        System.out.println(mensaje);
        String dato = leer.nextLine();
        return dato;
    }
    /**
     *
     * @param mensaje
     * @return
     */
    public long leerDatoLong(String mensaje){
        long dato = 0;
        while(true){
            try {// Manejo de la Excepción
                System.out.println(mensaje);
                dato = leer.nextLong();
                leer.nextLine(); // es un machetazo para evitar un error que se da extrañamente con scanner
                break;  // para que se salga del while true si el dato esta bien
            } catch (Exception e) {
                leer.nextLine(); // es un machetazo para evitar un error que se da extrañamente con scanner
                System.out.println("El Dato ingresado no es un número..");
                dato = 0;
                continue; // para que se quede en el while true si el dato esta mal
            }
        }
        return dato;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public int leerDatoEntero(String mensaje){
        int dato = 0;
        while(true){
            try {// Manejo de la Excepción
                System.out.println(mensaje);
                dato = leer.nextInt();
                leer.nextLine(); // es un machetazo para evitar un error que se da extrañamente con scanner
                break; // para que se salga del while true si el dato esta bien
            } catch (Exception e) {
                leer.nextLine(); // es un machetazo para evitar un error que se da extrañamente con scanner
                System.out.println("El Dato ingresado no es un número..");
                dato = 0;
                continue; // para que se quede en el while true si el dato esta mal
            }
        }
        return dato;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public double leerDatoDouble(String mensaje){
        double dato = 0;
        while(true){
            try {// Manejo de la Excepción
                System.out.println(mensaje);
                dato = leer.nextDouble();
                leer.nextLine(); // es un machetazo para evitar un error que se da extrañamente con scanner
                break; // para que se salga del while true si el dato esta bien
            } catch (Exception e) {
                leer.nextLine();// es un machetazo para evitar un error que se da extrañamente con scanner
                System.out.println("El Dato ingresado no es un número..");
                dato = 0;
                continue; // para que se quede en el while true si el dato esta mal
            }
        }
        return dato;
    }

    /**
     *
     * @param mensaje
     */
    public void mostrarInformacion(String mensaje){
        System.out.println(mensaje);
    }

}
