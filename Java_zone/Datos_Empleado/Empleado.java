package Datos_Empleado;

import java.util.Scanner;
public class Empleado {

    Scanner sc = new Scanner(System.in);

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void clasifSalario(){
        if(salario>50000){
            System.out.println("CATEGORIA DE SALARIO: ALTA\n");
        }
        else if(salario<=49999 && salario>=10000){
            System.out.println("CATEGORIA DE SALARIO: MEDIA\n");
        }
        else {
            System.out.println("CATEGORIA DE SALARIO: BAJA\n");
        }
    }

    public void mostrarDetalles(){
        System.out.println("\n--DATOS DEL EMPLEADO--\n");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
        clasifSalario();
    }

    public void cambiarAtributos(){
        System.out.println("Nombre: ");
        String newNombre = sc.nextLine();
        setNombre(newNombre);

        System.out.println("Edad: ");
        int newEdad = sc.nextInt();
        setEdad(newEdad);

        System.out.println("Salario: ");
        double newSalario = sc.nextDouble();
        setSalario(newSalario);
    }

}
