package HeHibrida_Dispositivos;

public class Smartphone extends Dispositivo implements Movil, Computadora{

    public void realizarLlamada(){
        if(datosValidos()){
            System.out.println("LLamando desde " + marca + " " + modelo);
        }else{
            System.out.println("ERROR. Datos invalidos para realizar llamada. ");
        }
    }

    public void ejecutarPrograma(){
        if(datosValidos()){
            System.out.println("Ejecutando programa desde " + marca + " " + modelo);
        }else{
            System.out.println("ERROR. Datos invalidos para ejecutar programa. ");
        }
    }

}
