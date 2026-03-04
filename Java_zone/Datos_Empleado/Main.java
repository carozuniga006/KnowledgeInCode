package Datos_Empleado;

import java.util.Scanner;

public class Main{
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Empleado empleado = new Empleado("", 0, 0);
        Departamento departamento = new Departamento("", 0, empleado);

        int opc = 0;
        while(opc!=5){

            System.out.println("\n----MENU----\n");
            System.out.println("1. Ingresar los datos del empleado ");
            System.out.println("2. Ingresar los datos del departamento ");
            System.out.println("3. Cambiar datos del empleado ");
            System.out.println("4. Cambiar datos del departamento ");
            System.out.println("5. Salir");

            System.out.println("Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();

            if(opc==1){
                System.out.println("Nombre: ");
                empleado.setNombre(sc.nextLine());

                System.out.println("Edad: ");
                empleado.setEdad(sc.nextInt());

                System.out.println("Salario: ");
                empleado.setSalario(sc.nextDouble());

                empleado.mostrarDetalles();
            }
            else if(opc == 2){
                System.out.println("Nombre del departamento: ");
                departamento.setNombre(sc.nextLine());

                System.out.println("Numero de empleados: ");
                departamento.setNumeroEmpleados(sc.nextInt());

                departamento.mostrarInfo();
            }
            else if(opc == 3){
                empleado.cambiarAtributos();
                empleado.mostrarDetalles();
            }
            else if(opc == 4){
                departamento.cambiarAtrib();
                departamento.mostrarInfo();
            }
            else if(opc == 5){
                System.out.println("\n--PROGRAMA TERMINADO--");
            }
            else {
                System.out.println("Opcion Invalida\n");
            }

        }

        sc.close();
    }
}
