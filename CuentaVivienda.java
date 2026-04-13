package src.BancoCliente;

import java.time.LocalDateTime;

public class CuentaVivienda extends CuentaBanco {

    public CuentaVivienda(int id, ClienteBnaco c) {
        super(id, 1000, c);

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
        if (cantidad > this.saldo || cantidad >= 500) {
            throw new excepcionValidar();
        } else {
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
            return "\n=== Cuenta Vivienda ===\n" +
           super.toString() +
           "\n========================";
    }

}
