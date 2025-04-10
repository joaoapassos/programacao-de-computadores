package exercicio3;

public class Conta {
    private int numero;
    private float saldo;

    Conta(int numero, float saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public void setNumero(int num) {
        this.numero = num;
    }
    public void getSaldo(float num) {
        this.saldo = num;
    }

    void Extrato(){
        System.out.println("Numero da conta: " + this.numero + "\nSaldo da conta: " + this.saldo);
    }

    void saque(float valor){
        this.saldo -= valor;
    }
    
    void deposito(float valor){
        this.saldo += valor;
    }
    
}
