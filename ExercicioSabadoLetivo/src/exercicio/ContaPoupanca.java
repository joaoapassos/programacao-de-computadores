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
        if(temSaldoSuficiente(valor)){
            super.debitar(valor);
            System.out.println("Saque feito no valor de: R$" + valor);
            AddRegistro("Saque", valor);
        } else {
            SaldoInsuficienteException(0);
        }
    }

    @Override
    protected boolean temSaldoSuficiente(double valor){

        if(valor <= getSaldo()) return true;
        
        return false;
    }
}
