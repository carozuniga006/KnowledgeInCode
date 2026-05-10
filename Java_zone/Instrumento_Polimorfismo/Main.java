package Instrumento_Polimorfismo;

public class Main {
    public static void main(String[] args){

        Instrumento miGuitarra = new Guitarra("La guitarra Coco", 8, 50);

        System.out.println("Instrumento: " + miGuitarra.nombre);

        miGuitarra.tocar();

        System.out.println("Costo mantenimiento: $" + miGuitarra.calcularCosto_de_Mantenimiento());

    }
}
