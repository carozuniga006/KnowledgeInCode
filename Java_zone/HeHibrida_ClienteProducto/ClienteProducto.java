package HeHibrida_ClienteProducto;

public class ClienteProducto extends Producto implements Cliente{

    public void comprarProducto(){
        if(nombreValido()){
            System.out.println("Comprando producto: " + nombre);
        }else{
            System.out.println("ERROR. Nombre Invalido para comprar. ");
        }
    }

    public void recibirFactura(){
        if(nombreValido()){
            System.out.println("Factura recibida de: " + nombre);
        }else{
            System.out.println("ERROR. Nombre Invalido para recibir factura. ");
        }
    }


}
