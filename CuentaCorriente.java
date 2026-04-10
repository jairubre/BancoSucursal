package src.BancoCliente;

import java.time.LocalDateTime;

public class CuentaCorriente extends CuentaBanco {

    public CuentaCorriente(int id, ClienteBnaco c) {
        super(id, 0, c);
    }

    public void retirarDinero(double cantidad) throws excepcionValidar {
        validarSaldo(cantidad);
    }

    public void ingresarDinero(double cantidad) {
        sumarSaldo(cantidad);
    }

    public void validarSaldo(double cantidad) throws excepcionValidar {
        if (cantidad > this.saldo || cantidad >= 300) {
            throw new excepcionValidar();
        } else {
            System.out.println("Hola");
            restarSaldo(cantidad);
        }
    }

    public void comprobarSaldo() {

    }

    private void restarSaldo(double cantidad){
        this.saldo -= cantidad;
        String p="hola";
        movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, cantidad, p));
    }

    public void sumarSaldo(double cantidad) {
        if (cantidad >= 10) {
            this.saldo += cantidad;
        } else {
            System.out.println("El ingreso mínimo es de 10 euros");
        }

    }

    @Override
    public String toString() {
        return "CuentaCorriente []" +super.toString();
    }

  

    

}
