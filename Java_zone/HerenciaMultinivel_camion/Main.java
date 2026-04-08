package HerenciaMultinivel_camion;

public class Main {
    public static void main(String[] args){

        Camion c = new Camion();

        c.marca = "Toyota";
        c.modelo = "Corola";
        c.capacidadCarga = 50;

        c.mover();
        c.encenderMotor();
        c.cargar();

    }
}
