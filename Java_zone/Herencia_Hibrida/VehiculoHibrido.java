package Herencia_Hibrida;

public class VehiculoHibrido extends VehiculoAcuatico{

    public VehiculoHibrido(String modelo){
        super(modelo);
    }

    public void flotar(){
        System.out.println("El vehiculo está flotando. ");
    }


}
