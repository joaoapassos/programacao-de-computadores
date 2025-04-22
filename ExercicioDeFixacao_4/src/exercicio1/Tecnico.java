package exercicio1;

public class Tecnico extends Assistente{

    public Tecnico(String nome, double sal, int mat){
        super(nome, sal, mat);
    }

    public double ganhoAnual(double bonus){
        return (super.getSalario() + bonus)*12;
    }

    public String exibeDados(double valor){
        return "Nome: " + super.getNome() + "\nSalario: R$" + super.getSalario() + "\nGanho Anual: R$" + ganhoAnual(valor) + "\nMatricula: " + super.getMatricula() + "\n";
    }
}
