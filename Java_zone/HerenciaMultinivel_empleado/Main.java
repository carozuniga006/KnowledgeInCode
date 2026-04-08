package HerenciaMultinivel_empleado;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        String n1 = sc.nextLine();
        System.out.println("Ingrese el departamento del empleado: ");
        String d1 = sc.nextLine();
        System.out.println("Ingrese la edad del empleado: ");
        int e1 = sc.nextInt();
        System.out.println("Ingrese el sueldo del empleado: ");
        double s1 = sc.nextDouble();

        Gerente g1 = new Gerente();

        g1.nombre = n1;
        g1.edad = e1;
        g1.departamento = d1;
        g1.sueldo = s1;

        g1.mostrarDatos();
        g1.mostrarSueldo();
        g1.mostrarDepartamento();

        sc.close();
    }
}
