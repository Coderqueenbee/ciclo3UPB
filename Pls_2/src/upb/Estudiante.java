package upb;

import java.math.BigInteger;

/**
 * Estudiante nombre, correo, direccion, telefono, notaParcial(80%) y notaOtros(20%)
 * @author Carlos Beltrán
 */
public class Estudiante {
    // Declarar los atributos
    private String nombre;
    private String correo;
    private String direccion;
    private BigInteger telefono;
    private double notaParcial;
    private double notaOtros;

    // Constructores

    public Estudiante() {
    }

    public Estudiante(String nombre, String correo, String direccion, BigInteger telefono, double notaParcial, double notaOtros) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.notaParcial = notaParcial;
        this.notaOtros = notaOtros;
    }

    // Los set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaOtros() {
        return notaOtros;
    }

    public void setNotaOtros(double notaOtros) {
        this.notaOtros = notaOtros;
    }

    // toString

    @Override
    public String toString() {
        return "Datos del Estudiante" +
                "\nNombre       : " + nombre +
                "\nCorreo       : " + correo +
                "\nDireccion    : " + direccion +
                "\nTeléfono     : " + telefono +
                "\nNota Parcial : " + notaParcial +
                "\nNota Otros   : " + notaOtros +
                "\nNota Final   : " + calcularNotaFinal() +
                "\nMensaje      : " + mensajeNota() + "\n";
    }

    // Métodos Propios

    public double calcularNotaFinal(){
        double notaFinal = this.notaParcial * 0.8 + this.notaOtros * 0.2;
        return notaFinal;
    }

    public String mensajeNota(){
        String mensaje;
        double notaFinal = calcularNotaFinal();
        if(notaFinal < 3.0){
            mensaje = "Es hora de Estudiar";
        }else if(notaFinal < 4.0){
            mensaje = "APROBADO";
        }else {
            mensaje = "EXCELENTE NOTA";
        }
        return mensaje;
    }

}