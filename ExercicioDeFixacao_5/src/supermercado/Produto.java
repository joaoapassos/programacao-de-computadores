package supermercado;

public abstract class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    protected double precoPlusFeature(){return 0;}

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return this.nome + "; R$" + this.preco;
    }
}
