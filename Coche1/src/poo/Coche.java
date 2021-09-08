package poo;

/** * @author QueenBee */
public class Coche {
    //TODOS LOS CARROS TIENEN ESTO EN COMUN NO SE DEBEN CAMBIAR
    private int ruedas,largo, ancho, motor, peso_plataforma;
    
    //PROPIEDADES QUE PUEDEN CAMBIAR DEPENDIENDO DEL TIPO DE COCHE
    private String color;          //nunca se debe dejar manipular la propiedad de un objeto utilizando la instancia de un objeto
    private int peso_total;        // para ello se debe encapsular en private
    private boolean asientos_cuero, climatizador;
    
    
    public Coche(){
          ruedas=4;
          largo=2000;
          ancho=300;
          motor=1600;
          peso_plataforma=500;
                  
    }
    
     public String dime_datos_generales(){//Metodo getter devuelve valor
             return("La plataforma del coche tiene de largo del "+largo+ ", tiene "+ ruedas+" ruedas, "+" mide "+ largo/1000+" metros, con un ancho de "
                     +ancho+ " cm y un peso de plataforma de "+ peso_plataforma+" kg.");
             }
     
     public void estableceColor( String color_coche ){//Metodo setter no devuelve valor por lo tanto tiene void
             color= color_coche;
             }
     
     public String dimeColor(){//Metodo getter devuelve valor
             return("El color  del coche es  "+color);
             }
     
     public boolean configuraAsientosCuero( String asientos_cuero ){//Metodo setter no devuelve valor por lo tanto tiene void
            
             if (asientos_cuero.equalsIgnoreCase("si")){
                 
              this.asientos_cuero = true ;
             }else{
               this.asientos_cuero = false ;
             } 
             return this.asientos_cuero;
              
             }
     public String dime_asientos(){
             if (asientos_cuero = true){
             return "El coche tiene asientos de cuero";
             }else{
             return "El coche tiene asientos de serie";
             }
     }
     
     public String dime_climatizador(){
         if (climatizador==true){
             return "El coche incorpora climatizador";
         }else{
         return "El coche tiene aire acondicionado";
         }
     }
     
     
     public String dime_peso(){//metodo setter y getter
         
         int peso_carroceria=500;
         peso_total= peso_plataforma+peso_carroceria;
         if(asientos_cuero==true){
             peso_total=peso_total+50;
         }
         if(climatizador==true){
             peso_total+=20;
         }
         return "El peso total del coche es: "+peso_total;
     }
     
     }   
    
    
    


