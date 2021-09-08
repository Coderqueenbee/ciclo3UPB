package javaScriptSD_W4;

public class UsoEmpleado {
    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Juan", 1500000.0, 25);
        misEmpleados[1] = new Empleado("Pedro", 1900000.0, 30);
        misEmpleados[2] = new Empleado("Pablo", 2500000.0, 35);
        misEmpleados[3] = new Empleado("Maria", 3500000.0, 40);

        // subir un 5% el sueldo a todos
        for (Empleado e : misEmpleados) {
            e.subirSueldo(5);
        }

        for (Empleado e : misEmpleados) {
            System.out.print(
                    "Nombre: " + e.getNombre() + " Sueldo: " + e.obtenerSueldo() + " Edad: " + e.getEdad() + "\n");
        }


         Empleado empleado1 = new Empleado("Liliana");

         empleado1.setSueldo(2500000.0); empleado1.subirSueldo(10);

         System.out.println(empleado1.getNombre() + " sueldo: " +
         empleado1.obtenerSueldo());

         Empleado empleado2 = new Empleado("Luisa", 25);

         System.out.println( empleado2.getNombre() + " sueldo: " +
         empleado2.obtenerSueldo() + " Edad: " + empleado2.getEdad());

        Empleado[] misEmpleados2 = new Empleado[4];

        misEmpleados2[0] = new Empleado("Juan", 1500000.0);
        misEmpleados2[1] = new Empleado("Pedro", 30);
        misEmpleados2[2] = new Empleado("Pablo");
        misEmpleados2[3] = new Empleado("Maria", 3500000.0, 40);

        // subir un 5% el sueldo a todos
        for (Empleado e : misEmpleados) {
            e.subirSueldo(5);
        }

        for (Empleado e : misEmpleados) {
            System.out.print(
                    "Nombre: " + e.getNombre() + " Sueldo: " + e.obtenerSueldo() + " Edad: " + e.getEdad() + "\n");
        }


    }
}