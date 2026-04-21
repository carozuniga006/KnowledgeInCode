package HeJerarquica_Figuras;

public class Main {
    public static void main(String[] args){

        Circulo c = new Circulo();
        c.color = "Rojo";
        c.radio = 3;
        c.mostrarColor();
        System.out.println("Area del circulo: " + c.calcularArea());

        Rectangulo r = new Rectangulo();
        r.color = "Azul";
        r.base = 4;
        r.altura = 5;
        r.mostrarColor();
        System.out.println("Area del rectangulo: " + r.calcularArea());

        Cuadrado cu = new Cuadrado();
        cu.color = "Verde";
        cu.lado = 4;
        cu.mostrarColor();
        System.out.println("Area del cuadrado: " + cu.calcularArea());

        Triangulo t = new Triangulo();
        t.color = "Amarillo";
        t.base = 6;
        t.altura = 3;
        t.mostrarColor();
        System.out.println("Area del triangulo: " + t.calcularArea());

        Trapecio tr = new Trapecio();
        tr.color = "Morado";
        tr.bMayor = 8;
        tr.bMenor = 4;
        tr.altura = 3;
        tr.mostrarColor();
        System.out.println("Area del trapecio: " + tr.calcularArea());
    }
}
