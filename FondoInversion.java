package src.BancoCliente;

public class FondoInversion extends CuentaBanco {

    public FondoInversion(int id, ClienteBnaco c) {
        super(id, 5000, c);
    }

    public void retirarDinero(double cantidad) throws excepcionValidar {
        if (this.saldo >= 3000) {
            validarSaldo(cantidad);
        }

    }

    public void ingresarDinero(double cantidad) {
        sumarSaldo(cantidad);
    }

    public void validarSaldo(double cantidad) throws excepcionValidar {
        if (cantidad < this.saldo && cantidad <= 500) {
            throw new excepcionValidar();
        } else {
            restarSaldo(cantidad);
        }
    }

    public void comprobarSaldo() {

    }

    private void restarSaldo(double cantidad) throws excepcionValidar {
        if ((this.saldo - cantidad) >= 3000) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Te queda por debajo de los 3000");
        }

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
        return "CuentaCorriente []" + super.toString();
    }

}
