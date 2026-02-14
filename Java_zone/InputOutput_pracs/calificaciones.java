package InputOutput_pracs;

import java.util.Scanner;
public class calificaciones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificacion del primer parcial: ");
        double p1 = sc.nextDouble();
        System.out.println("Ingrese la calificacion del segundo parcial: ");
        double p2 = sc.nextDouble();
        System.out.println("Ingrese la calificacion del tercer parcial: ");
        double p3 = sc.nextDouble();
        System.out.println("Ingrese la calificacion del cuarto parcial: ");
        double p4 = sc.nextDouble();
        System.out.println("Ingrese la calificacion del quinto parcial: ");
        double p5 = sc.nextDouble();

        if (p1<=0 || p2<=0 || p3<=0 || p4<=0 || p5<=0) {
            System.out.println("Debes recursar el semestre.\n");
        }
        else {
            double promedio= (p1+p2+p3+p4+p5)/5;
            System.out.printf("\nPROMEDIO: %.2f\n", promedio);
            if(promedio>=6){
                System.out.println("Aprobaste la materia");
            }
            else {
                System.out.println("Reprobaste la materia");
            }
        }
        sc.close();
    }
}
