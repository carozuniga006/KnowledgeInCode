package Herencia_Multinivel;

public class Main {
    public static void main(String[] args){

        Perro perrito = new Perro();

        perrito.nombre = "Pedro";
        perrito.edad = 3;
        perrito.raza = "Doberman";

        perrito.hacerSonido();
        perrito.alimentarse();
        perrito.ladrar();


    }


}
