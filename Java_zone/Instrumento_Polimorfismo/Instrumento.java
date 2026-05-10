package Instrumento_Polimorfismo;

public class Instrumento {

    public String nombre;
    public int volumen;
    public double costoMantenimientoBase;

    public Instrumento(String nombre, int volumen, double costoMantenimientoBase){
        this.nombre = nombre;
        this.volumen = volumen;
        this.costoMantenimientoBase = costoMantenimientoBase;
    }

    public void tocar(){
        System.out.println("Tocando un instrumento generico. ");
    }

    public double calcularCosto_de_Mantenimiento(){
        return costoMantenimientoBase;
    }


}
