package Figuras_Polimorfismo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcion;
        int continuar;

        do{

            System.out.println("\n-- MENU DE FIGURAS -- ");
            System.out.println("1. Cuadrado. ");
            System.out.println("2. Triangulo. ");
            System.out.println("3. Circulo. ");
            System.out.println("0. Salir. ");
            System.out.println("\nElige una figura: ");
            opcion = sc.nextInt();

            if(opcion < 0 || opcion > 3){
                System.out.println("Opcion Invalida. Intenta de nuevo. ");
            }
            else if(opcion == 0){
                System.out.println("Programa Finalizado. ");
                System.exit(0);
            }
            else {
                Figura figura;
                for (int i = 1; i <= 3; i++){

                    switch (opcion){

                        case 1:
                            System.out.println("\nIngresa el lado: ");
                            double lado = sc.nextDouble();
                            if(lado>0){
                                figura = new Cuadrado(lado);
                                figura.mostrarNombre();
                                System.out.println("Area: " + figura.calcularArea());
                                i = 4;
                            }else{
                                System.out.println("Dato NO valido. Intenta de nuevo. ");
                            }
                            break;

                        case 2:
                            System.out.println("\nIngresa la base: ");
                            double base = sc.nextDouble();
                            System.out.println("Ingresa la altura: ");
                            double altura = sc.nextDouble();

                            if(base > 0 && altura > 0){
                                figura = new Triangulo(base, altura);
                                figura.mostrarNombre();
                                System.out.println("Area: " + figura.calcularArea());
                                i = 4;
                            }else{
                                System.out.println("Dato NO valido. Intenta de nuevo. ");
                            }
                            break;
                        case 3:
                            System.out.println("\nIngresa el radio: ");
                            double radio = sc.nextDouble();

                            if(radio > 0){
                                figura = new Circulo(radio);
                                figura.mostrarNombre();
                                System.out.println("Area: " + figura.calcularArea());
                                i = 4;
                            }else{
                                System.out.println("Dato NO valido. Intenta de nuevo. ");
                            }
                            break;
                    }
                }
            }

            System.out.println("\n¿Deseas calcular otra figura? (1: SI; 0: NO.) ");
            continuar = sc.nextInt();
        }while(continuar == 1);

        sc.close();
    }
}
