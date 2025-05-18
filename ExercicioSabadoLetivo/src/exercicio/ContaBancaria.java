package exercicio;

import java.util.ArrayList;

public abstract class ContaBancaria extends Banco implements Exception{
    private int numero;
    private String agencia;
    private double saldo;
    private RegistroOperacoes Registro = new RegistroOperacoes();
    private Log log;

    ContaBancaria(int n, String a, double s){
        this.numero = n;
        this.agencia = a;
        this.saldo = s;
    }


    protected void depositar(double valor){
        if(valor > 0){
            AddRegistro("Deposito", valor);
            creditar(valor);
        }
    }

    protected void sacar(double valor){}

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void consultarSaldo(){
        System.out.println("\nSaldo: R$" + this.saldo);
    }

    protected void aplicarTarifa(double politicaTarifa){

        double tarifa = ((politicaTarifa == 0) ? calcularTarifaMensal() : politicaTarifa);
        this.saldo = this.saldo - tarifa;

        AddRegistro("Aplicação de Tarifa", tarifa);
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

    public void AddRegistro(String type, double valor){
        NewLog(type, valor);
        Registro.AddRegistro(log);
    }
    public void RemoveRegistro(Log log){
        Registro.RemoveRegistro(log);
    }
    public void ImprimirExtrato(){
        System.out.println(Registro.GetAllRegistros());
    }

    public Log NewLog(String type, double valor){
        log = new Log(type, valor);

        return log;
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

     @Override
    public void ValorInvalidoException(int i){
        String[] mensagem = {
            "Valor baixo para saque, valor minimo: R$100"
        };
        
        System.out.println(mensagem[i]);
    }
    @Override
    public void SaldoInsuficienteException(int i){
        String[] mensagem = {
            "Saldo insuficiente para Saque.", 
            "Saldo insuficiente para transferência."
        };
        
        System.out.println(mensagem[i]);
    }
    @Override
    public void LimitSaldoException(int i){
        String[] mensagem = {
            "Limite de saldo atingido, nenhum valor adicionado"
        };
        
        System.out.println(mensagem[i]);
    }
}
