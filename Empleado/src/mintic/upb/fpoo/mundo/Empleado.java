
package mintic.upb.fpoo.mundo;

/**
  * @author QueenBee
 */
public class Empleado {
    
    //ATRIBUTOS DE LA CLASE EMPLEADO
    private String nombre;
    private int edad;
    private double salario;
    //private d
    //private double incremento;

    //CONSTRUCTOR DE EMPLEADO este elemento nos permite crear objetos según las características definidas en el mismo,
    
    //CONSTRUCTOR VACIO
    public Empleado() {    
    }

    //CONSTRUCTOR COMPLETO
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //GETTERS: Los get que es el método que nos permite asignar valores a cada atributo al momento de definir el objeto.
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //SETTERS: Set es el método que nos permite recuperar los datos almacenados en cada atributo, se debe instanciar el objeto y después se puede
    //recuparar el valor del dato
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getSalario() {
        return salario;
    }
// toString que nos permite mostrar los valores de un objeto

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
    //METODOS PROPIOS DE LA CLASE
    
    public double calcularIncremento(){
        double incremento=0.0;
        
        if (this.edad>=18&&this.edad<50){
        incremento=this.salario*0.05;
        }
        if (this.edad>=50&&this.edad<60){
        incremento=this.salario*0.10;
        }
        if (this.edad>=60){
        incremento=this.salario*0.15;
        }
        return incremento;
    }
    
    public boolean esMenorEdad(){
        boolean menor=true;
        if(this.edad>=18){
           menor=false;}
        return menor;
    }
    
}
