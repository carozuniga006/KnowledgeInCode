package HeMultiple_Robot;

public class Robot implements Cocinero, Limpiador, Mensajero{

    public String nombre;

    public boolean nombreValido(){
        return nombre != null && !nombre.isEmpty();
    }

    public void cocinar(){
        if(nombreValido()){
            System.out.println(nombre + " está cocinando. ");
        }else{
            System.out.println("ERROR. nombre invalido para cocinar. ");
        }
    }

    public void limpiar(){
        if(nombreValido()){
            System.out.println(nombre + " está limpiando. ");
        }else{
            System.out.println("ERROR. nombre invalido para limpiar. ");
        }
    }

    public void entregarMensajes(String mensaje){
        if(!nombreValido()){
            System.out.println("ERROR. nombre invalido para enviar mensajes.");
        }else if(mensaje == null || mensaje.isEmpty()){
            System.out.println("ERROR. mensaje invalido. ");
        }else{
            System.out.println(nombre + " entrega el mensaje: " + mensaje);
        }
    }

}
