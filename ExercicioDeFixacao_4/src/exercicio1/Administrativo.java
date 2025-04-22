package exercicio1;

public class Administrativo extends Assistente{
    private boolean turno;

    public Administrativo(String nome, double sal, int mat, boolean turno){
        super(nome, sal, mat);
        this.turno = turno;
    }

    public double ganhoAnual(double bonus){
        double res;

        if(turno){
            res = (super.getSalario() + bonus)*12;
        }
        else{
            res = super.getSalario()*12;
        }

        return res;
    }

    public String exibeDados(double valor){
        return "Nome: " + super.getNome() + "\nSalario: R$" + super.getSalario() + "\nGanho Anual: R$" + ganhoAnual(valor) + "\nMatricula: " + super.getMatricula() + "\n";
    }
}
