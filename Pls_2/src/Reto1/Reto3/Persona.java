package Reto1.Reto3;

public class Persona {

    private String Cedula;
    private int Edad;
    private String nombre;

    public Persona(String cedula, int edad, String nombre) {
        this.Cedula = cedula;
        this.Edad = edad;
        this.nombre = nombre;
    }

    public Persona() {

    }

    public String getCedula() {
        return Cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "Cedula='" + Cedula + '\'' +
                ", Edad=" + Edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
