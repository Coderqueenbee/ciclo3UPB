package mintic.edu.upb.mundo;

/** * @author QueenBee*/
public class Cliente {
    //declarar constantes
    public static final int VALOR_CABANA=7000; 
    public static final int VALOR_SUITE=10000;
    public static final int VALOR_DE_LUJO=15000; 
        //declarar Atributos

    private long cedula;
    private String nombre;
    private int tipo;
    private int tiempoCasados;
    private int dias;
       
    
    //declarar constructores
    
    public Cliente(long cedula, String nombre, int tipo, int tiempoCasados, int dias) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tiempoCasados = tiempoCasados;
        this.dias = dias;
    }

    public Cliente() {
    }
//declarar setters getters
    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTiempoCasados() {
        return tiempoCasados;
    }

    public void setTiempoCasados(int tiempoCasados) {
        this.tiempoCasados = tiempoCasados;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Cliente{" + 
                "\ncedula=" + cedula +
                "\nnombre=" + nombre +
                "\n tipo=" + tipo +
                "\n tiempoCasados=" + tiempoCasados + 
                "\n dias de Hospedaje=" + dias + '}';
    }
    
    //declarar metodos propios
    
    //subtotal de la factura
    public double calcularSubtotal(){
        double subtotal=0;
        
        switch (this.tipo){
            case 1:
                subtotal= this.dias *Cliente.VALOR_CABANA;
            case 2:
                subtotal= this.dias *Cliente.VALOR_SUITE;
            case 3:
                subtotal= this.dias *Cliente.VALOR_DE_LUJO;
                break;
                
        }
        return subtotal;
    }
        
      //Calcular el sobre costo por tienpo de casados
      
     public double calcularDescuentoCasados(){
        double subtotal=0, descuentoCasados=0;
        
        subtotal=  calcularSubtotal();
        
        if (tiempoCasados>0&&tiempoCasados>=2){
        descuentoCasados= subtotal*0.3;
        }else if (tiempoCasados<=4){
            descuentoCasados= subtotal*0.15;
        }else if (tiempoCasados<=6){
            descuentoCasados= -(subtotal*0.10);
        }
        return descuentoCasados;
        
       
                
        }
        
        
      public double calcularImpuestoFutbol(){
          double impuestoFutbol=0;
          return impuestoFutbol;
      }  
        
        
    
    
}//class Cliente
