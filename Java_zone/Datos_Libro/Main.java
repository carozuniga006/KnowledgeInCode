package Datos_Libro;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el titulo de un libro: ");
        String titulo1 = sc.nextLine();
        System.out.print("Ingresa el autor del libro: ");
        String autor1 = sc.nextLine();
        System.out.print("Ingresa el anio de publicacion del libro: ");
        int aniop1 = sc.nextInt();

        Libro libro1 = new Libro(titulo1, autor1, aniop1);

        System.out.print("\nTitulo del libro: " + libro1.getTitulo());
        System.out.println("\nAutor del libro: " + libro1.getAutor());
        System.out.println("Anio de publicacion del libro: " + libro1.getAnioPub());

        System.out.println("¿Deseas cambiar algun dato? (1=si/2=no) ");
        int resp = sc.nextInt();
        sc.nextLine();

        if(resp==1){
            System.out.println("¿Qué deseas cambiar?\n(1) Titulo\n(2) Autor\n(3) Anio de publicacion\n");
            int opc = sc.nextInt();
            sc.nextLine();
            if(opc==1){
                System.out.println("\nIngrese el nuevo Titulo: ");
                String newTitulo = sc.nextLine();
                libro1.setTitulo(newTitulo);
            }
            else if(opc==2){
                System.out.println("\nIngrese el nuevo Autor: ");
                String newAutor = sc.nextLine();
                libro1.setAutor(newAutor);
            }
            else if(opc==3){
                System.out.println("\nIngrese el nuevo Anio de publicacion: ");
                int newAniop = sc.nextInt();
                libro1.setAnioPub(newAniop);
            }
            else {
                System.out.println("ERROR. Opcion Invalida\n");
            }
        }
        else if(resp==2){
            System.out.println("No se cambiarán los datos\n");
        }
        else{
            System.out.println("Error. Opcion Invalida\n");
        }

        System.out.print("\n\nTitulo del libro: " + libro1.getTitulo());
        System.out.println("\nAutor del libro: " + libro1.getAutor());
        System.out.println("Anio de publicacion del libro: " + libro1.getAnioPub());
        libro1.verifAnio();
        sc.close();
    }
}
