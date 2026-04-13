package src.BancoCliente;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBanco {
    protected int id;
    protected double saldo;
    protected ClienteBnaco c;
    protected List<Movimiento> movimientos;

    public CuentaBanco(int id, double saldo, ClienteBnaco c) {
        this.id = id;
        this.saldo = saldo;
        this.c = c;
        movimientos = new ArrayList<Movimiento>();

    }

    public abstract void retirarDinero(double cantidad) throws excepcionValidar;

    public abstract void ingresarDinero(double cantidad);

    public abstract void validarSaldo(double cantidad) throws excepcionValidar;

    public abstract void comprobarSaldo();

    @Override
    public String toString() {
         return "\n--- Cuenta Banco ---" +
           "\nID: " + id +
           "\nCliente: " + c +
           "\nSaldo: " + saldo +
           "\n---------------------";
    }

    protected class Movimiento {
        private LocalDateTime fechaHora;
        private double importe;
        private double saldoFinal;
        private String tipo;

        public Movimiento(LocalDateTime fechaHora, double importe, double saldoFinal, String tipo) {
            this.fechaHora = fechaHora;
            this.importe = importe;
            this.saldoFinal = saldoFinal;
            this.tipo = tipo;
        }

        public LocalDateTime getFechaHora() {
            return fechaHora;
        }

        public void setFechaHora(LocalDateTime fechaHora) {
            this.fechaHora = fechaHora;
        }

        public double getImporte() {
            return importe;
        }

        public void setImporte(double importe) {
            this.importe = importe;
        }

        public double getSaldoFinal() {
            return saldoFinal;
        }

        public void setSaldoFinal(double saldoFinal) {
            this.saldoFinal = saldoFinal;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return "\n--- Movimiento ---" +
                    "\nFecha: " + fechaHora +
                    "\nTipo: " + tipo +
                    "\nImporte: " + importe + "€" +
                    "\nSaldo final: " + saldoFinal + "€" +
                    "\n------------------";
        }

    }

}
