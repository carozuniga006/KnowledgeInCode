package HerenciaGato_validacion;

public class Gato extends Animal{

    public String color;

    public void ronronear(){
        System.out.println("El gato ronronea felizmente ");
    }

    public void mostrarColor(){
        if(color.length() > 3 && !color.matches(".*\\d.*")){
            System.out.println("Color: " + color);
        }else{
            System.out.println("Color Invalido. ");
        }
    }


}
