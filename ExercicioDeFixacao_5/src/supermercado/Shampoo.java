package supermercado;

public class Shampoo extends Produto{
    private int irritabilidade;

    public Shampoo(String nome, double preco, int irritabilidade){
        super(nome, preco);
        this.irritabilidade = irritabilidade;
    }

    @Override
    public int compareTo(Produto other) {
        int nameComparison = this.getNome().compareTo(other.getNome());
        if (nameComparison != 0) return nameComparison;
    
        int precoComparison = Double.compare(this.getPreco(), other.getPreco());

        if(precoComparison != 0) return precoComparison;

        if (other instanceof Shampoo) {
            return Double.compare(this.precoPlusFeature(), ((Shampoo) other).precoPlusFeature());
        } else {
            return 0;
        }

    }

    @Override
    protected double precoPlusFeature(){
        return this.getPreco() * this.irritabilidade;
    }

    public String getNome() {
        return super.getNome();
    }
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public String toString() {
        return super.toString() + " ; " + irritabilidade;
    }
}
