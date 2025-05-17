public class main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento(5);

        estacionamento.addVeiculo(new Carro("123", "abc", "Carro", 15, 4));
        estacionamento.addVeiculo(new Carro("321", "cba", "Carro", 17, 2));
        estacionamento.addVeiculo(new Moto("456", "erd", "Moto", 12, 10));
        estacionamento.addVeiculo(new Caminhao("987", "urf", "Caminhao", 13, 2000));
        estacionamento.addVeiculo(new Caminhao("789", "our", "Caminhao", 8, 1500));

        estacionamento.relatorioVeiculos();

        estacionamento.removeVeiculo("123", 19);
        estacionamento.removeVeiculo("987", 8);

        estacionamento.relatorioVeiculos();
        
    }
}