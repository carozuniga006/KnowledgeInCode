package Herencia_empleados;

public class Empleado {
    public String nombre;
    public double sueldo;

    public Empleado (String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Sueldo del empleado: " + sueldo);
    }

}
