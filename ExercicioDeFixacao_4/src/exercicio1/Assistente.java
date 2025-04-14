package exercicio1;

public class Assistente extends Funcionario{
    private int matricula;

    public Assistente(String nome, double sal, int mat){
        super(nome, sal);
        this.matricula = mat;
    }

    public void setMatricula(int mat){
        this.matricula = mat;
    }
    @Override public void setNome(String nome){
        super.setNome(nome);
    }
    @Override public void setSalario(double salario){
        super.setSalario(salario);
    }

    public int getMatricula(){
        return this.matricula;
    }

    @Override public String getNome(){
        return super.getNome();
    }
    @Override public double getSalario(){
        return super.getSalario();
    }

    @Override public String exibeDados(){
        return super.exibeDados() + "\nMatricula: " + this.matricula;
    }
}
