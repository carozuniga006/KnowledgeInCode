package Calificaciones_y_promedio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre1 = sc.nextLine();
        System.out.println("Ingresa tu matricula: ");
        String matri1 = sc.nextLine();

        System.out.println("Ingresa la calificación 1: ");
        double cal1 = sc.nextDouble();
        System.out.println("Ingresa la calificación 2: ");
        double cal2 = sc.nextDouble();
        System.out.println("Ingresa la calificación 3: ");
        double cal3 = sc.nextDouble();
        System.out.println("Ingresa la calificación 4: ");
        double cal4 = sc.nextDouble();
        System.out.println("Ingresa la calificación 5: ");
        double cal5 = sc.nextDouble();

        if (cal1 > 10 || cal1 < 0 || cal2 > 10 || cal2 < 0 || cal3 > 10 || cal3 < 0 || cal4 > 10 || cal4 < 0 || cal5 > 10 || cal5 < 0) {
            System.out.println("Calificaciones invalidas: Deben ser mayores a 0 y menores a 10\n");
        } else {
            Estudiante est1 = new Estudiante(nombre1, matri1, cal1, cal2, cal3, cal4, cal5);

            est1.calcularPromedio();
            est1.mostrarDatos();
        }
        sc.close();

    }
}