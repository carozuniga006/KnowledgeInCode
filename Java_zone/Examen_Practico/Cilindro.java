package Examen_Practico;

public class Cilindro extends Figura3D{

    private double radio;
    private double altura;

    public Cilindro(String nombre, double radio, double altura){
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio(){
        return radio;
    }
    public double getAltura(){
        return altura;
    }

    public void setRadio(double radio){
        if(radio>0){
            this.radio = radio;
        }else{
            System.out.println("Valor Invalido. Debe ser mayor a 0. ");
        }
    }
    public void setAltura(double altura){
        if(altura>0){
            this.altura = altura;
        }else{
            System.out.println("Valor Invalido. Debe ser mayor a 0. ");
        }
    }

    @Override
    public double calcularVolumen(){
        return Math.PI * radio * radio * altura;
    }

    public void mostrarNombre(){
        System.out.println("Nombre de la figura: " + getNombre());
    }
}

