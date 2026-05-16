package Menu_de_autos;

public class Coche extends Vehiculo{

    private double consxlt;
    private double potencia;
    private double distancia;

    public Coche(String nombre, double consxlt, double potencia, double distancia){
        super(nombre);
        this.consxlt = consxlt;
        this.potencia = potencia;
        this.distancia = distancia;
    }

    public double getConsxlt(){
        return consxlt;
    }
    public double getPotencia(){
        return potencia;
    }
    public double getDistancia(){
        return distancia;
    }

    public void setConsxlt(double consxlt){
        if(consxlt>0) {
            this.consxlt = consxlt;
        }else{
            System.out.println("Error. El dato debe ser positivo. ");
        }
    }
    public void setPotencia(double potencia){
        if(potencia>0) {
            this.potencia = potencia;
        }else{
            System.out.println("Error. El dato debe ser positivo. ");
        }
    }
    public void setDistancia(double distancia){
        if(distancia>0) {
            this.distancia = distancia;
        }else{
            System.out.println("Error. El dato debe ser positivo. ");
        }
    }

    @Override
    public double calcularConsumo(){
        return consxlt * distancia;
    }

    @Override
    public double calcularVelMax(){
        return potencia * 10;
    }

    public void mostrarNombre(){
        System.out.println("Nombre del Vehiculo: " + getNombre());
    }




}
