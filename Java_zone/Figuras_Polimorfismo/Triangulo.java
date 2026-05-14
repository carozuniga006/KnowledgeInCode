package Figuras_Polimorfismo;

public class Triangulo extends Figura{

    public double base;
    public double altura;

    public Triangulo(double base, double altura){
        nombre = "Triangulo";
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }


}
