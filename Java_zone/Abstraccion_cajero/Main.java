package Abstraccion_cajero;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del titular: ");
        String titular = sc.nextLine();
        System.out.println("Numero de cuenta: ");
        String numero = sc.nextLine();
        System.out.println("Saldo inicial: ");
        double saldo = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, numero, saldo);

        System.out.println("Cantidad a depositar: ");
        double dep = sc.nextDouble();
        cuenta.depositar(dep);

        System.out.println("Cantidad a retirar: ");
        double ret = sc.nextDouble();
        cuenta.retirar(ret);

        cuenta.mostrarSaldo();

        sc.close();

    }
}
