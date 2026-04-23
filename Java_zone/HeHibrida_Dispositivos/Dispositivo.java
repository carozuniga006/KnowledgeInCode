package HeHibrida_Dispositivos;

public class Dispositivo {

    public String marca;
    public String modelo;

    public boolean datosValidos(){
        return marca != null && !marca.isEmpty()
                && modelo != null && !modelo.isEmpty();
    }

    public void encender(){
        if(datosValidos()){
            System.out.println(marca + " " + modelo + " está encendido. ");
        }else{
            System.out.println("ERROR. Datos invalidos para encender. ");
        }
    }

}
