package Reto1.modeloVistaControlador;


public class Empleado {
    // Declarar Constantes
    // Declarar Atributos
    private String nombre;
    private int edad;
    private double salario;

    // Agregar Constructores. Crear objetos

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    // Agregar Métodos

    // Setter y Getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // toString. Mostrar los valores del objeto

    @Override
    public String toString() {
        return "Datos del Empleado\n"
                + "Nombre       : " + nombre +
                "\nEdad         : " + edad +
                "\nSalario      : " + salario +
                "\nIncremento   : " + calcularIncremento() +
                "\nSalario Neto : " + calcularSalarioNeto() +"\n";
    }

    // Métodos Propios

    // Método para calcular el incremento del Salario

    public double calcularIncremento(){
        double incremento = 0;
        if(this.edad >= 18 && this.edad <= 50){
            // Instrucciones si es verdadero
            incremento = this.salario * 0.05;
        }
        if(this.edad > 50 && this.edad <= 60){
            // Instrucciones si es verdadero
            incremento = this.salario * 0.10;
        }
        if(this.edad > 60){
            // Instrucciones si es verdadero
            incremento = this.salario * 0.15;
        }
        return incremento;
    }

    // Método si es menor de Edad

    public boolean esMenorDeEdad(){
        boolean menor = true;
        if(this.edad >= 18){
            menor = false;
        }
        return menor;
    }

    // Método para calcular el Salario Neto
    public double calcularSalarioNeto(){
        double incremento, salarioNeto=0;
        incremento = this.calcularIncremento();
        salarioNeto = this.salario + incremento;
        return salarioNeto;
    }

}
