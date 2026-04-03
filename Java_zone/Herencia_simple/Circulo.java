package Herencia_simple;

public class Circulo extends Figura{

    public double radio;

    public Circulo (String color, double radio){
        super(color);
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

}
