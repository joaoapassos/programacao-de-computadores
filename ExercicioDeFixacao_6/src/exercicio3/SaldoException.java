package exercicio3;

public class SaldoException extends Exception{
    public SaldoException(){
        super("Tentativa de sacar saldo insuficiente");
    }

    public SaldoException(String msg){
        super(msg);
    }

    @Override
    public String toString(){
        return "Saldo insuficiente";
    }
}
