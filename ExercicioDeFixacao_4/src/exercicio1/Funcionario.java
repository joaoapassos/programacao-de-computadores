package exercicio1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){}

    public Funcionario(String nome, double sal){
        this.nome = nome;
        this.salario = sal;
    }

    public double addAumento(double valor){
        this.salario += valor;
        return this.salario;
    }

    public double ganhoAnual(){
        return this.salario*12;
    }

    public String exibeDados(){
        return "Nome: " + this.nome + "\nSalario: R$" + this.salario + "\n\nGanho Anual: R$" + ganhoAnual();
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
