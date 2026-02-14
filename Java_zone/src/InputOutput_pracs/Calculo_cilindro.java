package InputOutput_pracs;

import java.util.Scanner;
public class Calculo_cilindro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el radio del cilindro: ");
        double radio = sc.nextDouble();
        System.out.println("Ingresa la altura del cilindro: ");
        double altura = sc.nextDouble();

        if (radio <=0 || altura <=0){
            System.out.println("ERROR. Los valores no pueden ser menores o igual a cero.");
        }
        else {
            double area = 2*(3.1416*(radio*(radio+altura)));

            System.out.println("\n--DATOS INGRESADOS--\nRADIO: " + radio + "\nALTURA: " + altura);
            System.out.printf("\n--CÁLCULO DEL ÁREA--\nÁREA: %.2f", area);
        }
        sc.close();
    }
}
