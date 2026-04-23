package HeHibrida_ClienteProducto;

public class Producto {

    public String nombre;

    public boolean nombreValido(){
        return nombre != null && !nombre.isEmpty();
    }

    public void mostrarDetalles(){
        if(nombreValido()){
            System.out.println("Producto: " + nombre);
        }else{
            System.out.println("ERROR. Nombre Invalido para mostrar detalles. ");
        }
    }

}
