package Examen_Practico;

public class Esfera extends Figura3D{

    private double radio;

    public Esfera(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        if(radio>0){
            this.radio = radio;
        }else{
            System.out.println("Valor Invalido. Debe ser mayor a 0. ");
        }
    }

    @Override
    public double calcularVolumen(){
        return (4/3) * Math.PI * radio * radio * radio;
    }

    public void mostrarNombre(){
        System.out.println("Nombre de la figura: " + getNombre());
    }

}

