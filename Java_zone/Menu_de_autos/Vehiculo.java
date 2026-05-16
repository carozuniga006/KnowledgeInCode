package Menu_de_autos;

public class Vehiculo {

    private String nombre;

    public Vehiculo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double calcularConsumo(){
        return 0;
    }

    public double calcularVelMax(){
        return 0;
    }

    public void mostrarNombre(){
        System.out.println("Nombre del Vehiculo: " + getNombre());
    }



}
