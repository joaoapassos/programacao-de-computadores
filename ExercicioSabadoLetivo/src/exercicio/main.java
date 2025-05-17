package exercicio;
public class main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, "0001", 1000);
        ContaPoupanca cp = new ContaPoupanca(2, "0002", 1000);
        ContaUniversitaria cu = new ContaUniversitaria(3, "0003", 1000);
        ContaEmpresarial ce = new ContaEmpresarial(4, "0004", 1000);
        // System.out.println(cc.toString());
        // System.out.println(cp.toString());
        // System.out.println(cu.toString());

        // cc.depositar(100);
        // cp.depositar(100);
        // cu.depositar(100);

        // System.out.println(cc.toString());
        // System.out.println(cp.toString());
        // System.out.println(cu.toString());
        
        // cu.depositar(5000);
        
        // System.out.println(cu.toString());
        
        // cc.transfirir(ce, 100);
        
        // System.out.println(cc.toString());
        // System.out.println(ce.toString());
        // ContaBancaria[] contas = { cc, cp, cu, ce }; 
        
        // ContaBancaria.RelatorioContas(contas);

    
        System.out.println(cc.toString());
        System.out.println(cu.toString());
        
        Banco.realizarTransferencia(cc, cu, 100);


        System.out.println(cc.toString());
        System.out.println(cu.toString());
        
    }
}
