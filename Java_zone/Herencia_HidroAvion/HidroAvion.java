package Herencia_HidroAvion;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{

    public boolean nombreValido(){
        return nombre != null && !nombre.isEmpty();
    }

    public void volar(){
        if(nombreValido()){
            System.out.println(nombre + " se está volando. ");
        }else{
            System.out.println("ERROR. Nombre invalido para volar. ");
        }
    }

    public void navegar(){
        if(nombreValido()){
            System.out.println(nombre + " se está navegando. ");
        }else{
            System.out.println("ERROR. Nombre invalido para navegar. ");
        }
    }

}
