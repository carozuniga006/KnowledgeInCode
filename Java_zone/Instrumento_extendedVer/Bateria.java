package Instrumento_extendedVer;

public class Bateria extends Instrumento{

    Bateria(int v, double c){
        super("Bateria", v, c);
    }

    @Override
    public void tocar(){
        System.out.println("La bateria marca el ritmo con fuerza. ");
    }

    @Override
    public double  calcular_CosMantenBase(){
        return cosMantenBase * 1.15;
    }

}
