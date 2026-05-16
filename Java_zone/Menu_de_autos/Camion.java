package Menu_de_autos;

public class Camion extends Vehiculo{

    private double consxtn;
    private double pesoT;

    public Camion(String nombre, double consxtn, double pesoT){
        super(nombre);
        this.consxtn = consxtn;
        this.pesoT = pesoT;
    }

    public double getConsxtn(){
        return consxtn;
    }
    public double getPesoT(){
        return  pesoT;
    }

    public void setConsxtn(double consxtn){
        if(consxtn>0){
            this.consxtn = consxtn;
        }else{
            System.out.println("Error. El dato debe ser positivo. ");
        }
    }
    public void setPesoT(double pesoT){
        if(pesoT>0){
            this.pesoT = pesoT;
        }else{
            System.out.println("Error. El dato debe ser positivo. ");
        }
    }

    @Override
    public double calcularConsumo(){
        return consxtn * pesoT;
    }

    @Override
    public double calcularVelMax(){
        return pesoT * 5;
    }

    public void mostrarNombre(){
        System.out.println("Nombre del Vehiculo: " + getNombre());
    }

}
