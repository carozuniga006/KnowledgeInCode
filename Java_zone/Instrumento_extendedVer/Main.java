package Instrumento_extendedVer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el volumen de la guitarra: ");
        int vg = sc.nextInt();

        System.out.println("Ingresa el costo de mantenimiento base de la guitarra: ");
        double cg = sc.nextDouble();

        System.out.println("Ingresa el volumen del piano: ");
        int vp = sc.nextInt();

        System.out.println("Ingresa el costo de mantenimiento base del piano: ");
        double cp = sc.nextDouble();

        System.out.println("Ingresa el volumen de la bateria: ");
        int vb = sc.nextInt();

        System.out.println("Ingresa el costo de mantenimiento base de la bateria ");
        double cb = sc.nextDouble();

        Instrumento guitarra = new Guitarra(vg, cg);
        Instrumento piano = new Piano(vp, cp);
        Instrumento bateria = new Bateria(vb, cb);

        System.out.println("\n-- GUITARRA -- ");
        guitarra.tocar();
        System.out.println("Volumen: " + guitarra.volumen);
        System.out.println("Costo mantenimiento: " + guitarra.calcular_CosMantenBase());

        System.out.println("\n-- PIANO -- ");
        guitarra.tocar();
        System.out.println("Volumen: " + piano.volumen);
        System.out.println("Costo mantenimiento: " + piano.calcular_CosMantenBase());

        System.out.println("\n-- BATERIA -- ");
        guitarra.tocar();
        System.out.println("Volumen: " + bateria.volumen);
        System.out.println("Costo mantenimiento: " + bateria.calcular_CosMantenBase());




        sc.close();
    }
}