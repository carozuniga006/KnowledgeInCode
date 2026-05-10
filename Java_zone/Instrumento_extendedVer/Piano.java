package Instrumento_extendedVer;

public class Piano extends Instrumento{

    Piano(int v, double c){
        super("Piano", v, c);
    }

    @Override
    public void tocar(){
        System.out.println("El piano interpreta una melodia clásica. ");
    }

    @Override
    public double  calcular_CosMantenBase(){
        return cosMantenBase * 1.20;
    }

}
