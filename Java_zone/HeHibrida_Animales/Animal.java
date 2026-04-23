package HeHibrida_Animales;

public class Animal {

    public String nombre;

    public boolean nombreValido(){
        return nombre != null && !nombre.isEmpty();
    }

    public void hacerSonido(){
        if(nombreValido()){
            System.out.println(nombre + " hace un sonido. ");
        }else{
            System.out.println("ERROR. Nombre invalido para hacer sonido. ");
        }
    }

}
