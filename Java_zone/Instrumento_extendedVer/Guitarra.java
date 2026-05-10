package Instrumento_extendedVer;

public class Guitarra extends Instrumento{

    Guitarra(int v, double c){
        super("Guitarra", v, c);
    }

    @Override
    public void tocar(){
        System.out.println("La guitarra suena con energia. ");
    }

    @Override
    public double  calcular_CosMantenBase(){
        return cosMantenBase * 1.10;
    }
}
