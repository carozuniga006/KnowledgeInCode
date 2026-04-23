package HeHibrida_Personas;

public class Profesor extends Persona implements Estudiante, Trabajador{

    public void estudiar(){
        if(datosValidos()){
            System.out.println(nombre + " está estudiando. ");
        }else {
            System.out.println("ERROR. Datos invalidos para estudiar. ");
        }
    }

    public void trabajar(){
        if(datosValidos()){
            System.out.println(nombre + " está trabajando. ");
        }else {
            System.out.println("ERROR. Datos invalidos para trabajar. ");
        }
    }

    public void enseñar(){
        if(datosValidos()){
            System.out.println(nombre + " está enseñando. ");
        }else {
            System.out.println("ERROR. Datos invalidos para enseñar. ");
        }
    }
}
