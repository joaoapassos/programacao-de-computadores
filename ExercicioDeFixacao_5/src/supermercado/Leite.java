package supermercado;

public class Leite extends Produto{
    private int qtdDValid;

    public Leite(String nome, double preco, int qtdDValid){
        super(nome, preco);
        this.qtdDValid = qtdDValid;
    }

    @Override
    public int compareTo(Produto other) {
        int nameComparison = this.getNome().compareTo(other.getNome());
        if (nameComparison != 0) return nameComparison;
    
        int precoComparison = Double.compare(this.getPreco(), other.getPreco());

        if(precoComparison != 0) return precoComparison;

        if (other instanceof Leite) {
            return Double.compare(this.precoPlusFeature(), ((Leite) other).precoPlusFeature());
        } else {
            return 0;
        }

    }

    @Override
    protected double precoPlusFeature(){
        return this.getPreco() / this.qtdDValid;
    }

    public String getNome() {
        return super.getNome();
    }
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public String toString() {
        return super.toString() + " ; " + qtdDValid;
    }
}
