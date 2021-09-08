package Reto1;

public class Huesped {
    private int id_huesped,tarifa_pagar;
    private String nombre, cedula;
    public Huesped(){
    }
    public Huesped(int id_huesped, int tarifa_pagar, String nombre, String cedula) {
        this.id_huesped = id_huesped;
        this.tarifa_pagar = tarifa_pagar;
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public int getTarifa(){
        return this.tarifa_pagar;
    }
    public double verificarDigito(Huesped[]huespedes){
        double total=0;
        int ced;
        for (Huesped e:huespedes){
            ced= Integer.parseInt(e.getCedula());
            if ((ced)%2!=0){
                e.tarifa_pagar=e.tarifa_pagar-(e.tarifa_pagar*40/100);
            }
            total+=e.tarifa_pagar;
        }
        return total;
    }

    public int getId_huesped() {
        return id_huesped;
    }
    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTarifa_pagar() {
        return tarifa_pagar;
    }
    public void setTarifa_pagar(int tarifa_pagar) {
        this.tarifa_pagar = tarifa_pagar;
    }
    public String getCedula(){
        return this.cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
