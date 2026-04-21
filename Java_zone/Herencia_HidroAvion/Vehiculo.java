package Herencia_HidroAvion;

public class Vehiculo {

    public String nombre;

    public void moverse(){
        if(nombre != null && !nombre.isEmpty()){
            System.out.println(nombre + " se está moviendo. ");
        }else{
            System.out.println("ERROR. Nombre invalido para moverse. ");
        }
    }



}
