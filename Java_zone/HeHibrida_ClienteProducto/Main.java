package HeHibrida_ClienteProducto;

public class Main {
    public static void main(String[] args){

        ClienteProducto cp = new ClienteProducto();

        cp.nombre = "Laptop";

        cp.mostrarDetalles();
        cp.comprarProducto();
        cp.recibirFactura();

    }
}
