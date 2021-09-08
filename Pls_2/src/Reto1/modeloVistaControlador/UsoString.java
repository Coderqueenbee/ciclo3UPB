package Reto1.modeloVistaControlador;
import java.util.Calendar;
import java.util.Locale;


//https://tutorialcup.com/es/Java/formato-de-cadena-java.htm
public class UsoString {

    public static void main(String[] args) {
        formatString();
        formatDateTimeString();


        String str1 = "Java";
        String str2 = "Tutorial";
        System.out.println(String.format("%1$s %1$s %2$s" , str1,str2));
        System.out.println(String.format("%2$s", "Hello","world"));



        //Formateo de enteros
        //Podemos especificar el ancho / largo de un entero requerido incluyendo espacio, alineación a la izquierda o alineación
        // a la derecha de un entero, especificando el ancho de un entero llenándolo con ceros. El siguiente ejemplo ilustra todos
        // estos tipos de formato.
        System.out.println(String.format("%d", 100)); //Integer
        System.out.println(String.format("[%5d]", 100)); //Right aligning-Prefixing 2 spaces to get length of integer as 5
        System.out.println(String.format("[%-5d]", 100)); //Left aligning integer of length 5 by suffixing 2 spaces
        System.out.println(String.format("[% d]", 100)); //space before an integer
        System.out.println(String.format("[%05d]", 100)); //Prefixing 2 0s to get length of integer as 5



        //Formateo de cadena
        //También podemos formatear la cadena en función de la alineación izquierda / derecha utilizando el método String format (). El siguiente ejemplo ilustra la alineación de cadenas

        System.out.println(String.format("%s", "Java")); //String
        System.out.println(String.format("[%10s]", "Java")); //Right aligning - Prefixing 6 spaces to get string length as 10
        System.out.println(String.format("[%-10s]", "Java"));//Left aligning string of length 10 by suffixing 6 spaces
        System.out.println(String.format("[%.4s]", "Java language"));//Retrieve string based on maximum number of characters specified


//Formato específico de la configuración regional
//Podemos formatear un valor entero basado en una configuración regional específica usando el método de formato Java String. Según la configuración regional, el método format () formatea el valor numérico.
        System.out.println(String.format(Locale.US,"%,d", 1000000));
        System.out.println(String.format(Locale.FRENCH, "%,d",1000000));
        System.out.println(String.format(Locale.GERMAN, "%,d",1000000));

    }

    public static void formatString()
    {    //Ejemplos de formato de cadena de Java
        System.out.println("Output of %a is " + String.format("%a", 1.5));
        System.out.println("Output of %b is " + String.format("%b", false));
        System.out.println("Output of %B is " + String.format("%B", true));
        System.out.println("Output of %c is " + String.format("%c", 'd'));
        System.out.println("Output of %d is " + String.format("%d", 101));
        System.out.println("Output of %e is " + String.format("%e", 5.6));
        System.out.println("Output of %f is " + String.format("%f", 5.6));
        System.out.println("Output of %g is " + String.format("%g", 5.6));
        System.out.println("Output of %h is " + String.format("%h", 10));
        System.out.println("Output of %n is " + String.format("%n"));
        System.out.println("Output of %o is " + String.format("%o", 8));
        System.out.println("Output of %s is " + String.format("%s", "Java"));
        System.out.println("Output of %x is " + String.format("%x", 10));




    }



//Formato de cadena Fecha Hora Tipos

    public static void formatDateTimeString()
    {
        System.out.println("Output of %tA is " + String.format("%tA", Calendar.getInstance()));
        System.out.println("Output of %ta is " + String.format("%ta", Calendar.getInstance()));
        System.out.println("Output of %tB is " + String.format("%tB", Calendar.getInstance()));
        System.out.println("Output of %tb is " + String.format("%tb", Calendar.getInstance()));
        System.out.println("Output of %tC is " + String.format("%tC", Calendar.getInstance()));
        System.out.println("Output of %tc is " + String.format("%tc", Calendar.getInstance()));
        System.out.println("Output of %tD is " + String.format("%tD", Calendar.getInstance()));
        System.out.println("Output of %td is " + String.format("%td", Calendar.getInstance()));
        System.out.println("Output of %te is " + String.format("%te", Calendar.getInstance()));
        System.out.println("Output of %tF is " + String.format("%tF", Calendar.getInstance()));
        System.out.println("Output of %tH is " + String.format("%tH", Calendar.getInstance()));
        System.out.println("Output of %th is " + String.format("%th", Calendar.getInstance()));
        System.out.println("Output of %tI is " + String.format("%tI", Calendar.getInstance()));
        System.out.println("Output of %tj is " + String.format("%tj", Calendar.getInstance()));
        System.out.println("Output of %tk is " + String.format("%tk", Calendar.getInstance()));
        System.out.println("Output of %tl is " + String.format("%tl", Calendar.getInstance()));
        System.out.println("Output of %tM is " + String.format("%tM", Calendar.getInstance()));
        System.out.println("Output of %tm is " + String.format("%tm", Calendar.getInstance()));
        System.out.println("Output of %tN is " + String.format("%tN", Calendar.getInstance()));
        System.out.println("Output of %tp is " + String.format("%tp", Calendar.getInstance()));
        System.out.println("Output of %tQ is " + String.format("%tQ", Calendar.getInstance()));
        System.out.println("Output of %tR is " + String.format("%tR", Calendar.getInstance()));
        System.out.println("Output of %tr is " + String.format("%tr", Calendar.getInstance()));
        System.out.println("Output of %tS is " + String.format("%tS", Calendar.getInstance()));
        System.out.println("Output of %ts is " + String.format("%ts", Calendar.getInstance()));
        System.out.println("Output of %tT is " + String.format("%tT", Calendar.getInstance()));
        System.out.println("Output of %tY is " + String.format("%tY", Calendar.getInstance()));
        System.out.println("Output of %ty is " + String.format("%ty", Calendar.getInstance()));
        System.out.println("Output of %tZ is " + String.format("%tZ", Calendar.getInstance()));
        System.out.println("Output of %tz is " + String.format("%tz", Calendar.getInstance()));
    }

//Ejemplo de formato de cadena de Java con un índice de argumento
}
