package javaSriptSD_W3;


public class UsoProducto {
    public static void main(String[] args) {
        // desde esta clase voy a instanciar la clase producto

        // sintaxis
        // NombreClase nombre_que_doy = new NombreConstructor()

        /*
         * Producto producto1 = new Producto("Arroz", "Roa", 1000, 5); Producto
         * producto2 = new Producto("Cafe", "Juan Valdez", 8000, 10); Producto producto3
         * = new Producto("Yuca", "pollito", 2000, 25);
         *
         *
         * producto1.setCantidad(4);
         *
         * producto1.SubirPrecio(2);
         * System.out.println("El precio del producto1 Jose es: " +
         * producto1.getPrecio());
         *
         * producto1.setPrecio(1000);
         *
         * producto1.SubirPrecio2(2);
         * System.out.println("El precio del producto1 Nicolas es: " +
         * producto1.getPrecio());
         *
         * System.out.println("La cantidad del producto1 es: " +
         * producto1.getCantidad());
         */

        Producto misProductos[] = new Producto[3];

        misProductos[0] = new Producto("Leche", "colanta", 3000, 5);
        misProductos[1] = new Producto("Naranjas", "pollito", 1000, 5);
        misProductos[2] = new Producto("Pera", "pollito", 1500, 5);

    }
}