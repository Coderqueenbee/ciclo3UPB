package min.tic.edu.upb.mundo;

public class Cliente {

    // Declarar las constantes
    public static final int VALOR_CABANA = 70000;
    public static final int VALOR_SUITE = 100000;
    public static final int VALOR_DE_LUJO = 150000;

    // Declarar los Atributos
    private long cedula;
    private String nombre;
    private int tipo;
    private int tiempoCasados;
    private int dias;

    // Crear los Constructores

    public Cliente() {
    }

    public Cliente(long cedula, String nombre, int tipo, int tiempoCasados, int dias) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tiempoCasados = tiempoCasados;
        this.dias = dias;
    }

    // MÃ©todos Set y Get
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


    // Opcional toString

    @Override
    public String toString() {
        return "Datos del Cliente" +
                "\nCÃ©dula                : " + cedula +
                "\nNombre                : " + nombre +
                "\nTipo                  : " + tipo +
                "\nTiempo de Casados     : " + tiempoCasados +
                "\nDias de Hospedaje     : " + dias +
                "\nSubtotal              : " + calcularSubtotal() +
                "\nDescuento o Sobrecosto: " + (-calcularDescuentoCasados()) +
                "\nImpuesto FÃºtbol       : " + calcularImpuestoFutbol() +
                "\nTOTAL A PAGAR         : " + calcularTotalFactura() +
                "\n";
    }

    // MÃ©todos Propios

    // El subtotal de la Factura

    public double calcularSubtotal(){
        double subtotal = 0;
        switch(this.tipo){
            case 1:
                subtotal = this.dias * Cliente.VALOR_CABANA;
                break;
            case 2:
                subtotal = this.dias * Cliente.VALOR_SUITE;
                break;
            case 3:
                subtotal = this.dias * Cliente.VALOR_DE_LUJO;
                break;
        }
        return subtotal;
    }

    // MÃ©todo que permita calcular el descuento o sobrecosto por tiempo de Casados

    public double calcularDescuentoCasados(){
        double subtotal = 0, descuentoCasados = 0;
        subtotal = calcularSubtotal();
        if(tiempoCasados > 0 && tiempoCasados <= 2){
            descuentoCasados = subtotal * 0.3;
        }else if(tiempoCasados <= 4){
            descuentoCasados = subtotal * 0.15;
        }else if(tiempoCasados <= 6){
            descuentoCasados = -(subtotal * 0.10);
        }
        return descuentoCasados;
    }

    // MÃ©todo para calcular impuesto por infraestructura

    public double calcularImpuestoFutbol(){
        double impuestoFutbol = 0;
        impuestoFutbol = (calcularSubtotal() - calcularDescuentoCasados()) * 0.02;
        return impuestoFutbol;
    }

    // MÃ©todo para calcular el Total de la Factura

    public double calcularTotalFactura(){
        double totalFactura = 0;
        totalFactura = calcularSubtotal() - calcularDescuentoCasados() + calcularImpuestoFutbol();
        return totalFactura;
    }

}
