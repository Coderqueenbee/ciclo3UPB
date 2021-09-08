package Reto1.alquiler.bicicletas;

public class Vehiculo {
    // Definir los Atributos
    private String placa;
    private boolean enAlquiler;
    private String nombre;

    // Constructos
    public Vehiculo() {
    }


    public Vehiculo(String _placa, boolean _enAlquiler, String _nombre){
        this.placa = _placa;
        this.enAlquiler = _enAlquiler;
        this.nombre = _nombre;
    }

    public String getPlaca(){
        return this.placa;
    }

    public boolean getEnAlquiler(){
        return this.enAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public static Vehiculo [] VehiculosEnAlquiler(Vehiculo[] vehiculos){
        // Averiguar el tamaño del Arreglo de los Vehiculos en Alquiler
        int numeroEnAlquiler = 0;
        int posicion = 0;
        // Recorremos el Arreglo para calcular el tamaño del nuevo Arreglo
        for(int i = 0;i<vehiculos.length;i++){
            if (vehiculos[i].getEnAlquiler() == true){
                numeroEnAlquiler = numeroEnAlquiler + 1;
            }
        }
        // Definir el arreglo en donde se almacena los vehículos en Alquiler
        Vehiculo enAlquiler [] = new Vehiculo[numeroEnAlquiler];
        // Agregar los datos en Alquiler al nuevo Arreglo
        for(int i = 0;i<vehiculos.length;i++){
            if (vehiculos[i].getEnAlquiler() == true){
                enAlquiler[posicion] = vehiculos[i];
                posicion++;
            }
        }
        return enAlquiler;
    }

    public static Vehiculo [] VehiculosDisponibles(Vehiculo[] vehiculos){
        // Averiguar el tamaño del Arreglo de los Vehiculos Disponibles
        int numeroDisponibles = 0;
        int posicion = 0;
        // Recorremos el Arreglo para calcular el tamaño del nuevo Arreglo
        for(int i = 0;i<vehiculos.length;i++){
            if (vehiculos[i].getEnAlquiler() == false){
                numeroDisponibles++;
            }
        }
        // Definir el arreglo en donde se almacena los vehículos en Alquiler
        Vehiculo disponibles [] = new Vehiculo[numeroDisponibles];
        // Agregar los datos disponibles al nuevo Arreglo
        //
        for(int i = 0;i<vehiculos.length;i++){
            if (vehiculos[i].getEnAlquiler() == false){
                disponibles[posicion] = vehiculos[i];
                posicion++;
            }
        }
        return disponibles;
    }
}
