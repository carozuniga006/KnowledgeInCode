package Instrumento_Polimorfismo;

public class Guitarra extends Instrumento{

    public Guitarra(String nombre, int volumen, double costoMantenimientoBase){
        super(nombre, volumen, costoMantenimientoBase);
    }

    @Override
    public void tocar(){
        System.out.println("Tocando la guitarra: Rasgueo de cuerdas");
    }

    @Override
    public double calcularCosto_de_Mantenimiento(){
        return costoMantenimientoBase + 15.0;
    }


}
