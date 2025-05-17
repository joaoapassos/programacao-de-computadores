package exercicio;
public class ContaUniversitaria extends ContaBancaria implements Transferencia{
    ContaUniversitaria(int n, String a, double s){
        super(n, a, (s>5000.0f) ? 5000.0f : s);
    }

    @Override
    protected void depositar(double valor){
        if(valor + super.getSaldo() > 5000.0f){
            valor = 0;
            System.out.println("Limite de saldo atingido, nenhum valor adicionado");
        }

        super.depositar(valor);
    }

    @Override
    protected double calcularTarifaMensal(){
        return 5;
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
