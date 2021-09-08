package mintic.edu.upb.modelo;

import java.util.Date;

public class Empleado {
    // Declarar Constantes
    // Declarar Atributos
    private int edad;
    private double salario;
    private String apellidos;
    private String nombres;
    private Date fechaIngreso;
    private String correoEmpresa;
    private String correoPersonal;
    private long telefonoFijo;
    private long telefonoCelular;
    private String dependencia;

    // Agregar Constructores. Crear objetos



    public Empleado() {
    }
//DTO HACE COMUNICACION CON OBJETO DAO
    //UNO HACE EL ARRAY CON DATOS Y EL OTRO METODOS?


    // Agregar Métodos

    // Setter y Getter


    // toString. Mostrar los valores del objeto



    // Métodos Propios



  /*  // Método para calcular el incremento del Salario

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
    }*/

}
