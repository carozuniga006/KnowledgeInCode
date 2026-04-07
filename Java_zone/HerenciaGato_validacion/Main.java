package HerenciaGato_validacion;

public class Main {
    public static void main(String[] args){

        Gato g = new Gato();

        g.especie = "Gato";
        g.color = "negro";

        g.hacerSonido();
        g.ronronear();
        g.mostrarColor();


    }
}
