package HeHibrida_Animales;

public class Perro extends Mamifero implements Domestico{

    public void serDomestico(){
        if(nombreValido() && edadValida()){
            System.out.println(nombre + " es un animal doméstico. ");
        }else{
            System.out.println("ERROR. Datos invalidos para ser domestico.");
        }
    }

    public void ladrar(){
        if(nombreValido()){
            System.out.println(nombre + " está ladrando. ");
        }else{
            System.out.println("ERROR. Nombre invalido para ladrar. ");
        }
    }



}
