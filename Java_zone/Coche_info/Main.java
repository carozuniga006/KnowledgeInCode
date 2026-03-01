package Coche_info;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Marca: ");
        String marca1 = sc.nextLine();

        System.out.println("Modelo: ");
        String modelo1 = sc.nextLine();

        System.out.println("Velocidad Maxima: ");
        double velmax1 = sc.nextDouble();

        System.out.println("Gasto gasolina x km: ");
        double gasto = sc.nextDouble();

        Coche coche1 = new Coche(marca1, modelo1, velmax1, gasto);

        System.out.println("\nDATOS DEL COCHE:\n");

        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Velocidad Max.: " + coche1.getVelocidadMaxima());

        System.out.println("\nDistancia (km): ");
        double distancia = sc.nextDouble();

        double gastoTotal = coche1.calcularGastoDeGasolina(distancia);
        System.out.println("Gasolina necesaria: " + gastoTotal + " litros");

        sc.close();

    }
}