package Herencia_Hibrida;

public class VehiculoAcuatico extends Vehiculo implements Acuatico{

    public VehiculoAcuatico(String modelo){
        super(modelo);
    }

    public void navegar(){
        System.out.println("El vehiculo está navegando. ");
    }

}
