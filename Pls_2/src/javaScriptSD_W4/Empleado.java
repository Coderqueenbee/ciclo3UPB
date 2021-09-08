package javaScriptSD_W4;

public class Empleado {

    private String nombre;
    private Double sueldo=0.0;
    private int edad;

    public Empleado(String nombre, Double sueldo, int edad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double obtenerSueldo() {
        return this.sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void subirSueldo(int porcentaje) {
        this.sueldo += sueldo * porcentaje / 100;
    }

}