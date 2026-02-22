package Abstraccion_basica;

public class Persona {

    String nombre;
    int edad;
    double altura;
    double peso;

    public Persona(String nombre, int edad, double altura, double peso){

        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
}

