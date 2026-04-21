package Herencia_Jerarquica;

public class Main {
    public static void main(String[] args){

        Leon l = new Leon();
        Elefante e = new Elefante();
        Jirafa j = new Jirafa();
        Cebra c = new Cebra();
        Mono m = new Mono();

        l.hacerSonido();
        l.rugir();
        e.hacerSonido();
        e.usarTrompa();
        j.hacerSonido();
        j.comerHojas();
        c.hacerSonido();
        c.correr();
        m.hacerSonido();
        m.trepar();


    }
}
