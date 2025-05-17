package exercicio;
public class ContaPoupanca extends ContaBancaria{
    ContaPoupanca(int n, String a, double s){
        super(n, a, s);
    }

    @Override
    protected double calcularTarifaMensal(){
        return 0;
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
