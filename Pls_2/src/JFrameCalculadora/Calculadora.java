package JFrameCalculadora;

public class Calculadora {


    //Atributos
    private double operando1;
    private double operando2;

    //Constructores
    public Calculadora() {
    }

    public Calculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    //Setter y Getter
    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    //Métodos propios
    public double sumar()
    {
        return this.operando1+this.operando2;
    }

    public double restar()
    {
        return this.operando1-this.operando2;
    }

    public double multiplicar()
    {
        return this.operando1*this.operando2;
    }

    public double dividir()
    {
        return this.operando1/this.operando2;
    }
}

