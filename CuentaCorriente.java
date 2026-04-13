package src.BancoCliente;

import java.time.LocalDateTime;

public class CuentaCorriente extends CuentaBanco {

    public CuentaCorriente(int id, ClienteBnaco c) {
        super(id, 0, c);
    }

    public void retirarDinero(double cantidad) throws excepcionValidar {
        validarSaldo(cantidad);
    }

    public void ingresarDinero(double cantidad) throws excepcionValidar {
        if (cantidad <= 0) {
            throw new excepcionValidar();
        } else {
            sumarSaldo(cantidad);
        }

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

    private void restarSaldo(double cantidad) {
        this.saldo -= cantidad;
        movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, saldo, "Retiro"));
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
        return "\n=== Cuenta Corriente ===\n" +
                super.toString() +
                "\n========================";
    }

}
