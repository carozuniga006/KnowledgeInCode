package Instrumento_extendedVer;

public class Instrumento {

    public String nombre;
    public int volumen;
    public double cosMantenBase;

    Instrumento (String nombre, int volumen, double cosMantenBase){
        this.nombre = nombre;
        this.volumen = volumen;
        this.cosMantenBase = cosMantenBase;
    }

    public void tocar(){
        System.out.println("Tocando un instrumento generico. ");
    }

    public double calcular_CosMantenBase(){
        return cosMantenBase;
    }

}
