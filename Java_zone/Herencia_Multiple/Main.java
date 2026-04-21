package Herencia_Multiple;

public class Main {
    public static void main(String[] args){

        PersonaMultitalento pm = new PersonaMultitalento();

        pm.nombre = "Carolina";
        pm.edad = 19;
        pm.habilidad = "Programación.";

        pm.estudiar();
        pm.entrenar();
        pm.practicarArte();


    }
}
