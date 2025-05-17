package exercicio;
public class ContaCorrente extends ContaBancaria implements Transferencia, Pagamento{

    ContaCorrente(int n, String a, double s){
        super(n, a, s);
    }

    @Override
    protected double calcularTarifaMensal(){
        return 15;
    }

    @Override
    public void transfirir(ContaBancaria destino, double valor){
        double tarifa = calcularTarifaMensal();
        double total = valor + tarifa;
        
        if(temSaldoSuficiente(total)){
            super.debitar(total);
            destino.depositar(valor);
            System.out.println("Transferência: R$" + valor + " | Tarifa: R$" + tarifa);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    @Override
    public void pagarBoleto(String codigo, double valor){
        valor += 2;
        if(temSaldoSuficiente(valor)){
            super.debitar(valor);
            System.out.println("Codigo: " + codigo + "\nValor Debitado: R$" + (valor-2) + " + Tarifa cobrada de: R$" + 2);
        }
    }

    @Override
    public void sacar(double valor){
        double tarifa = calcularTarifaMensal();
        double total = valor + tarifa;
        if(temSaldoSuficiente(total)){
            super.debitar(total);
            System.out.println("Saque feito no valor de: R$" + valor + "+ Tarifa cobrada de: R$" + tarifa);
        } else {
            System.out.println("Saldo insuficiente para Saque.");
        }
    }

    @Override
    protected boolean temSaldoSuficiente(double valor){

        if(valor <= getSaldo()) return true;
        
        return false;
    }
}
