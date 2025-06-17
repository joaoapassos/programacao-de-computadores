package supermercado;

public class Biscoito extends Produto{
    private int qtdCompCancer;

    public Biscoito(String nome, double preco, int qtdCompCancer){
        super(nome, preco);
        this.qtdCompCancer = qtdCompCancer;
    }

    @Override
    public int compareTo(Produto other) {
        int nameComparison = this.getNome().compareTo(other.getNome());
        if (nameComparison != 0) return nameComparison;
    
        int precoComparison = Double.compare(this.getPreco(), other.getPreco());

        if(precoComparison != 0) return precoComparison;

        if (other instanceof Biscoito) {
            return Double.compare(this.precoPlusFeature(), ((Biscoito) other).precoPlusFeature());
        } else {
            return 0;
        }

    }

    @Override
    protected double precoPlusFeature(){
        return this.getPreco() * this.qtdCompCancer;
    }

    public String getNome() {
        return super.getNome();
    }
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public String toString() {
        return super.toString() + " ; " + qtdCompCancer;
    }
}
