package exercicio;

public abstract class Banco{

    public static void realizarTransferencia(Transferencia origem, ContaBancaria destino, double valor){
        if(origem instanceof ContaPoupanca){
            System.out.println("Conta Poupanca nao possui a interface 'Transferencia'");
        }
        else origem.transfirir(destino, valor);
    }

    public static void realizarPagamento(Pagamento conta, String codigo, double valor){
        if(conta instanceof ContaPoupanca && conta instanceof ContaUniversitaria){
            System.out.println("Conta Poupanca nao possui a interface 'Pagamento'");
        }
        else conta.pagarBoleto(codigo, valor);
    }


    
}
