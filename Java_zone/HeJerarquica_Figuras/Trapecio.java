package HeJerarquica_Figuras;

public class Trapecio extends FiguraGeometrica{

    public double bMayor;
    public double bMenor;
    public double altura;

    public double calcularArea(){
        return ((bMayor + bMenor) * altura) / 2;
    }


}
