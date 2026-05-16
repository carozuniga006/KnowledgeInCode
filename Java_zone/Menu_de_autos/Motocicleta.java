package Menu_de_autos;

public class Motocicleta extends Vehiculo{

    private double conslt;
    private double ptc;
    private double dist;

    public Motocicleta(String nombre, double conslt, double ptc, double dist){
        super(nombre);
        this.conslt = conslt;
        this.ptc = ptc;
        this.dist = dist;
    }

    public double getConslt(){
        return conslt;
    }
    public double getPtc(){
        return ptc;
    }
    public double getDist(){
        return dist;
    }

    public void setConslt(double conslt){
        if(conslt>0){
            this.conslt = conslt;
        }
        else{
            System.out.println("Error. El dato debe ser positivo. ");
        }
    }
    public void setPtc(double ptc){
        if(ptc>0){
            this.ptc = ptc;
        }
        else{
            System.out.println("Error. El dato debe ser positivo. ");
        }
    }
    public void setDist(double dist){
        if(dist>0){
            this.dist = dist;
        }
        else{
            System.out.println("Error. El dato debe ser positivo. ");
        }
    }

    @Override
    public double calcularConsumo(){
        return conslt * dist;
    }

    @Override
    public double calcularVelMax(){
        return ptc * 20;
    }

    public void mostrarNombre(){
        System.out.println("Nombre del Vehiculo: " + getNombre());
    }


}
