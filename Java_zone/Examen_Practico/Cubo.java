package Examen_Practico;

public class Cubo extends Figura3D{

    private double lado;

    public Cubo(String nombre, double lado){
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        if(lado>0) {
            this.lado = lado;
        }else{
            System.out.println("Valor Invalido. Debe ser mayor a 0. ");
        }
    }

    @Override
    public double calcularVolumen(){
        return lado * lado * lado;
    }

    public void mostrarNombre(){
        System.out.println("Nombre de la figura: " + getNombre());
    }




}

