package controleprodutos;

public interface IProdutoFabricado extends IProduto{

    public int getNumeroIngredientes();
    IProduto getIngredientes(int numero);
    
}
