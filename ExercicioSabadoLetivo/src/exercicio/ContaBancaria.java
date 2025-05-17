package exercicio;
public abstract class ContaBancaria extends Banco{
    private int numero;
    private String agencia;
    private double saldo;

    ContaBancaria(int n, String a, double s){
        this.numero = n;
        this.agencia = a;
        this.saldo = s;
    }


    protected void depositar(double valor){
        if(valor > 0){
            double tarifa = calcularTarifaMensal();
            valor = aplicarTarifa(tarifa, valor);
            creditar(valor);
        }
    }

    protected void sacar(double valor){
        debitar(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void consultarSaldo(){
        System.out.println("\nSaldo: R$" + this.saldo);
    }

    protected double aplicarTarifa(double tarifa, double valor){
        return valor - tarifa;
    }

    protected void creditar(double valor) {
        this.saldo += valor;
    }

    protected void debitar(double valor) {
        this.saldo -= valor;
    }
    
    public String toString(){
        return "\nNumero: " + this.numero + "\nAgencia: " + this.agencia + "\nSaldo: R$" + this.saldo;
    }

    protected abstract double calcularTarifaMensal();

    protected abstract boolean temSaldoSuficiente(double valor);

    public static void RelatorioContas(ContaBancaria[] contas){
        for(int i = 0; i < contas.length; i++){
            System.out.println("\nConta " + i + ":");
            if(contas[i] instanceof ContaCorrente){
                System.out.println("Conta Corrente");
                System.out.println(contas[i].getSaldo());
                System.out.println(contas[i].calcularTarifaMensal());
            }
            else if(contas[i] instanceof ContaPoupanca){
                System.out.println("Conta Poupanca");
                System.out.println(contas[i].getSaldo());
                System.out.println(contas[i].calcularTarifaMensal());
            }
            else if(contas[i] instanceof ContaUniversitaria){
                System.out.println("Conta Universitaria");
                System.out.println(contas[i].getSaldo());
                System.out.println(contas[i].calcularTarifaMensal());
            }
            else if(contas[i] instanceof ContaEmpresarial){
                System.out.println("Conta Empresarial");
                System.out.println(contas[i].getSaldo());
                System.out.println(contas[i].calcularTarifaMensal());
            }
        }
    }

    //protected abstract boolean SaldoInsuficienteException(double valor);
    //protected abstract boolean ValorInvalidoException(double valor);
}
