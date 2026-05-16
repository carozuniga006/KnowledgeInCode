package Examen_Practico;

public class Figura3D {

    private String nombre;

    public Figura3D(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        System.out.println("Nombre de la figura: " + getNombre());
    }

    public double calcularVolumen(){
        return 0;
    }


}

