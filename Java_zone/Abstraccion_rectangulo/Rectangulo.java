package Abstraccion_rectangulo;

public class Rectangulo {

    double base;
    double altura;

    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(double base, double altura){
        return base*altura;
    }

    public double calcularPerimetro(double base, double altura){
        return (2*(base+altura));
    }

    public void mostrarCalculos(){
        System.out.println("AREA: " + calcularArea(base, altura));
        System.out.println("PERIMETRO: " + calcularPerimetro(base, altura));
    }

}