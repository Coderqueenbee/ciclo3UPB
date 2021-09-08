package poo;
import java.util.Date;
import java.util.GregorianCalendar;
//* @author QueeBee

//PI public static final double PI  public se puede usar desde cualquier parte Static es la misma desde todas las partes que se vea
//por ser static es global y final que no se puede cambiar para usarla debo poner Math.PI 
//para poder usarlas no se usa el objeto sino que se usa el nombre de la clase delante de la variable o de la constante
public class Uso_empleado {

   public static void main (String[]args){
      
       // en el gregorian calendar el 12 es noviembre porque enero=0
      /* EmpleadoPI empleado1= new EmpleadoPI ("Paola Cardona",85000.1,1990,12,17);
       EmpleadoPI empleado2= new EmpleadoPI ("Julian Betancur",75000.1,1995,6,2);
       EmpleadoPI empleado3= new EmpleadoPI ("Paila Zapata",75000.1,1995,6,2);
       System.out.println("Nombre"+empleado1.dameNombre()+"Sueldo"+ empleado1.dameSueldo()+"Fecha alta"+ empleado1.dameFechaContrato() );*/
       
     Jefatura jefeRRHH= new Jefatura("Paola Cardona",500,2008,02,21);
     jefeRRHH.estableceIncentivo(1111111);
     
     

      //CREANDO ARRAY DE LAS CLASE EMPLEADOS 
      EmpleadoPI[] misEmpleados= new EmpleadoPI[5];
      misEmpleados[0]= new EmpleadoPI("Paola Cardona",800,1990,12,17);
      misEmpleados[1]= new EmpleadoPI("Julian Betancur",700,1995,6,2);
      misEmpleados[2]= new EmpleadoPI("Paula Zapata",700,1995,6,2);
      misEmpleados[3]= jefeRRHH; // polimorfimso en accion, principio de sustitucion
      misEmpleados[4]=new Jefatura("Blanca H Hernandez",900,2005,12,31);
      // HACER CASTING DE OBJETOS
      
      Jefatura JefaFinanzas=(Jefatura)misEmpleados[4]; 
      JefaFinanzas.estableceIncentivo(111111);
      
      //misEmpleados[4].
      /*  for (int fila[]:matriz){
             System.out.println();       
             for (int z: fila){
                 System.out.print(""+z+" ");
                 } 
        }*/
      
      for (EmpleadoPI fila:misEmpleados){
          fila.subeSueldo(5.0);
      }
      for (EmpleadoPI fila:misEmpleados){
          System.out.println(fila.toString());
       }
      
      
      System.out.print("OJOOOsin el toStrin sino manual sigue"+EmpleadoPI.dameIdSiguiente());
      
       for (EmpleadoPI fila:misEmpleados){
          System.out.println("Nombre" +fila.dameNombre()+"Sueldo"+fila.dameSueldo()
                             +"Fecha de alta" + fila.dameFechaContrato());
       }

       /*try{
           //lo que puede producir una excepción
           int a =5/0;
           String str= null;
           str.toUpperCase(); //NullPointerException

           int i[]={2};
           i[8]=5;
       }catch(ArithmethicException){
//como se maneja la excepción
       }catch(NullPointerException){
//como se maneja la excepción
       }catch(ArrayIndexOutOfBoundsException){
//como se maneja la excepción
       }

       catch(Exception e){
//como se maneja la excepción
       }finally{

//siempre se ejecuta despues de daños}

       }*/

// OTRA FORMA DE LEER

       /*public static void leer() throws Exception{

           BufferedReader br;
           br=new BufferesReader(new InputStreamReader(System.in));
           System.out.print("Enter string");
           String s= br.readline();
           System.out.println("El dato ingresado es:" +s);

       }*/


     /* for (int i=0;i<3;i++){
          misEmpleados[i].subeSueldo(5);
      }*/
      
    /*  for (EmpleadoPI fila:misEmpleados){
          System.out.println("Nombre" +fila.dameNombre()+"Sueldo"+fila.dameSueldo()
                             +"Fecha de alta" + fila.dameFechaContrato());
       }*/
           
     /* for (int i=0;i<3;i++){
          System.out.println("Nombre" +misEmpleados[i].dameNombre()+"Sueldo"+misEmpleados[i].dameSueldo()
                             +"Fecha de alta" + misEmpleados[i].dameFechaContrato());
       }*/
       
        }//cieera main
}
      
 //PI public static final double PI

class EmpleadoPI {
    
    public EmpleadoPI (String nom, double sue, int agno, int mes, int dia){
    
    nombre= nom;
    sueldo=sue;
    GregorianCalendar calendario= new GregorianCalendar(agno, mes-1,dia);
    altaContrato= calendario.getTime();
    id=idSiguiente; //estas variables/constantes "globales", 
    idSiguiente++;
    }
    
    public EmpleadoPI(String nom){  //Lo que hace este constructor es buscar a otro constructor que tenga el mismo numero de parametros y darle valores para que llene estos campos
        this(nom,30000,2000,12,31);//
    }
    private  String nombre;  //private final String nombre; 
    private double sueldo;
    private Date altaContrato;
    private  int id; //
    private static int idSiguiente=1;
    
    public String dameNombre(){//getter
           return nombre +"id: "+id;}
    
    public double dameSueldo(){//getter
           return sueldo;}
    
    public Date dameFechaContrato(){//getter
           return altaContrato;}
    
    public void subeSueldo(double porcentaje){//setter 
          double aumento= sueldo*porcentaje/100;
          sueldo+=aumento;
           }

    @Override
    public String toString() {
        return "EmpleadoPI{" + "nombre=" + nombre + ", sueldo=" + this.dameSueldo() + ", altaContrato=" + altaContrato + ", id=" + id + '}';
    }
    
    public static String dameIdSiguiente(){
        return "El id siguiente es " + idSiguiente;}
    
    
}

class Jefatura extends EmpleadoPI{
    
    private double incentivo;
    
    public Jefatura (String nom, double sue, int agno, int mes, int dia){
        super(nom, sue, agno, mes, dia);
    }
    public void estableceIncentivo(double b){ // setter
        this.incentivo= b;
    }
    public double dameSueldo(){  //sobreescribe dameSueldo de la clase empleadoPI que es el padre
        double sueldoJefe=super.dameSueldo();// aqui estoy llamando al llame sueldo de la clase padre
        return sueldoJefe+incentivo;
    }
}// CIERRA CLASE JEFATURA

class Director extends Jefatura {
    public Director(String nom, double sue, int agno, int mes, int dia){
        super(nom, sue, agno, mes, dia);       
     }
}
    





//}
