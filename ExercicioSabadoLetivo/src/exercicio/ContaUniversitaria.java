package exercicio;
public class ContaUniversitaria extends ContaBancaria implements Transferencia{
    ContaUniversitaria(int n, String a, double s){
        super(n, a, (s>5000.0f) ? 5000.0f : s);
    }

    @Override
    protected void depositar(double valor){
        if(valor + super.getSaldo() > 5000.0f){
            valor = 0;
            LimitSaldoException(0);
        }

        super.depositar(valor);
    }

    @Override
    protected double calcularTarifaMensal(){
        return 5;
    }

    @Override
    public void transfirir(ContaBancaria destino, double valor){
        if(temSaldoSuficiente(valor)){
            super.debitar(valor);
            destino.depositar(valor);
            System.out.println("Transferência: R$" + valor);
            AddRegistro("Transferencia", valor);
        } else {
            SaldoInsuficienteException(1);
        }
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
