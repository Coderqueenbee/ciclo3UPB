package javaSriptSD_W3;

public class Producto {

    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;

    public Producto(String nombre, String marca, double precio, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void SubirPrecio(int porcentaje) {
        precio = precio + (precio * porcentaje / 100);
    }

    public void SubirPrecio2(int porcentaje) {
        precio = precio + precio * porcentaje / 100;
    }

}