package Herencia_validacion;

public class Persona {

    public String nombre;
    public int edad;

    public void mostrarDatos(){
        if(nombre.length() >= 3 && !nombre.matches(".\\d.")){
            System.out.println("Nombre: " + nombre);
        }
        else {
            System.out.println("Nombre Invalido. ");
        }

        if(edad >= 6 && edad <= 100){
            System.out.println("Edad: " + edad);
        }
        else {
            System.out.println("Edad Invalida. ");
        }

    }

}
