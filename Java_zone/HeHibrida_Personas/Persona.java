package HeHibrida_Personas;

public class Persona {

    public String nombre;
    public int edad;

    public boolean datosValidos(){
        return nombre != null && !nombre.isEmpty() && edad > 0;
    }


}
