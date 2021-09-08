package Reto1.modeloVistaControlador;

public class EmpleadoControlador {
    // Declara los atributos que son el modelo y la vista
    private Empleado modelo;
    private EmpleadoVista vista;

    // Constructor



    public EmpleadoControlador(Empleado modelo, EmpleadoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
// DEBO CREAR UN SET Y UN GET POR CADA UNO DE LOS ATRIBUTOS DEL MODELO PERO AQUI NO ESTOY EN EL MODELO SINO
// // EN EL CONTROLADOR LOS ATRIBUTOS NO ESTAN AQUI
    //ENTONCES SI VOY A HACER UN GET DEL NOMBRE EL RETURN DEL GET DEBE VENIR ES DEL MODELO POR ESO
//  LE COLOCO PRIMERO modelo.  y me traigo el get del nombre   modelo. getNombre
    public String getNombre(){
        return modelo.getNombre();
    }
// para el set es asignarle un valor, recibe una variable nombre y con esa actualizo pero en el modelo
    //this.modelo.setNombre
    // debo hacer get y set aqui pero debo ir a recuperar los datos del modelo porque este es el puente
    // y por medio de este actualizo o devuelvo-


    public void setNombre(String nombre){
        this.modelo.setNombre(nombre);
    }

    public int getEdad(){
        return modelo.getEdad();
    }

    public void setEdad(int edad){
        this.modelo.setEdad(edad);
    }

    public double getSalario(){
        return modelo.getSalario();
    }

    public void setSalario(double salario){
        this.modelo.setSalario(salario);
    }

    public void actualizarVista(){
        vista.imprimirDatosEmpleado(modelo.getNombre(),modelo.getEdad(),modelo.getSalario()
                ,modelo.calcularIncremento(),modelo.calcularSalarioNeto());
    }

}