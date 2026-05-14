package Figuras_Polimorfismo;

public class Cuadrado extends Figura{

    public double lado;

    public Cuadrado(double lado){
        nombre = "Cuadrado";
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }


}
