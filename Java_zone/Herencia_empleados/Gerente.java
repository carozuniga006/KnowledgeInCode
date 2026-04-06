package Herencia_empleados;

public class Gerente extends Empleado{

    public String departamento;

    public Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Departamento del empleado: " + departamento);
    }

}