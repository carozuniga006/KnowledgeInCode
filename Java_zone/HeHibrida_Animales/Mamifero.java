package HeHibrida_Animales;

public class Mamifero extends Animal{

    public int edad;

    public boolean edadValida(){
        return edad > 0;
    }

    public void alimentarse(){
        if(nombreValido() && edadValida()){
            System.out.println(nombre + " se está alimentando. ");
        }else{
            System.out.println("ERROR. Datos invalidos para alimentarse.");
        }
    }

}
