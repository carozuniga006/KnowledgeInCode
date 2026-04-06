package Herencia_empleados;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el departamento del empleado: ");
        String departamento = sc.nextLine();
        System.out.println("Ingrese el sueldo del empleado: ");
        double sueldo = sc.nextDouble();

        Gerente emp1 = new Gerente(nombre, sueldo, departamento);

        emp1.mostrarInfo();


        sc.close();

    }
}
