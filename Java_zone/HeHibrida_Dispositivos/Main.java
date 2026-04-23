package HeHibrida_Dispositivos;

public class Main {
    public static void main(String[] args){

        Smartphone s = new Smartphone();

        s.marca = "Samsung";
        s.modelo = "Galaxy S";

        s.encender();
        s.realizarLlamada();
        s.ejecutarPrograma();

    }
}
