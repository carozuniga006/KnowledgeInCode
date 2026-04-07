package Herencia_autoValidado;

public class Auto extends Vehiculo{

    public String placa;

    public void tocarBocina(){
        System.out.println("Beep Beep !!! ");
    }

    public void validarPlaca(){
        if(placa.length() == 7 && !placa.matches("[0-9]+") && !placa.matches("[A-Za-z]+")){
            System.out.println("Placa: " + placa);
        }
        else {
            System.out.println("Placa Invalida. ");
        }
    }


}
