package poo;

public class Huesped {

    private int id_huesped;
    private int tarifa_pagar;
    private String nombre;
    private String cedula;

    public Huesped(int id_huesped, int tarifa_pagar, String nombre, String cedula) {
        this.id_huesped = id_huesped;
        this.tarifa_pagar = tarifa_pagar;
        this.nombre = nombre;
        this.cedula = cedula;

    }


    public int getId_huesped() {
        return id_huesped;
    }

    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }

    public int getTarifa_pagar() {
        return tarifa_pagar;
    }

    public void setTarifa_pagar(int tarifa_pagar) {
        this.tarifa_pagar = tarifa_pagar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public static double verificarDigito (Huesped[]huespedes){
       double total=0;
        double subtotal=0;
       int ced;

       for (int i=0;i< huespedes.length;i++){

           ced= Integer.parseInt(huespedes[i].getCedula());
           if ((ced%2)!=0){
               subtotal=huespedes[i].getTarifa_pagar()*60/100;
           }else{
               subtotal=huespedes[i].getTarifa_pagar();
           }
           total=total+subtotal;
       }


       return total;

    }


}
