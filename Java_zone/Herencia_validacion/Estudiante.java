package Herencia_validacion;

public class Estudiante extends Persona{

    public String matricula;

    public void mostrarEstudiante(){
        mostrarDatos();

        if(matricula.length() >= 6 && Character.isLetter(matricula.charAt(0))){
            System.out.println("Matricula: " + matricula);
        }
        else{
            System.out.println("Matricula Invalida. ");
        }
    }


}
