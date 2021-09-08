package Reto1.alquiler.bicicletas;

public class VehiculosApp {

    // Crear un constructor Vacío

    public VehiculosApp() {
        // Nuevo Inicio
        // Declarar las Variables
        Vehiculo vehiculos [] = new Vehiculo[6];
        // Guardar en el arreglo los datos
        // Crear un objeto tipo Bicicleta
        Vehiculo vehiculo1 = new Vehiculo("Bicicleta1", false, "Pedro Alonso");
        vehiculos[0] = vehiculo1; // Guarda el valor en el Arreglo
        vehiculos[1] = new Vehiculo("Byclicle2", false, "Luisa Fernanda"); // Guarda el valor en el Arreglo
        vehiculos[2] = new Vehiculo("Bicyclette3", true, "Jorge Orlando"); // Guarda el valor en el Arreglo
        vehiculos[3] = new Vehiculo("Fahrrad4", false, "Angie Paola"); // Guarda el valor en el Arreglo
        vehiculos[4] = new Vehiculo("Velosipyed5", true, "Mario Humberto"); // Guarda el valor en el Arreglo
        vehiculos[5] = new Vehiculo("BiciKlo6", false, "Mario Humberto"); // Guarda el valor en el Arreglo
        Vehiculo salidaDisponible [] = new Vehiculo[6]; // Construyendo el arreglo para guardar la respuesta
        salidaDisponible = Vehiculo.VehiculosDisponibles(vehiculos);
        // Mostrar los datos del Areglo
        System.out.println("Listado de Vehículos Disponibles\n");
        for(int i=0;i<salidaDisponible.length;i++){
            System.out.println("Placa: "+salidaDisponible[i].getPlaca()+ " "+ " Estado: "
                    +salidaDisponible[i].getEnAlquiler()+" Cliente: "+salidaDisponible[i].getNombre()+"\n");
        }
        Vehiculo salidaEnAlquiler [] = new Vehiculo[6]; // Construyendo el arreglo para guardar la respuesta
        salidaEnAlquiler = Vehiculo.VehiculosEnAlquiler(vehiculos);
        System.out.println("\nListado de Vehículos En Alquiler\n");
        for(int i=0;i<salidaEnAlquiler.length;i++){
            System.out.println("Placa: "+salidaEnAlquiler[i].getPlaca()+ " "+ " Estado: "+
                    salidaEnAlquiler[i].getEnAlquiler()+" Cliente: "+salidaEnAlquiler[i].getNombre()+"\n");
        }
    }


    // El método main
    public static void main(String[] args) {
        // Iniciar el Programa
        VehiculosApp vehiculoaApp = new VehiculosApp();
    }

}
