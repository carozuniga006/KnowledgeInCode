package Herencia_autoValidado;

public class Vehiculo {

    public String modelo;

    public void encender(){
        if(modelo != null && modelo.trim().length() > 0){
            System.out.println("Vehiculo encendido: " + modelo);
        }
        else{
            System.out.println("Modelo Invalido.");
        }
    }


}
