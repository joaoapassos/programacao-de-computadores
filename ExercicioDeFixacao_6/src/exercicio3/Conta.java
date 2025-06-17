package exercicio3;

public class Conta {
    double saldo;

    Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    void sacar(double valor) throws SaldoException{
        if(valor>this.saldo){
            throw new SaldoException();
        }
        else this.saldo -= valor;
    }

    void depositar(double valor){
        this.saldo += valor;
    }
    public static void main(String[] args) {
        Conta c = new Conta(500);

        try{
            c.sacar(600);
        }
        catch(SaldoException e){
            System.out.println("\nMensagem de erro: " + e.getMessage());
        }

        System.out.println("Saldo: " + c.saldo);

    }
}
