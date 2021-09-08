/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.upb.fpoo.mundo;

/**
 *
 * @author QueenBee
 */
public class Persona {
    
    // Declarar Constantes
    private static final char SEXO_DEF = 'H';
    public static final int INFRA_PESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBRE_PESO = 1;
    
    // Declarar los Atributos
    
    private String cedula;
    private String nombre;
    private char sexo;
    private int edad;
    private double peso;
    private double altura;
    
    // Constructores

    // COnstructor sin peso y altura 

    public Persona(String cedula, String nombre, char sexo, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = 0;
        this.altura = 0;
        comprobarSexo();
    }


    // Constructor con todos los atributos
    public Persona(String cedula, String nombre, char sexo, int edad, double peso, double altura) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo();
    }

    // Constructor por Defecto

    public Persona() {
        this("","",'H',0,0,0);
    }
    

    // Setter y Getter

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // toString

    @Override
    public String toString() {
        return "Datos de Persona" + 
                "\nCÃ©dula      : " + cedula + 
                "\nNombre      : " + nombre + 
                "\nSexo        : " + sexo + 
                "\nEdad        : " + edad + 
                "\nPeso        : " + peso + 
                "\nEstatura    : " + altura + 
                "\nPeso Ideal  : " + muestraMensajePeso() + "\n" + muestraMensajeMayorDeEdad()+ "\n";
    }
    
    // Calcular el IMC y retornar 1 Ã³ -1 Ã³ 0
    
    public int calcularIMC(){
        if(this.altura == 0){
            return 2;
        } else {
            double pesoActual = this.peso / (Math.pow(this.altura, 2));
            if(pesoActual < 20){
                return INFRA_PESO;
            }else if (pesoActual <= 25){
                return PESO_IDEAL;
            }else {
                return SOBRE_PESO;
            }
        }
    }
    
    // Determinar si es mayor de edad
    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if(this.edad >= 18){
            mayor = true;
        }
        return mayor;
    }
    
    // MÃ©todo para comprobarSexo
    private void comprobarSexo(){
        if (this.sexo != 'H' && this.sexo != 'M'){
            this.sexo = Persona.SEXO_DEF;
        }
    }
    
    public String muestraMensajePeso(){
        String mensajePeso = "";
        int imc = this.calcularIMC();
        switch(imc){
            case Persona.PESO_IDEAL:
                mensajePeso = "La persona estÃ¡ en su peso Ideal";
                break;
            case Persona.INFRA_PESO:
                mensajePeso = "La persona estÃ¡ por debajo de su peso Ideal";
                break;
            case Persona.SOBRE_PESO:
                mensajePeso = "La persona estÃ¡ por encima de su peso Ideal";
                break;
            case 2:
                mensajePeso = "No se puede determinar su peso Ideal";
                break;
        }
        return mensajePeso;
    }
    
    // MÃ©todo para mensaje de si es Mayor de Edad
    
    public String muestraMensajeMayorDeEdad(){
        String mensajeEdad = null;
        if(esMayorDeEdad()){
            mensajeEdad = "La persona es MAYOR de edad";
        }else {
            mensajeEdad = "La persona NO es mayor de edad";
        }
        return mensajeEdad;
    }
    
    
    
    
}
