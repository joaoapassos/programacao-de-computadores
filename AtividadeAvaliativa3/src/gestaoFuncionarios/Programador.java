package gestaoFuncionarios;

public class Programador extends Funcionario implements Imprimivel{
    
    public Programador(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    public double calcularSalarioFinal(){
        return super.getSalarioBase() * 0.20 + super.getSalarioBase();
    }

    public void imprimirDados(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Programador - " + getNome() + "- R$ " + getSalarioBase() + " - R$ " + calcularSalarioFinal();
    }
}
