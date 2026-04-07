package HerenciaGato_validacion;

public class Animal {

    public String especie;

    public void hacerSonido(){
        if(especie.matches("[A-Za-z]+")){
            System.out.println("Sonido generico de: " + especie);
        }else{
            System.out.println("Especie Invalida. ");
        }
    }



}
