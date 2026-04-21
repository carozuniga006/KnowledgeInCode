package Herencia_Multiple;

public class PersonaMultitalento implements Estudiante, Deportista, Artista{

    public String nombre;
    public int edad;
    public String habilidad;

    public boolean datosValidos(){
        return nombre != null && !nombre.isEmpty()
                && edad > 0
                && habilidad != null && !habilidad.isEmpty();
    }

    public void estudiar(){
        if(datosValidos()){
            System.out.println(nombre + " está estudiando. ");
        }else{
            System.out.println("ERROR. Datos invalidos para estudiar. ");
        }
    }

    public void entrenar(){
        if(datosValidos()){
            System.out.println(nombre + " está entrenando. ");
        }else{
            System.out.println("ERROR. Datos invalidos para entrenar. ");
        }
    }

    public void practicarArte(){
        if(datosValidos()){
            System.out.println(nombre + " está practicando arte. ");
        }else{
            System.out.println("ERROR. Datos invalidos para practicar arte. ");
        }
    }

}
