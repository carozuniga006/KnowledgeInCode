package Coche_info;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;
    private double gastoGasPorLt;

    public  Coche(String marca, String modelo, double velocidadMaxima, double gastoGasPorLt){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.gastoGasPorLt = gastoGasPorLt;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getGastoGasPorLt(){
        return gastoGasPorLt;
    }
    public void setGastoGasPorLt(double gastoGasPorLt){
        this.gastoGasPorLt = gastoGasPorLt;
    }

    public double calcularGastoDeGasolina(double distancia){
        return distancia * gastoGasPorLt;
    }

}
