package exercicio1;

/**
 * @author joaoapassos  
 */

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Camila", 1000);
        Assistente as = new Assistente("Rodrigo", 1000, 0001);
        Tecnico t = new Tecnico("Cristian", 1000, 0002);
        Administrativo ad1 = new Administrativo("Rosa", 1000, 0003, false);
        Administrativo ad2 = new Administrativo("Clara", 1000, 0004, true);

        System.out.println(f.exibeDados());
        System.out.println("Aumento de salario da Camila: R$100");
        f.addAumento(100);
        System.out.println(f.exibeDados());

        System.out.println("\n\n");

        System.out.println(as.exibeDados());
        System.out.println("Aumento de salario da Rodrigo: R$100");
        as.addAumento(100);
        System.out.println(as.exibeDados());

        System.out.println("\n\n");

        System.out.println(t.exibeDados());
        System.out.println("Aumento de salario da Cristian: R$100");
        t.addAumento(100);
        System.out.println(t.exibeDados());
        System.out.println("Como bonus salarial: ");
        System.out.println(t.exibeDados(100));

        System.out.println("\n\n");

        System.out.println(ad1.exibeDados());
        System.out.println("Aumento de salario da Rosa: R$100");
        ad1.addAumento(100);
        System.out.println(ad1.exibeDados());
        System.out.println("Como bonus salarial: ");
        System.out.println(ad1.exibeDados(100));

        System.out.println("\n\n");

        System.out.println(ad2.exibeDados());
        System.out.println("Aumento de salario da Clara: R$100");
        ad2.addAumento(100);
        System.out.println(ad2.exibeDados());
        System.out.println("Como bonus salarial: ");
        System.out.println(ad2.exibeDados(100));
    }
}
