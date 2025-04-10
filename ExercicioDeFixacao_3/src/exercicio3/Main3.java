package exercicio3;

/**
 * 
 * @author joaoapassos
 */

public class Main3 {

    public static void main(String[] args) {
        Conta conta = new Conta(123456, 1500);
        
        System.out.println(conta.getNumero() + "\n" + conta.getSaldo());
        
        conta.Extrato();
        System.out.println("\n\n");
        conta.saque(150);
        
        conta.Extrato();
        System.out.println("\n\n");
        conta.deposito(200.80f);
        System.out.println("\n\n");
        conta.Extrato();
    }

}
