package exercicio1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){}

    public Funcionario(String nome, double sal){
        this.nome = nome;
        this.salario = sal;
    }

    public void addAumento(double valor){
        this.salario += valor;
    }

    public double ganhoAnual(){
        return this.salario*12;
    }

    public String exibeDados(){
        return "Nome: " + this.nome + "\nSalario: R$" + this.salario + "\nGanho Anual: R$" + ganhoAnual() + "\n";
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double sal){
        this.salario = sal;
    }

    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
}
