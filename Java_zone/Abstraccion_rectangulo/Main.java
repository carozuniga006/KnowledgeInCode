package Abstraccion_rectangulo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Rectangulo rectangulo1 = new Rectangulo(6, 7);

        System.out.println("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = sc.nextDouble();

        if(base<=0 || altura<=0){
            System.out.println("ERROR. Los datos no pueden ser negativos\n");
        }
        else {

            rectangulo1.calcularArea(base, altura);
            rectangulo1.calcularPerimetro(base, altura);
            rectangulo1.mostrarCalculos();

            sc.close();
        }
    }
}
