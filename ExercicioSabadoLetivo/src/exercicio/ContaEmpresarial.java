package exercicio;

public class ContaEmpresarial extends ContaBancaria implements Transferencia, Pagamento{
    
    ContaEmpresarial(int n, String a, double s){
        super(n, a, s);
    }

    @Override
    protected double calcularTarifaMensal(){
        return 30;
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
    public void pagarBoleto(String codigo, double valor){
        valor += 2;
        if(temSaldoSuficiente(valor)){
            super.debitar(valor);
            System.out.println("Codigo: " + codigo + "\nValor Debitado: R$" + (valor-2) + " + Tarifa cobrada de: R$" + 2);
            AddRegistro("Pagar Boleto", valor);
        }
    }

    @Override
    public void sacar(double valor){

        if(!temSaldoSuficiente(valor)) SaldoInsuficienteException(0);
        else if(valor > 100) {
            super.debitar(valor);
            System.out.println("Saque feito no valor de: R$" + valor);
            AddRegistro("Saque", valor);
        }
        else ValorInvalidoException(0);

    }

    @Override
    protected boolean temSaldoSuficiente(double valor){

        if(valor <= getSaldo()) return true;
        
        return false;
    }
}

