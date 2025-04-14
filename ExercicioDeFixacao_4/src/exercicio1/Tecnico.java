package exercicio1;

public class Tecnico extends Assistente{

    public Tecnico(String nome, double sal, int mat){
        super(nome, sal, mat);
    }

    public double ganhoAnual(double bonus){
        return super.ganhoAnual() + bonus;
    }
}
