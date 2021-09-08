package AsociacionAgrupComposicion;

import java.util.ArrayList;

public class Carrito {

    private  Factura factura;
    private ArrayList<Producto> productos;

    public Carrito() {
    }

    public Carrito(Factura factura) {  // estado factura en el constructor hay relacion de agregacion
        productos= new ArrayList<Producto>();
        // factura= new Factura(); //estando así hay dependencia de composicion
        productos= new ArrayList<Producto>();
        this.factura=factura; //estando así relacion de agregacion Factura sigue existiendo sin estar carrito
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void removerProducto(){
        productos= new ArrayList<Producto>();
    }
    // para borrar carrito debo reiniciar el array list NO EXISTE EL CARRITO SI NO ESTA LA LISTA DE PRODUCTOS
    public void borrarCarrito(){
        productos= new ArrayList<Producto>();
    }
}
