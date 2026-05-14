package Figuras_Polimorfismo;

public class Circulo extends Figura{

    public double radio;

    public Circulo(double radio){
        nombre = "Circulo";
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

}
