package gestaoFuncionarios;

public class Designer extends Funcionario implements Imprimivel{
    public Designer(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    public double calcularSalarioFinal(){
        return super.getSalarioBase() * 1.10 + super.getSalarioBase();
    }

    public void imprimirDados(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Designer - " + getNome() + "- R$ " + getSalarioBase() + " - R$ " + calcularSalarioFinal();
    }
}
