package Abstraccion_cajero;

public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad){
        if(saldo >= cantidad){
            saldo = saldo - cantidad;
        }
        else {
            System.out.println("No hay suficiente saldo\n");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo Actual: " + saldo);
    }
}
