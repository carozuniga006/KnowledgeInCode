package Datos_Empleado;

public class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private Empleado empleado;

    public Departamento(String nombre, int numeroEmpleados, Empleado empleado){
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.empleado = empleado;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumeroEmpleados(){
        return numeroEmpleados;
    }
    public void setNumeroEmpleados(int numeroEmpleados){
        this.numeroEmpleados = numeroEmpleados;
    }

    public Empleado getEmpleado(){
        return empleado;
    }
    public void setEmpleado(Empleado empleado){
        this.empleado = empleado;
    }

    public String clasifNumEmp(){

        if(numeroEmpleados < 10){
            return "1 digito";
        }
        else if(numeroEmpleados < 100){
            return "2 digitos";
        }
        else if(numeroEmpleados < 1000){
            return "3 digitos";
        }
        else {
            return "mas de 3 digitos";
        }
    }

    public void mostrarInfo(){
        System.out.println("Departamento: " + nombre);
        System.out.println("Numero de empleados: " + numeroEmpleados);
        System.out.println("Clasificacion: " + clasifNumEmp());
        System.out.println("Empleado del departamento: ");
        empleado.mostrarDetalles();
    }

    public void cambiarAtrib(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("\n(1) Cambiar nombre\n(2) Cambiar numero de empleado\n");
        int opc = sc.nextInt();
        sc.nextLine();
        if(opc==1){
            System.out.println("Nuevo nombre: ");
            nombre = sc.nextLine();
        }
        else if(opc == 2){
            System.out.println("Nuevo numero de empleados: ");
            numeroEmpleados = sc.nextInt();
        }
        else {
            System.out.println("Opcion Invalida\n");
        }
    }

}
