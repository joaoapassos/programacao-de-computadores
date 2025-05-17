public class Estacionamento {
    private Veiculo[] veiculos;
    private int qtdVeiculos;
    private float faturamento;

    public Estacionamento(int limiteVagas){
        veiculos = new Veiculo[limiteVagas];
        qtdVeiculos = 0;
        faturamento = 0;
    }

    public void addVeiculo(Veiculo veiculo){
        if(qtdVeiculos < veiculos.length){
            veiculos[qtdVeiculos] = veiculo;
            qtdVeiculos++;
        }
        else{
            System.out.println("Limite de vagas atingido");
        }
    }

    float calcularValorTotalSerPago(int index, int horaPartida){
        if(horaPartida < veiculos[index].getHoraEntrada()){
            horaPartida += 24;
        }

        int tempo = horaPartida - veiculos[index].getHoraEntrada();
        float desconto;
        if(tempo  > 12){
            desconto = 0.2f;
        }
        else if(tempo > 6){
            desconto = 0.1f;
        }
        else{
            desconto = 0;
        }
        return aplicarDesconto(tempo * veiculos[index].calcularTaxa(), desconto);
    }

    float aplicarDesconto(float valorTotal, float desconto){   
        return valorTotal - (valorTotal*desconto);
    }


    public void removeVeiculo(String placa, int horaPartida){
        int index = buscarVeiculo(placa);
        float valor = calcularValorTotalSerPago(index, horaPartida);
        resumoFaturamento(valor);

        for(int i = index; i < qtdVeiculos - 1; i++){
            veiculos[i] = veiculos[i+1];
        }
        veiculos[qtdVeiculos - 1] = null;
        qtdVeiculos--;
    }

    void resumoFaturamento(float valor){
        this.faturamento += valor;
    }

    int buscarVeiculo(String placa){
        int res = 0;
        for(int i = 0; i < qtdVeiculos; i++){
            if(veiculos[i].getPlaca().equals(placa)){
                res = i;
            }
        }
        return res;
    }

    void relatorioVeiculos(){
        System.out.println("\nRelatorio:\n");
        for(int i = 0; i<qtdVeiculos; i++){
            System.out.println("\t" + veiculos[i].toString());
        }
        System.out.println("\n\tValor a ser pago: " + this.faturamento);
    }
}
