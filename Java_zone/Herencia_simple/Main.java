package Herencia_simple;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un color para el circulo: ");
        String color1 = sc.nextLine();
        System.out.println("Ingresa el radio del circulo: ");
        double r1 = sc.nextDouble();

        Circulo cir1 = new Circulo(color1, r1);

        cir1.mostrarColor();
        System.out.println("El area del circulo es: " + cir1.calcularArea());

        sc.close();
    }
}
