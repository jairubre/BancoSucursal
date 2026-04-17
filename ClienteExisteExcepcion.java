package src.BancoCliente;

public class ClienteExisteExcepcion extends Exception {
    ClienteBnaco c;

    public ClienteExisteExcepcion(ClienteBnaco c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "El cliente " + c + " ya esta repetido";
    }

   
    
    
}
