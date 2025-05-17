public class Carro extends Veiculo{
    private int qtdPortas;

    public Carro(String placa, String modelo, String tipo, int horaEntrada, int qtdPortas){
        super(placa, modelo, tipo, horaEntrada);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }
    @Override
    public String getPlaca() {
        return super.getPlaca();
    }
    @Override
    public String getModelo() {
        return super.getModelo();
    }
    @Override
    public String getTipo() {
        return super.getTipo();
    }
    @Override
    public int getHoraEntrada() {
        return super.getHoraEntrada();
    }

    @Override
    public int calcularTaxa(){
        return 10;
    }

    public String toString(){
        return "Placa: " + this.getPlaca() + ", Modelo: " + this.getModelo() + ", Tipo: " + this.getTipo() + ", Hora de Entrada: " + this.getHoraEntrada() + "h, Quantidade de Portas: " + this.qtdPortas;
    }



}
