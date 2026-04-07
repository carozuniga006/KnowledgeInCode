package Herencia_autoValidado;

public class Main {
    public static void main(String[] args){

        Auto a = new Auto();

        a.modelo = "  ";
        a.placa = "A4";

        a.encender();
        a.tocarBocina();
        a.validarPlaca();



    }
}
